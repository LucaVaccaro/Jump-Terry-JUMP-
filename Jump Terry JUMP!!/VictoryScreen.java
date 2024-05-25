import greenfoot.*;  

/**
 * Write a description of class VictoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VictoryScreen extends World
{
    private static GreenfootSound victoryMusic;
    /**
     * Constructor for objects of class VictoryScreen.
     * 
     */
    public VictoryScreen()
    {    
        super(640, 360, 1); 
        showText("You Win!!", getWidth()/2, 60);
        showText("Press space to go back to the Main Menu.", getWidth()/2, 85);
        victoryMusic = new GreenfootSound("chubbyCatShort.wav");  
        victoryMusic.playLoop();
        prepare();
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MainMenu()); 
            victoryMusic.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TerryVictory terryVictory = new TerryVictory();
        addObject(terryVictory,153,260);
        Louise louise = new Louise();
        addObject(louise,429,260);
        terryVictory.setLocation(144,260);
        terryVictory.setLocation(206,260);
        louise.setLocation(427,260);
    }
}
