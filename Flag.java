import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flag extends Parent
{
    int speed = -3;
    public Flag()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act()
    {
        moveAround(speed);
    }
}
