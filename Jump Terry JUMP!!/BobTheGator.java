import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BobTheGator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BobTheGator extends Actor
{
    /**
     * Act - do whatever the BobTheGator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    checkCollision();  
    }
    
    private void checkCollision() {
        if (isTouching(Player.class)) {
            Greenfoot.setWorld(new VictoryScreen());
            MyWorld.stopMusic();
            Greenfoot.playSound("jump_Sound.wav");
        }
    }
}
