import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelComplete extends World
{

    /**
     * Constructor for objects of class LevelComplete.
     * 
     */
    public LevelComplete()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(5000, 550, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Win win = new Win();
        addObject(win,757,220);
     
        Replay replay = new Replay();
        addObject(replay,629,423);
        
        Exit exit = new Exit();
        addObject(exit,900,423);
      
    }
}
