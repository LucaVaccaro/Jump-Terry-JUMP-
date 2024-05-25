import greenfoot.*; 

/**
 * Write a description of class MyWorld9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld9 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld9.
     * 
     */
    public MyWorld9()
    {    
        super(); 
        prepare();
    }
    public MyWorld9(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld8(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld10(player.getX(), getHeight() - 10, player));
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

        metalPlatform metalPlatform = new metalPlatform();
        addObject(metalPlatform,241,309);
        metalPlatform.setLocation(202,326);
        metalPlatform metalPlatform2 = new metalPlatform();
        addObject(metalPlatform2,532,160);
        metalPlatform metalPlatform3 = new metalPlatform();
        addObject(metalPlatform3,137,64);
        metalPlatform2.setLocation(494,188);
        metalPlatform2.setLocation(512,204);
    }
        
}
