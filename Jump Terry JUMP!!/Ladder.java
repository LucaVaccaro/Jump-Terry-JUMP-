import greenfoot.*;

public class Ladder extends Ground {
    public Ladder() {
        GreenfootImage image = new GreenfootImage(20, 100); // Adjust width and height as needed
        image.setColor(Color.RED); // Adjust color as needed
        image.fill();
        setImage(image);
    }
    
    public void act() {
        // Add any additional behavior for the ground if needed
    }
}
