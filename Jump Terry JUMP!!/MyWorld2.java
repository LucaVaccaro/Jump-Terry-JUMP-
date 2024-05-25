import greenfoot.*;

public class MyWorld2 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2()
    {    
        super(); 
        prepare();
    }
    public MyWorld2(int x , int y, Player p)
    {    
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
            Greenfoot.setWorld(new MyWorld(player.getX(), 0, player));
            deactivatePowerUp();
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld3(player.getX(), getHeight() - 10, player));
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
        ladder.setLocation(585,87);
        ladder.setLocation(110,150);
        ladder.setLocation(76,105);
        ground4.setLocation(254,187);
        ground4.setLocation(237,173);
        removeObject(ground4);
        removeObject(ground3);
        ladder.setLocation(105,105);
        ladder.setLocation(301,209);
        ladder.setLocation(301,209);
        ladder.setLocation(311,213);
        ground2.setLocation(551,101);
        metalPlatform metalPlatform = new metalPlatform();
        addObject(metalPlatform,382,332);
        removeObject(ground);
        metalPlatform.setLocation(83,304);
        ground2.setLocation(538,98);
        removeObject(ground2);
        metalPlatform.setLocation(545,77);
        metalPlatform.setLocation(538,81);
        boxPlatform boxPlatform = new boxPlatform();
        addObject(boxPlatform,106,315);
        Box box = new Box();
        addObject(box,62,280);
        box.setLocation(38,277);
        metalPlatform.setLocation(586,77);
        boxPlatform.setLocation(24,308);
        box.setLocation(27,270);
        box.setLocation(9,291);
        ladder.setLocation(346,175);
        metalPlatform.setLocation(559,73);
        metalPlatform.setLocation(571,76);
        metalPlatform.setLocation(532,71);
        boxPlatform.setLocation(109,276);
        box.setLocation(52,247);
        boxPlatform.setLocation(42,285);
        box.setLocation(88,253);
        box.setLocation(86,254);
    }
}
