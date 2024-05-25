import greenfoot.*;

public class MyWorld extends WorldTrackPlayer
{
    private GreenfootImage powerUpIndicatorImage;
    private Actor powerUpIndicator;
    private static GreenfootSound worldMusic;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(); 
        worldMusic = new GreenfootSound("lordOfDestruction.wav"); 
        prepare();
        worldMusic.playLoop();
    }
    public MyWorld(int x, int y, Player p )
    {    
        
        super(x,y,p); 
        prepare();
    }
    
    public static void stopMusic()
    {
        worldMusic.stop();
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
        
        if (player != null && player.getMaxJumpStrength() > Player.MAX_JUMP_STRENGTH) {
            player.setMaxJumpStrength(Player.MAX_JUMP_STRENGTH);
            
            if (powerUpIndicator != null) {
                removeObject(powerUpIndicator);
            }
        }
    }
    
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
