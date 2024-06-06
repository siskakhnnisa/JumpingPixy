import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Parent
{
    int speed = -8;
    public Car2()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act()
    {
        Actor i = getOneIntersectingObject(Car.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
