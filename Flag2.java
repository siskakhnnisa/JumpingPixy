import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flag2 extends Parent
{
    int speed = -6;
    public Flag2()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    public void act()
    {
        moveAround(speed);
    }
}
