import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground2 extends Parent
{
    int speed = -6; 
    public Ground2()
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
