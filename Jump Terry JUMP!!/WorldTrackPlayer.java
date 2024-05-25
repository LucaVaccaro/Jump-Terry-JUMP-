import greenfoot.*;  

/**
 * Write a description of class WorldKeepPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTrackPlayer extends World
{
    Player player;
    /**
     * Constructor for objects of class WorldKeepPlayer.
     * 
     */
    public WorldTrackPlayer(int x , int y, Player p)
    {    
        super(640, 360, 1); 
        player = p;
        addObject(player,x,y);
        
    }
    public WorldTrackPlayer()
    {    
        super(640, 360, 1); 
        player = new Player();
        addObject(player,95,317);
    }
    public void act()
    {
        checkPlayerPosition();
    }
    public void checkPlayerPosition()
    {
        
    }
}
