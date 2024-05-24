import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld6 extends WorldTrackPlayer
{

    /**
     * Constructor for objects of class MyWorld6.
     * 
     */
    public MyWorld6()
    {    
        super(); 
        prepare();
    }
    public MyWorld6(int x , int y, Player p)
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
            Greenfoot.setWorld(new MyWorld5(player.getX(), 0, player));
        }
        if (player.getY() <= 0 && player.getVerticalVelocity() <= 0)
        {
            Greenfoot.setWorld(new MyWorld7(player.getX(), getHeight() - 10, player));
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
        addObject(metalPlatform,532,293);
        metalPlatform metalPlatform2 = new metalPlatform();
        addObject(metalPlatform2,112,56);
        metalPlatform2.setLocation(119,87);
        JumpPowerUp jumpPowerUp = new JumpPowerUp();
        addObject(jumpPowerUp,534,256);
        jumpPowerUp.setLocation(523,256);
        metalPlatform2.setLocation(239,170);
        removeObject(metalPlatform2);
        jumpPowerUp.setLocation(528,258);
    }
        
}
