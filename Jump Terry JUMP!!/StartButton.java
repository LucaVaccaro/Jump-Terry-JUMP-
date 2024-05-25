import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Display
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this))
        {
            setImage("startButtonMouseOver.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("startButtonNoMouseOver.png");
        }

        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld()); 
            MainMenu.stopMusic();  
        }
        
        }
    }
