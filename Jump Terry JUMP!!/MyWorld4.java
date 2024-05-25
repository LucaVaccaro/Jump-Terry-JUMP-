import greenfoot.*;  

/**
 * Write a description of class MyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld4 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld4.
     * 
     */
    public MyWorld4()
    {    
        super(); 
        prepare();
    }
    public MyWorld4(int x , int y, Player p)
    {    
        super(x,y,p); 
        prepare();
    }
    public void act()
    {
        checkPlayerPosition();
    }
     public void checkPlayerPosition()
    {
        if (player.getY() >= getHeight() - 10 && player.getVerticalVelocity() >= 0)
        {   
            Greenfoot.setWorld(new MyWorld3(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld5(player.getX(), getHeight() - 10, player));
            deactivatePowerUp();
        }
        
    }
    
    public void deactivatePowerUp() {
        if (player != null && player.getMaxJumpStrength() > Player.MAX_JUMP_STRENGTH) {
            player.setMaxJumpStrength(Player.MAX_JUMP_STRENGTH);
            if (getObjects(PowerUpIndicator.class).size() > 0) {
                removeObjects(getObjects(PowerUpIndicator.class));
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ladder ladder = new Ladder();
        addObject(ladder,93,282);
        Ladder ladder2 = new Ladder();
        addObject(ladder2,327,282);
        Ladder ladder3 = new Ladder();
        addObject(ladder3,548,282);
        JumpPowerUp jumpPowerUp = new JumpPowerUp();
        addObject(jumpPowerUp,544,197);
        jumpPowerUp.setLocation(553,202);

        ladder2.setLocation(304,282);
        ladder3.setLocation(538,282);

        jumpPowerUp.setLocation(529,202);
        boxPlatform boxPlatform = new boxPlatform();
        addObject(boxPlatform,579,353);
    }
        
}
