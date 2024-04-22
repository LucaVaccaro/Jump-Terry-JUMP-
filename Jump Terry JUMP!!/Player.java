import greenfoot.*;

public class Player extends Actor {
    private static final int MAX_JUMP_STRENGTH = 12;
    private static final double GRAVITY = 0.2;
    
    private boolean isJumping = false;
    private boolean isChargingJump = false;
    private double horizontalVelocity = 0; 
    private double verticalVelocity = 0;
    private double chargeTime = 0;
    private double direction = 0;
    public void act() {
        inputKey();
        applyPhysics();
    }
    
    private void inputKey() {
        
        if (Greenfoot.isKeyDown("a")) 
        {
            direction += -0.5;
        }
        else if (Greenfoot.isKeyDown("d")) 
        {
            direction += 0.5;
        }
        if (Greenfoot.isKeyDown("space")) {
            if (!isJumping) {
                isChargingJump = true;
                chargeTime += 0.5;
            }
        } else if (isChargingJump) {
            jump(direction);
        }
        
        // Direction of jump
        
            
        
    }
    
    private void jump() {
        isJumping = true;
        isChargingJump = false;
        double strength = Math.min(chargeTime, MAX_JUMP_STRENGTH);
        verticalVelocity = -strength * 0.75;
        chargeTime = 0;
    }
    
    private void jump(double direction) {
        jump();
        horizontalVelocity = direction * 2;
    }
    
    private void applyPhysics() {
        setLocation(getX() + (int)horizontalVelocity, getY() + (int)verticalVelocity);
        verticalVelocity += GRAVITY;
        
        if (isOnGround()) {
            isJumping = false;
            verticalVelocity = 0;
            horizontalVelocity = 0;
            direction = 0;
            setLocation(getX(), getY() - 1);
        }
    }
    
    private boolean isOnGround() {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return ground != null;
    }
}
