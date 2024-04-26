import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends WorldTrackPlayer
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
    }
    public MyWorld(int x, int y, Player p )
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,p); 
        prepare();
    }
    
     public void checkPlayerPosition()
    {
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld2(player.getX(), getHeight() - 10, player));
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,106,310);
        Ground ground2 = new Ground();
        addObject(ground2,426,217);

        Ground ground3 = new Ground();
        addObject(ground3,26,382);
        Ground ground4 = new Ground();
        addObject(ground4,125,371);
        Ground ground5 = new Ground();
        addObject(ground5,199,389);
        Ground ground6 = new Ground();
        addObject(ground6,272,390);
        Ground ground7 = new Ground();
        addObject(ground7,361,367);
        Ground ground8 = new Ground();
        addObject(ground8,346,388);
        ground7.setLocation(355,374);
        Ground ground9 = new Ground();
        addObject(ground9,355,374);
        Ground ground10 = new Ground();
        addObject(ground10,426,379);
        Ground ground11 = new Ground();
        addObject(ground11,502,389);
        Ground ground12 = new Ground();
        addObject(ground12,581,382);
        Ground ground13 = new Ground();
        addObject(ground13,638,359);
    }
}
