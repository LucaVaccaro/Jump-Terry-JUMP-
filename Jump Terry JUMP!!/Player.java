import greenfoot.*;

public class Player extends Actor {
    GreenfootImage image1;
    GreenfootImage image2;
    
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
    
    public Player()
    {
        image1 = new GreenfootImage("terryNormal.png"); 
        image2 = new GreenfootImage("terryCrouching.png");
    }

    public void act() 
    {
        inputKey();
        applyPhysics();
        if (powerUp != null)
        {
            powerUp.setLocation(getX(), getY());
        }

        checkPowerUp();

    }
    
    private void inputKey() {
        if (Greenfoot.isKeyDown("a")) 
        {
            direction += -0.5;
            if(direction <= -90)
            {
                direction = 0;
            }
        } else if (Greenfoot.isKeyDown("d")) 
        {
            direction += 0.5;
            if(direction >= 90)
            {
                direction = 0;
            }
        }
        if (Greenfoot.isKeyDown("space")) {
            if (!isJumping) {
                isChargingJump = true;
                chargeTime += 0.5;
                setImage(image2);
            }
        } else if (isChargingJump) {
            jump(direction);
            setImage(image1);
        }
    }
    
    private void jump() {
        isJumping = true;
        isChargingJump = false;
        double strength = Math.min(chargeTime, maxJumpStrength);
        verticalVelocity = -strength * 0.75;
        chargeTime = 0;
        Greenfoot.playSound("jump.wav");
    }
    
    private void jump(double direction) {
        jump();
        horizontalVelocity = direction * 2;
    }
    
    private void applyPhysics() {
        setLocation(getX() + (int)horizontalVelocity, getY() + (int)verticalVelocity);
        
        if (verticalVelocity < 10) {
            verticalVelocity += gravity;
        }
        
        if (isOnGround()) {
            isJumping = false;
            verticalVelocity = 0;
            horizontalVelocity = 0;
            direction = 0;
            setLocation(getX(), getY() - 1);
        }
    }
    
    public void setMaxJumpStrength(int strength) {
        maxJumpStrength = strength;
    }
    
    private boolean isOnGround() {
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return ground != null;
    }
    
      public double getVerticalVelocity() {
        return verticalVelocity;
    }
    
    private void checkPowerUp() {
        if (isTouching(JumpPowerUp.class)) {
            JumpPowerUp powerUp = (JumpPowerUp)getOneIntersectingObject(JumpPowerUp.class);
            if (powerUp != null) {
                powerUp.applyPowerUp();
                getWorld().removeObject(powerUp);
            }
        }
    }
    
      public int getMaxJumpStrength() {
        return maxJumpStrength;
    }
}
