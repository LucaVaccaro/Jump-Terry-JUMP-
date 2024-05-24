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
        addObject(ground,106,310);
        Ground ground2 = new Ground();
        addObject(ground2,426,217);

        Ground ground3 = new Ground();
        addObject(ground3,26,382);
        Ground ground4 = new Ground();
        addObject(ground4,125,371);
        Ground ground5 = new Ground();
        addObject(ground5,199,389);
        Ground ground6 = new Ground();
        addObject(ground6,272,390);
        Ground ground7 = new Ground();
        addObject(ground7,361,367);
        Ground ground8 = new Ground();
        addObject(ground8,346,388);
        ground7.setLocation(355,374);
        Ground ground9 = new Ground();
        addObject(ground9,355,374);
        Ground ground10 = new Ground();
        addObject(ground10,426,379);
        Ground ground11 = new Ground();
        addObject(ground11,502,389);
        Ground ground12 = new Ground();
        addObject(ground12,581,382);
        Ground ground13 = new Ground();
        addObject(ground13,638,359);
        removeObject(ground);
        removeObject(ground2);
        Player player = new Player();
        addObject(player,111,323);
        removeObject(player);
        Ground ground14 = new Ground();
        addObject(ground14,426,236);
        ground14.setLocation(200,253);
        Ground ground15 = new Ground();
        addObject(ground15,200,253);
        ground15.setLocation(398,239);
        ground14.setLocation(243,261);
        ground15.setLocation(506,129);
        Ladder ladder = new Ladder();
        addObject(ladder,218,67);
        ladder.setLocation(211,68);
        ladder.setLocation(168,97);
        ground15.setLocation(552,147);
        ladder.setLocation(206,93);
        ladder.setLocation(206,88);
        ground14.setLocation(292,251);
        ladder.setLocation(216,108);
        ladder.setLocation(206,100);
        Ladder ladder2 = new Ladder();
        addObject(ladder2,206,100);
        ladder.setLocation(93,123);
        ladder.setLocation(227,76);
        ladder2.setLocation(1023,223);
        removeObject(ladder2);
        ladder.setLocation(166,8);
        ladder.setLocation(162,15);
        ladder.setLocation(164,17);
        ladder.setLocation(83,67);
        ladder.setLocation(73,75);
        ground14.setLocation(271,245);
        ladder.setLocation(77,90);
        ground14.setLocation(328,256);
        ground15.setLocation(463,114);
        ground14.setLocation(336,252);
        ladder.setLocation(116,72);
        ladder.setLocation(73,90);
        ground14.setLocation(267,302);
        ground15.setLocation(473,174);
        ladder.setLocation(58,116);
        JumpPowerUp jumpPowerUp = new JumpPowerUp();
        addObject(jumpPowerUp,472,129);
    }
}
