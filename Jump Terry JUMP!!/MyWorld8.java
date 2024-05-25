import greenfoot.*;  

/**
 * Write a description of class MyWorld8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld8 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld8.
     * 
     */
    public MyWorld8()
    {    
        super(); 
        prepare();
    }
    public MyWorld8(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld7(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld9(player.getX(), getHeight() - 10, player));
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

        Box box = new Box();
        addObject(box,102,291);
        Box box2 = new Box();
        addObject(box2,531,111);
    }
        
}
