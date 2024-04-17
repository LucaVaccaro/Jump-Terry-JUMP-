import greenfoot.*;

public class Ground extends Actor {
    public Ground() {
        GreenfootImage image = new GreenfootImage(100, 20); // Adjust width and height as needed
        image.setColor(Color.GREEN); // Adjust color as needed
        image.fill();
        setImage(image);
    }
    
    public void act() {
        // Add any additional behavior for the ground if needed
    }
}
