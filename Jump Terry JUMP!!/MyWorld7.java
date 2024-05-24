import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld7 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld7.
     * 
     */
    public MyWorld7()
    {    
        super(); 
        prepare();
    }
    public MyWorld7(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld6(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld8(player.getX(), getHeight() - 10, player));
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

        pipePlatform pipePlatform = new pipePlatform();
        addObject(pipePlatform,540,63);
        pipePlatform.setLocation(564,53);
        pipePlatform.setLocation(113,63);
    }
        
}
