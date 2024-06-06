import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   static GreenfootSound bg = new GreenfootSound("playing.wav");
   
    public MyWorld()
    {    
        super(5000, 550, 1); 
        prepare();
       
    }
    //public void started()
    //{
      //  bg = new GreenfootSound("playing.wav");
       // bg.playLoop();  
    //}
    //public void stopped()
    //{
     //   bg.stop();
    //}
    
    public void act() 
    {
             
        if(Greenfoot.getRandomNumber(900)<1)
        {
            addObject(new Rock(), Greenfoot.getRandomNumber(368) + 1005, 190);
        }
        if(Greenfoot.getRandomNumber(900)<1)
        {
            addObject(new Rock(), Greenfoot.getRandomNumber(368) + 1005, 343);
        }
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Gomu(), Greenfoot.getRandomNumber(368) + 1005, 183);
        }
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Gomu(), Greenfoot.getRandomNumber(368) + 1005, 340);
        }
        if(Greenfoot.getRandomNumber(500)<1)
        {
            addObject(new Car(), Greenfoot.getRandomNumber(1328) + 89, 195);
        }
        if(Greenfoot.getRandomNumber(500)<1)
        {
            addObject(new Car(), Greenfoot.getRandomNumber(1328) + 89, 350);
        }
        started();
    }    
    
    private void prepare()
    {
        Pixi pixi = new Pixi();
        addObject(pixi,283,325);
        Ground ground = new Ground();
        addObject(ground,535,360);
        ground.setLocation(511,377);

        Ground ground2 = new Ground();
        addObject(ground2,240,375);
        ground2.setLocation(330,377);

        Ground ground3 = new Ground();
        addObject(ground3,56,384);
        ground3.setLocation(149,377);

        Ground ground4 = new Ground();
        addObject(ground4,781,361);
        ground4.setLocation(693,377);

        Ground ground5 = new Ground();
        addObject(ground5,781,361);
        ground5.setLocation(876,377);

        Ground ground7 = new Ground();
        addObject(ground7,1172,377);

        Ground ground8 = new Ground();
        addObject(ground8,1355,377);

        Ground ground9 = new Ground();
        addObject(ground9,1538,377);

        Ground ground10 = new Ground();
        addObject(ground10,1839,377);

        Ground ground11 = new Ground();
        addObject(ground11,2022,377);

        Ground ground12 = new Ground();
        addObject(ground12,2200,377);

        Ground ground13 = new Ground();
        addObject(ground13,2500,377);

        Ground ground14 = new Ground();
        addObject(ground14,2680,377);

        

        Counter counter = new Counter();
        addObject(counter, 165, 27);
        Counter counter1 = new Counter();
        addObject(counter1, 1368, 27);

        GroundButtom groundButtom = new GroundButtom();
        addObject(groundButtom,728,512);
        groundButtom.setLocation(816,528);

        GroundButtom groundButtom2 = new GroundButtom();
        addObject(groundButtom2,554,516);
        groundButtom2.setLocation(634,528);

        GroundButtom groundButtom3 = new GroundButtom();
        addObject(groundButtom3,381,514);        
        groundButtom3.setLocation(451,528);

        GroundButtom groundButtom4 = new GroundButtom();
        addObject(groundButtom4,181,520);
        groundButtom4.setLocation(268,528);

        GroundButtom groundButtom5 = new GroundButtom();
        addObject(groundButtom5, 86, 528);

        GroundButtom groundButtom6 = new GroundButtom();
        addObject(groundButtom6, 1233, 528);

        GroundButtom groundButtom7 = new GroundButtom();
        addObject(groundButtom7, 1415, 528);

        GroundButtom groundButtom8 = new GroundButtom();
        addObject(groundButtom8, 1597, 528);

        GroundButtom groundButtom9 = new GroundButtom();
        addObject(groundButtom9, 1777, 528);

        GroundButtom groundButtom10 = new GroundButtom();
        addObject(groundButtom10, 1960, 528);

        GroundButtom groundButtom11 = new GroundButtom();
        addObject(groundButtom11, 2143, 528);

        GroundButtom groundButtom12 = new GroundButtom();
        addObject(groundButtom12, 2400, 528);

        GroundButtom groundButtom13 = new GroundButtom();
        addObject(groundButtom13, 2570, 528);

        GroundButtom groundButtom14 = new GroundButtom();
        addObject(groundButtom14, 2900, 528);

        GroundUpper groundUpper = new GroundUpper();
        addObject(groundUpper, 808, 226);


        GroundUpper groundUpper3 = new GroundUpper();
        addObject(groundUpper3, 443, 226);

        GroundUpper groundUpper4 = new GroundUpper();
        addObject(groundUpper4, 260, 226);

        GroundUpper groundUpper5 = new GroundUpper();
        addObject(groundUpper5, 78, 226);

        GroundUpper groundUpper6 = new GroundUpper();
        addObject(groundUpper6, 991, 226);

        GroundUpper groundUpper7 = new GroundUpper();
        addObject(groundUpper7, 1173, 226);

        GroundUpper groundUpper8 = new GroundUpper();
        addObject(groundUpper8, 1356, 226);

        GroundUpper groundUpper9 = new GroundUpper();
        addObject(groundUpper9, 1742, 226);

        GroundUpper groundUpper10 = new GroundUpper();
        addObject(groundUpper10, 1925, 226);

        GroundUpper groundUpper11 = new GroundUpper();
        addObject(groundUpper11, 2108, 226);

        GroundUpper groundUpper12 = new GroundUpper();
        addObject(groundUpper12,2450,226);

        GroundUpper groundUpper13 = new GroundUpper();
        addObject(groundUpper13,2550,226);

        GroundUpper groundUpper14 = new GroundUpper();
        addObject(groundUpper14,2650,226);

        GroundUpper groundUpper15 = new GroundUpper();
        addObject(groundUpper15,2900,170);
        
        Flag flag = new Flag();
        addObject(flag,2910,125);
        
       bg = new GreenfootSound("playing.wav");
       bg.playLoop();
        
    }
    
}
