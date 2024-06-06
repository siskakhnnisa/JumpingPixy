import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Parent
{
    int speed = -3; 
    public Ground()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/3);
    }
    public void act()
    {
        Ground a = new Ground();
        Actor i = getOneIntersectingObject(Ground.class);
        moveAround(speed);        
        end();
    }
}
