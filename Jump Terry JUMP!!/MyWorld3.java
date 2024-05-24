import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
    }
    public MyWorld3(int x , int y, Player p)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,p); 
        prepare();
    }
    public void act()
    {
        checkPlayerPosition();
    }
     public void checkPlayerPosition()
    {
        if (player.getY() >= getHeight() - 10 && player.getVerticalVelocity() >= 0)
        {   
            Greenfoot.setWorld(new MyWorld2(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld4(player.getX(), getHeight() - 10, player));
            deactivatePowerUp();
        }
    }
    
    public void deactivatePowerUp() {
        
        if (player != null && player.getMaxJumpStrength() > Player.MAX_JUMP_STRENGTH) {
            player.setMaxJumpStrength(Player.MAX_JUMP_STRENGTH);
            
            if (getObjects(PowerUpIndicator.class).size() > 0) {
                removeObjects(getObjects(PowerUpIndicator.class));
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

        ground2.setLocation(532,219);
        ground2.setLocation(516,212);
        ground2.setLocation(521,221);
        ground2.setLocation(482,219);
        ground2.setLocation(531,233);
        Ground ground3 = new Ground();
        addObject(ground3,422,222);
        ground3.setLocation(395,234);
        ground3.setLocation(397,231);
        Ground ground4 = new Ground();
        addObject(ground4,397,231);
        ground3.setLocation(232,230);
        ground3.setLocation(360,229);
        ground3.setLocation(380,227);
        ground3.setLocation(436,228);
        ground2.setLocation(511,231);
        ground3.setLocation(403,224);
        ground3.setLocation(370,224);
        ground.setLocation(121,301);
        ground3.setLocation(405,233);
        Ground ground5 = new Ground();
        addObject(ground5,176,100);
        ground5.setLocation(135,93);
        ground5.setLocation(104,88);
        removeObject(ground5);
        Ladder ladder = new Ladder();
        addObject(ladder,127,45);
        ladder.setLocation(611,56);
        ground4.setLocation(260,180);
        ground3.setLocation(397,217);
        ground4.setLocation(221,210);
        ground3.setLocation(392,180);
        ground2.setLocation(526,135);
        ground3.setLocation(354,180);
        ground2.setLocation(497,132);
        ground3.setLocation(399,259);
        ground4.setLocation(203,203);
        ground2.setLocation(522,159);
        ground4.setLocation(231,170);
        ground4.setLocation(223,184);
        removeObject(ground3);
        removeObject(ground4);
        removeObject(ground2);
        ground.setLocation(428,303);
        ladder.setLocation(68,125);
        removeObject(ladder);
        ground2.setLocation(140,126);;
        ground3.setLocation(523,46);
        ground2.setLocation(150,135);
        ground2.setLocation(79,152);
        ground3.setLocation(550,45);
        ladder.setLocation(318,126);
        ladder.setLocation(352,110);
        ladder.setLocation(386,111);
        ground2.setLocation(135,174);
        Ground ground6 = new Ground();
        addObject(ground6,146,162);
        ground6.setLocation(143,158);
        Ladder ladder2 = new Ladder();
        addObject(ladder2,372,128);
        ladder2.setLocation(384,131);
        Ground ground7 = new Ground();
        addObject(ground7,529,69);
        ground7.setLocation(516,78);
        ladder2.setLocation(413,127);
        ground6.setLocation(161,168);
        ladder2.setLocation(414,125);
        ground7.setLocation(542,63);
        ladder2.setLocation(428,100);
        ladder2.setLocation(447,86);
        ground7.setLocation(517,62);
        ladder2.setLocation(431,67);
        ladder2.setLocation(429,78);
        ground7.setLocation(514,51);
        ladder2.setLocation(421,108);
        ground6.setLocation(167,165);
        ladder2.setLocation(404,113);
        ladder2.setLocation(409,106);
        ground7.setLocation(558,55);
        ladder2.setLocation(433,73);
        ladder2.setLocation(418,120);
        ground.setLocation(380,334);
        ground6.setLocation(157,174);
        ladder2.setLocation(405,142);
        ground6.setLocation(151,178);
        ladder2.setLocation(387,134);
        ground.setLocation(440,330);
        ladder2.setLocation(408,129);
        ground.setLocation(454,337);
        ground6.setLocation(86,75);
        ground.setLocation(512,330);
        ladder2.setLocation(412,127);
        removeObject(ladder2);
        ground7.setLocation(561,56);
        removeObject(ground7);
        JumpPowerUp jumpPowerUp = new JumpPowerUp();
        addObject(jumpPowerUp,532,277);
        jumpPowerUp.setLocation(532,282);
        jumpPowerUp.setLocation(584,274);
        jumpPowerUp.setLocation(519,276);
        jumpPowerUp.setLocation(526,279);
        removeObject(jumpPowerUp);
        removeObject(ground);
        removeObject(ground6);
        Box box = new Box();
        addObject(box,529,310);
        Box box2 = new Box();
        addObject(box2,300,176);
        Box box3 = new Box();
        addObject(box3,81,79);
    }
}
