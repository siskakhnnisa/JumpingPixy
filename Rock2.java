import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock2 extends Parent
{
    int speed = -6;
    public Rock2()
    {
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
    }
    public void act()
    {
        Actor i = getOneIntersectingObject(Rock.class);
        move(speed);
        checkdouble(i);
        end();
    }
}