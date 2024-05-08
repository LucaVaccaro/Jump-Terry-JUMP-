import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpPowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpPowerUp extends PowerUpSimulator
{
    
    /**
     * Act - do whatever the JumpPowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void PowerUp()
    {
        player.maxJumpStrength = 24;
        //player.chargeTime = 3;
    }
     public void PowerDown()
    {
        player.maxJumpStrength = Player.MAX_JUMP_STRENGTH;
    }
}
