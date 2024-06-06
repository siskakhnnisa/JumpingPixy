import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gomu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gomu2 extends Parent
{
    int speed = -6;
    public Gomu2()
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
