import greenfoot.*;

/**
 * Write a description of class MainMenu here.
 * 
 */
public class MainMenu extends World
{
    private static GreenfootSound mainMenuMusic;

    public MainMenu()
    {    
        super(640, 360, 1); 
        mainMenuMusic = new GreenfootSound("jazzPianoMedley.wav");  
        prepare();
        mainMenuMusic.playLoop(); 
    }
    
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton, 317, 198);
    }
    
    public static void stopMusic()
    {
        mainMenuMusic.stop();
    }
}
