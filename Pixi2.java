import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pixi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pixi2 extends Actor
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
    public Pixi2()
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
        checkFalling2();
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
    public void checkFalling2()
    {
       if(onGround2() == false|| onGroundButtom2() == false || onGroundUpper2() == false)
       {
           fall();
       }
       if(onGround2() == true || onGroundButtom2() == true || onGroundUpper2() == true)
       {
           vSpeed = 0;
       } 
    }
    boolean onGround2()
    {
      Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground2.class);
      return under != null;
    }
    boolean onGroundButtom2()
    {
      Actor under2 = getOneObjectAtOffset(0,getImage().getHeight()/2, GroundButtom2.class);
      return under2 != null;
    }
    boolean onGroundUpper2()
    {
      Actor under3 = getOneObjectAtOffset(0,getImage().getHeight()/2, GroundUpper2.class);
      return under3 !=   null;
    }
    public void addscore(){
        if(isTouching(Gomu2.class)){
            score = score + 20;
            removeTouching(Gomu2.class);
        }
    }
    public void end(){
        if(isTouching(Rock2.class)||isTouching(Car2.class) || getY() >= 549)//||isTouching(carred.class))
        {
            Level2.bg2.stop();
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
        if(isTouching(Flag2.class))
        {
            Level2.bg2.stop();
            Greenfoot.playSound("congrats.wav");
            Greenfoot.delay(5);
            Greenfoot.setWorld(new LevelComplete());
            //setImage(level2);
            //setLocation(800, 230);
            //Greenfoot.stop();
        }
    }
}
