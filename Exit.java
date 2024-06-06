import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    public Exit()
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
           Greenfoot.setWorld(new StartPlay());
       }
    }
}
