import greenfoot.*;

public class Player extends Actor {
    public static final int MAX_JUMP_STRENGTH = 12;
    public int maxJumpStrength = 12;
    private static final double gravity = 0.2;
    
    private boolean isJumping = false;
    private boolean isChargingJump = false;
    private double horizontalVelocity = 0; 
    private double verticalVelocity = 0;
    public double chargeTime = 0;
    private double direction = 0;
    public PowerUpSimulator powerUp;
    boolean isVPressed = false;
    public void act() 
    {
        inputKey();
        applyPhysics();
         if (Greenfoot.isKeyDown("v")) 
        {
            isVPressed = true;
        }
        else if (isVPressed && !Greenfoot.isKeyDown("v"))
        {
            powerUp = new JumpPowerUp();
            getWorld().addObject(powerUp,getX(),getY());
            isVPressed = false;
        }
        if (powerUp != null)
        {
            powerUp.setLocation(getX(), getY());
        }
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
        double strength = Math.min(chargeTime, maxJumpStrength);
        verticalVelocity = -strength * 0.75;
        chargeTime = 0;
        
        Greenfoot.playSound("jump_Sound.wav");
    }
    
    private void jump(double direction) {
        jump();
        horizontalVelocity = direction * 2;
    }
    
    private void applyPhysics() {
        setLocation(getX() + (int)horizontalVelocity, getY() + (int)verticalVelocity);
        verticalVelocity += gravity;
        
        if (isOnGround()) {
            isJumping = false;
            verticalVelocity = 0;
            horizontalVelocity = 0;
            direction = 0;
            setLocation(getX(), getY() - 1);
        }
    }
    
    public double getVerticalVelocity() {
        return verticalVelocity;
    }
    
    private boolean isOnGround() {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return ground != null;
    }
}
