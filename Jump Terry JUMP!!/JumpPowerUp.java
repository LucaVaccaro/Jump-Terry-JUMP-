import greenfoot.*;

public class JumpPowerUp extends PowerUpSimulator
{
    private Player player;
    private GreenfootImage indicatorImage; 
    

    /**
     * Act - do whatever the JumpPowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void PowerUp()
    {
        player.maxJumpStrength = 24;
    }
    public JumpPowerUp() 
    {
        GreenfootImage image = new GreenfootImage("Soda_power_up.png"); 
        setImage(image);
        indicatorImage = new GreenfootImage("walking_cane.png"); 

    }
    
    public void act() 
    {
        checkCollision();
    }
    
    private void checkCollision() {
        if (isTouching(Player.class)) {
            applyPowerUp();
            getWorld().removeObject(this);
        }
    }
    
    public void applyPowerUp() {
        player = (Player)getOneIntersectingObject(Player.class);
        if (player != null) {
            player.setMaxJumpStrength(24);
            showIndicator();
            Greenfoot.playSound("powerUp.wav");
        }
    }
    
    private void showIndicator() {
        PowerUpIndicator indicator = new PowerUpIndicator(indicatorImage);
        getWorld().addObject(indicator, player.getX(), player.getY()); 
    }
}
