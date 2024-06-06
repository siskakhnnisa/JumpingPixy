import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replay extends Actor
{
    public Replay()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
       if(Greenfoot.mousePressed(this))
       {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9),
           (int)Math.round(getImage().getHeight()*0.9));
       }
       if(Greenfoot.mouseClicked(this))
       {
           Greenfoot.delay(5);
           Greenfoot.setWorld(new MyWorld());
       }
    }
}
