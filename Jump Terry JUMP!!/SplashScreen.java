import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 360, 1); 
        showText("420-141-VA GAME PROGRAMMING 1", getWidth()/2, 60);
        showText("Team Members: Sean Lussier, Luca Vaccaro, Andrew Godward, Dilpreet Singh", getWidth()/2, 85);
        showText("Press Space Bar or wait 3 seconds to start the game.", getWidth()/2, 110);
        prepare();
    }
    public void act()
    {
        Display display = new Display();
        addObject(display , 400, 300);

        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;

        display.setImage(new GreenfootImage("Timer Value :" + timerValue , 35, Color.WHITE, Color.BLACK, Color.YELLOW));

        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MainMenu()); 
        }

        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (3 * 1000)))
        {
            Greenfoot.setWorld(new MainMenu()); 
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo,405,197);
    }
}
