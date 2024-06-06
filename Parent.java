import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parent extends Actor
{
    private GreenfootImage level2 = new GreenfootImage("level_up2.png");
    public void act()
    {
        // Add your action code here.
    }
    public void checkdouble(Actor i)
    {
      if(i != null){
          getWorld().removeObject(i);
        }
    }
    public void moveAround(int speed)
    {
        setLocation(getX()+ speed,getY());
    }
     public void moveAround2(int speed2)
    {
        setLocation(getX()+ speed2,getY());
    }
    public void end()
    {
        if(getX() >= 4999||getX() <=0){
            getWorld().removeObject(this);
        }
    }
}
