import greenfoot.*;

public class MyWorld extends WorldTrackPlayer
{
    private GreenfootImage powerUpIndicatorImage;
    private Actor powerUpIndicator;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
    }
    public MyWorld(int x, int y, Player p )
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,p); 
        prepare();
    }
    
    public void checkPlayerPosition()
    {
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld2(player.getX(), getHeight() - 10, player));
            deactivatePowerUp();
        }
    }
    
    public void deactivatePowerUp() {
        // Check if the player has a power-up and deactivate it if necessary
        if (player != null && player.getMaxJumpStrength() > Player.MAX_JUMP_STRENGTH) {
            player.setMaxJumpStrength(Player.MAX_JUMP_STRENGTH);
            // Optionally, remove the power-up indicator from the world
            if (powerUpIndicator != null) {
                removeObject(powerUpIndicator);
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ground ground = new Ground();
        addObject(ground,117,360);
        ground.setLocation(83,360);
        Ground ground2 = new Ground();
        addObject(ground2,184,360);
        Ground ground3 = new Ground();
        addObject(ground3,304,360);
        Ground ground4 = new Ground();
        addObject(ground4,425,360);
        Ground ground5 = new Ground();
        addObject(ground5,551,360);
        Ground ground6 = new Ground();
        addObject(ground6,630,360);
        Ground ground7 = new Ground();
        addObject(ground7,14,360);
        Player player = new Player();
        addObject(player,95,300);
        removeObject(player);
        JumpPowerUp jumpPowerUp = new JumpPowerUp();
        addObject(jumpPowerUp,278,318);
        pipePlatform pipePlatform = new pipePlatform();
        addObject(pipePlatform,134,189);
        metalPlatform metalPlatform = new metalPlatform();
        addObject(metalPlatform,610,261);
        metalPlatform metalPlatform2 = new metalPlatform();
        addObject(metalPlatform2,532,259);
        metalPlatform2.setLocation(528,148);
        pipePlatform.setLocation(53,120);
        metalPlatform2.setLocation(463,153);
        removeObject(metalPlatform2);
        removeObject(metalPlatform);
        pipePlatform.setLocation(121,128);
    }
}
