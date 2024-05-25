import greenfoot.*;  

/**
 * Write a description of class PowerUpSimulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpSimulator extends Actor
{
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
    }
    
    public void PowerUp()
    {
        
    }
    public void PowerDown()
    {
        
    }
}
