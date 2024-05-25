import greenfoot.*;  

/**
 * Write a description of class MyWorld10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld10 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld10.
     * 
     */
    public MyWorld10()
    {    
        super(); 
        prepare();
    }
    public MyWorld10(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld9(player.getX(), 0, player));
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
        addObject(ground,579,330);
        Ground ground2 = new Ground();
        addObject(ground2,451,330);
        ground2.setLocation(457,330);
        Ground ground3 = new Ground();
        addObject(ground3,335,330);
        Ground ground4 = new Ground();
        addObject(ground4,207,330);
        Ground ground5 = new Ground();
        addObject(ground5,82,330);
        Ground ground6 = new Ground();
        addObject(ground6,15,330);
        BobTheGator bobTheGator = new BobTheGator();
        addObject(bobTheGator,509,264);
        bobTheGator.setLocation(502,145);
        pipePlatform pipePlatform = new pipePlatform();
        addObject(pipePlatform,504,200);
        bobTheGator.setLocation(514,158);
        pipePlatform pipePlatform2 = new pipePlatform();
        addObject(pipePlatform2,99,80);
        bobTheGator.setLocation(518,156);
        bobTheGator.setLocation(516,135);
        bobTheGator.setLocation(530,120);
        bobTheGator.setLocation(530,124);
        bobTheGator.setLocation(530,129);
        pipePlatform.setLocation(532,195);
        LouiseTrapped louiseTrapped = new LouiseTrapped();
        addObject(louiseTrapped,238,57);
        pipePlatform2.setLocation(84,176);
        louiseTrapped.setLocation(106,70);
        pipePlatform2.setLocation(106,149);
        pipePlatform.setLocation(327,208);
        bobTheGator.setLocation(331,141);
        pipePlatform2.setLocation(575,139);
        pipePlatform2.setLocation(559,138);
        louiseTrapped.setLocation(570,84);
        pipePlatform2.setLocation(603,133);
        louiseTrapped.setLocation(564,90);
        removeObject(pipePlatform2);
        boxPlatform boxPlatform = new boxPlatform();
        addObject(boxPlatform,492,130);
        louiseTrapped.setLocation(614,129);
        boxPlatform boxPlatform2 = new boxPlatform();
        addObject(boxPlatform2,614,129);
        louiseTrapped.setLocation(584,128);
        pipePlatform.setLocation(352,207);
        removeObject(louiseTrapped);
        addObject(louiseTrapped,558,63);
        boxPlatform.setLocation(540,128);
    }
        
}
