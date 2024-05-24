import greenfoot.*;

public class JumpPowerUp extends PowerUpSimulator
{
    private Player player;
    private GreenfootImage indicatorImage; // Image for the indicator
    

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
        GreenfootImage image = new GreenfootImage("Soda_power_up.png"); // Assuming "jump_powerup.png" is the image file for the power-up
        setImage(image);
        indicatorImage = new GreenfootImage("walking_cane.png"); // Assuming "powerup_indicator.png" is the image file for the indicator

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
        }
    }
    
    private void showIndicator() {
        PowerUpIndicator indicator = new PowerUpIndicator(indicatorImage);
        getWorld().addObject(indicator, player.getX(), player.getY()); // Adjust the position of the indicator to the player's position
    }
}
