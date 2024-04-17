import greenfoot.*;

public class Player extends Actor {
    private static final int MAX_JUMP_STRENGTH = 20;
    private static final double GRAVITY = 0.2;
    
    private boolean isJumping = false;
    private boolean isChargingJump = false;
    private double horizontalVelocity = 0; 
    private double verticalVelocity = 0;
    private int chargeTime = 0;
    
    public void act() {
        inputKey();
        applyPhysics();
    }
    
    private void inputKey() {
        // Charging Jump
        if (Greenfoot.isKeyDown("space")) {
            if (!isJumping) {
                isChargingJump = true;
                chargeTime++;
            }
        } else if (isChargingJump) {
            jump();
        }
        
        // Direction of jump
        if (isChargingJump) {
            int direction = 0;
            if (Greenfoot.isKeyDown("a")) {
                direction = -1;
            }else if (Greenfoot.isKeyDown("d")) {
                direction = 1;
            }if (direction != 0) {
                jump(direction);
            }
        }
    }
    
    private void jump() {
        isJumping = true;
        isChargingJump = false;
        int strength = Math.min(chargeTime, MAX_JUMP_STRENGTH);
        horizontalVelocity = 0;
        verticalVelocity = -strength * 0.75;
        chargeTime = 0;
    }
    
    private void jump(int direction) {
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
            setLocation(getX(), getY() - 1);
        }
    }
    
    private boolean isOnGround() {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return ground != null;
    }
}
