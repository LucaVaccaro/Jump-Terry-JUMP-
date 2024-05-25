import greenfoot.*;  

/**
 * Write a description of class MyWorld5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld5 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld5.
     * 
     */
    public MyWorld5()
    {    
        super(); 
        prepare();
    }
    public MyWorld5(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld4(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld6(player.getX(), getHeight() - 10, player));
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
        metalPlatform metalPlatform = new metalPlatform();
        addObject(metalPlatform,539,305);
        metalPlatform metalPlatform2 = new metalPlatform();
        addObject(metalPlatform2,304,305);
        metalPlatform metalPlatform3 = new metalPlatform();
        addObject(metalPlatform3,76,305);
        metalPlatform2.setLocation(294,305);
        boxPlatform boxPlatform = new boxPlatform();
        addObject(boxPlatform,82,162);
        boxPlatform.setLocation(83,148);
        Box box = new Box();
        addObject(box,49,113);
        pipePlatform pipePlatform = new pipePlatform();
        addObject(pipePlatform,510,74);
        removeObject(metalPlatform3);
        pipePlatform pipePlatform2 = new pipePlatform();
        addObject(pipePlatform2,622,73);
        pipePlatform2.setLocation(604,74);
    }
        
}
