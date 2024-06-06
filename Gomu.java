import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gomu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gomu extends Parent
{
    int speed = -3;
    public Gomu()
    {
        getImage().scale(getImage().getWidth()/10, getImage().getHeight()/10);
    }
    public void act()
    {
        Actor i = getOneIntersectingObject(Gomu.class);
        move(speed);
        checkdouble(i);
        end(); 
    }
}
