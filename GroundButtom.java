import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundButtom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundButtom extends Parent
{
    int speed = -3;
    public GroundButtom()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/3);
    }
    public void act()
    {
       GroundButtom a = new GroundButtom();
       Actor i = getOneIntersectingObject(GroundButtom.class);
       moveAround(speed);
       end();
    }
}
