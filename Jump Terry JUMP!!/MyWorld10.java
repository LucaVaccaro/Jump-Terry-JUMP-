import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld10 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld10.
     * 
     */
    public MyWorld10()
    {    
        super(); 
        prepare();
    }
    public MyWorld10(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld9(player.getX(), 0, player));
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

        Ground ground = new Ground();
        addObject(ground,579,330);
        Ground ground2 = new Ground();
        addObject(ground2,451,330);
        ground2.setLocation(457,330);
        Ground ground3 = new Ground();
        addObject(ground3,335,330);
        Ground ground4 = new Ground();
        addObject(ground4,207,330);
        Ground ground5 = new Ground();
        addObject(ground5,82,330);
        Ground ground6 = new Ground();
        addObject(ground6,15,330);
    }
        
}
