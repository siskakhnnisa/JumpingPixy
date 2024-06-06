import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pixi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pixi extends Actor
{
    private GreenfootImage gameoverimage = new GreenfootImage("gameover.png");
    private GreenfootImage score2 = new GreenfootImage("counter.png");
    private GreenfootImage level2 = new GreenfootImage("level_up2.png");
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpHeight = -6;  
    int score = 0;
    int level = 1;
    int speed = 1;
    public Pixi()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act()
    {
        getWorld().showText("Score : " + score, 165, 25);
        getWorld().showText("Level : " + level, 1368, 25);
        win();
        moveForward(speed);
        move();
        checkFalling();
        end();
        addscore();
    }
    public void moveForward(int speed)
    {
        setLocation(getX()+ speed,getY());
    }
    public void move()
    {
       if(Greenfoot.isKeyDown("up"))
       {
           setLocation(getX()+1,getY()-30);
           
       }
       if(Greenfoot.isKeyDown("down"))
       {
            setLocation(getX()+1, getY()+15);  
            
       }

          
    
    }
    private void fall()
    {
        setLocation(getX(), getY()+ vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void checkFalling()
    {
       if(onGround() == false|| onGroundButtom() == false || onGroundUpper() == false)
       {
           fall();
       }
       if(onGround() == true || onGroundButtom() == true || onGroundUpper() == true)
       {
           vSpeed = 0;
       } 
    }
    boolean onGround()
    {
      Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
      return under != null;
    }
    boolean onGroundButtom()
    {
      Actor under2 = getOneObjectAtOffset(0,getImage().getHeight()/2, GroundButtom.class);
      return under2 != null;
    }
    boolean onGroundUpper()
    {
      Actor under3 = getOneObjectAtOffset(0,getImage().getHeight()/2, GroundUpper.class);
      return under3 !=   null;
    }
    public void addscore(){
        if(isTouching(Gomu.class)){
            score = score + 20;
            removeTouching(Gomu.class);
        }
    }
    public void end(){
        if(isTouching(Rock.class)||isTouching(Car.class) || getY() >= 549)//||isTouching(carred.class))
        {
            MyWorld.bg.stop();
            Greenfoot.playSound("fall.wav");
            
            Greenfoot.delay(5);
            Greenfoot.setWorld(new GameOver());
            //setImage(gameoverimage);
            //setLocation(800, 230);
            //getWorld().showText("Score :  " + score, 800, 400);
            //Greenfoot.stop();
        }
    }
    public void win(){
        if(isTouching(Flag.class))
        {
            ((MyWorld)getWorld()).bg.stop();
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Level2());
            MyWorld.bg.stop();
            Greenfoot.playSound("congrats.wav");
            
            
            //setImage(level2);
            //setLocation(800, 230);
            //Greenfoot.stop();
        }
    }
}
