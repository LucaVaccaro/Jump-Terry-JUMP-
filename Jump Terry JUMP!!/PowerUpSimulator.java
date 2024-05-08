import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpSimulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpSimulator extends Actor
{
    double timer = 0;
    Player player;
    /**
     * Act - do whatever the PowerUpSimulator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (player == null)
        {
            player = getWorld().getObjects(Player.class).get(0);
        }
        // After hitting the powerup 
        
        timer += 0.02;
        if (timer > 4 )
        {
            PowerDown();
            getWorld().removeObject(this);
        }
        else {
            PowerUp();
        }
    }
    
    public void PowerUp()
    {
        
    }
    public void PowerDown()
    {
        
    }
}
