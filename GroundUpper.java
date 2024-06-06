import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundUpper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundUpper extends Parent
{
    int speed = -3;
    public GroundUpper()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/3);
    }
    public void act()
    {
        GroundUpper a = new GroundUpper();
        Actor i = getOneIntersectingObject(GroundUpper.class);
        moveAround(speed);
        end();
    }
}
