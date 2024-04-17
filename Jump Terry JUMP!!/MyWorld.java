import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
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
        Player player = new Player();
        addObject(player,95,240);
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
    }
}
