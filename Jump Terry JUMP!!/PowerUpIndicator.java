import greenfoot.*;

public class PowerUpIndicator extends Actor
{
    public PowerUpIndicator(GreenfootImage image) {
        setImage(image);
    }
    
    public void act() 
    {
        followPlayer();
    }
    
    private void followPlayer() {
        Actor player = getWorld().getObjects(Player.class).get(0);
        if (player != null) {
            setLocation(player.getX(), player.getY());  
        }
    }
}
