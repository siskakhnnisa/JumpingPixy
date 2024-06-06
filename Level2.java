import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    static GreenfootSound bg2 = new GreenfootSound("playing.wav");
   
    public Level2()
    {    
        super(5000, 550, 1); 
        prepare();
       
    }
    //public void started()
    //{
       // bg = new GreenfootSound("playing.wav");
       // bg.playLoop();        
    //}
    public void act() 
    {
             
             
        if(Greenfoot.getRandomNumber(700)<1)
        {
            addObject(new Rock2(), Greenfoot.getRandomNumber(444) + 937, 190);
        }
        if(Greenfoot.getRandomNumber(700)<1)
        {
            addObject(new Rock2(), Greenfoot.getRandomNumber(444) + 937, 343);
        }
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Gomu2(), Greenfoot.getRandomNumber(1349) + 89, 183);
        }
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Gomu2(), Greenfoot.getRandomNumber(1349) + 89, 340);
        }
        if(Greenfoot.getRandomNumber(500)<1)
        {
            addObject(new Car2(), Greenfoot.getRandomNumber(1490) + 10, 195);
        }
        if(Greenfoot.getRandomNumber(500)<1)
        {
            addObject(new Car2(), Greenfoot.getRandomNumber(1490) + 10, 350);
        }
    }    
    
    private void prepare()
    {
        Pixi2 pixi2 = new Pixi2();
        addObject(pixi2,283,325);
        
        Ground2 ground = new Ground2();
        addObject(ground,535,360);
        ground.setLocation(511,377);

        Ground2 ground2 = new Ground2();
        addObject(ground2,240,375);
        ground2.setLocation(330,377);

        Ground2 ground3 = new Ground2();
        addObject(ground3,56,384);
        ground3.setLocation(149,377);

        Ground2 ground4 = new Ground2();
        addObject(ground4,781,361);
        ground4.setLocation(693,377);

        Ground2 ground5 = new Ground2();
        addObject(ground5,781,361);
        ground5.setLocation(876,377);

        Ground2 ground7 = new Ground2();
        addObject(ground7,1172,377);

        Ground2 ground8 = new Ground2();
        addObject(ground8,1355,377);

        Ground2 ground9 = new Ground2();
        addObject(ground9,1538,377);

        Ground2 ground10 = new Ground2();
        addObject(ground10,1839,377);

        Ground2 ground11 = new Ground2();
        addObject(ground11,2022,377);

        Ground2 ground12 = new Ground2();
        addObject(ground12,2200,377);

        Ground ground13 = new Ground();
        addObject(ground13,2500,377);

        Ground2 ground14 = new Ground2();
        addObject(ground14,2680,377);

        Ground2 ground15 = new Ground2();
        addObject(ground15,3025,377);
        Ground2 ground16 = new Ground2();
        addObject(ground16,3208,377);
        Ground2 ground17 = new Ground2();
        addObject(ground17,3390,377);
        Ground2 ground18 = new Ground2();
        addObject(ground18,3684,377);
        Ground2 ground19 = new Ground2();
        addObject(ground19,3864,377);
        Ground2 ground20 = new Ground2();
        addObject(ground20,4044,377);
        Ground2 ground21 = new Ground2();
        addObject(ground21,4400,377);
        Ground2 ground22 = new Ground2();
        addObject(ground22,4580,377);
        Ground2 ground23 = new Ground2();
        addObject(ground23,4760,377);
        

        Counter counter = new Counter();
        addObject(counter, 165, 27);
        Counter counter1 = new Counter();
        addObject(counter1, 1368, 27);

        GroundButtom2 groundButtom = new GroundButtom2();
        addObject(groundButtom,728,512);
        groundButtom.setLocation(816,528);

        GroundButtom2 groundButtom2 = new GroundButtom2();
        addObject(groundButtom2,554,516);
        groundButtom2.setLocation(634,528);

        GroundButtom2 groundButtom3 = new GroundButtom2();
        addObject(groundButtom3,381,514);        
        groundButtom3.setLocation(451,528);

        GroundButtom groundButtom4 = new GroundButtom();
        addObject(groundButtom4,181,520);
        groundButtom4.setLocation(268,528);

        GroundButtom2 groundButtom5 = new GroundButtom2();
        addObject(groundButtom5, 86, 528);

        GroundButtom2 groundButtom6 = new GroundButtom2();
        addObject(groundButtom6, 1233, 528);

        GroundButtom2 groundButtom7 = new GroundButtom2();
        addObject(groundButtom7, 1415, 528);

        GroundButtom2 groundButtom8 = new GroundButtom2();
        addObject(groundButtom8, 1597, 528);

        GroundButtom2 groundButtom9 = new GroundButtom2();
        addObject(groundButtom9, 1777, 528);

        GroundButtom2 groundButtom10 = new GroundButtom2();
        addObject(groundButtom10, 1960, 528);

        GroundButtom2 groundButtom11 = new GroundButtom2();
        addObject(groundButtom11, 2143, 528);

        GroundButtom2 groundButtom12 = new GroundButtom2();
        addObject(groundButtom12, 2400, 528);

        GroundButtom2 groundButtom13 = new GroundButtom2();
        addObject(groundButtom13, 2570, 528);

        GroundButtom2 groundButtom14 = new GroundButtom2();
        addObject(groundButtom14, 2900, 528); 
        
        GroundButtom2 groundButtom15 = new GroundButtom2();
        addObject(groundButtom15, 3082, 528);
        GroundButtom2 groundButtom16 = new GroundButtom2();
        addObject(groundButtom16, 3262, 528);

        GroundButtom2 groundButtom17 = new GroundButtom2();
        addObject(groundButtom17, 3444, 528);
        
        GroundButtom2 groundButtom18 = new GroundButtom2();
        addObject(groundButtom18, 3620, 528);
        
        GroundButtom2 groundButtom19 = new GroundButtom2();
        addObject(groundButtom19, 4026, 528);
        GroundButtom2 groundButtom20 = new GroundButtom2();
        addObject(groundButtom20, 4208, 528);
        GroundButtom2 groundButtom21 = new GroundButtom2();
        addObject(groundButtom21, 4391, 528);
        GroundButtom2 groundButtom22 = new GroundButtom2();
        addObject(groundButtom22, 4688, 528);
        GroundButtom2 groundButtom23 = new GroundButtom2();
        addObject(groundButtom23, 4871, 528);
        
        
        
        GroundUpper2 groundUpper = new GroundUpper2();
        addObject(groundUpper, 808, 226);


        GroundUpper2 groundUpper3 = new GroundUpper2();
        addObject(groundUpper3, 443, 226);

        GroundUpper2 groundUpper4 = new GroundUpper2();
        addObject(groundUpper4, 260, 226);

        GroundUpper2 groundUpper5 = new GroundUpper2();
        addObject(groundUpper5, 78, 226);

        GroundUpper2 groundUpper6 = new GroundUpper2();
        addObject(groundUpper6, 991, 226);

        GroundUpper2 groundUpper7 = new GroundUpper2();
        addObject(groundUpper7, 1173, 226);

        GroundUpper2 groundUpper8 = new GroundUpper2();
        addObject(groundUpper8, 1356, 226);

        GroundUpper2 groundUpper9 = new GroundUpper2();
        addObject(groundUpper9, 1742, 226);

        GroundUpper2 groundUpper10 = new GroundUpper2();
        addObject(groundUpper10, 1925, 226);

        GroundUpper2 groundUpper11 = new GroundUpper2();
        addObject(groundUpper11, 2108, 226);

        GroundUpper2 groundUpper12 = new GroundUpper2();
        addObject(groundUpper12,2450,226);

        GroundUpper2 groundUpper13 = new GroundUpper2();
        addObject(groundUpper13,2550,226);

        GroundUpper2 groundUpper14 = new GroundUpper2();
        addObject(groundUpper14,2650,226);
        
        GroundUpper2 groundUpper16 = new GroundUpper2();
        addObject(groundUpper16,3128,226);

        GroundUpper2 groundUpper15 = new GroundUpper2();
        addObject(groundUpper15,2900,170);
        GroundUpper2 groundUpper17 = new GroundUpper2();
        addObject(groundUpper17,3310,226);
        GroundUpper2 groundUpper18 = new GroundUpper2();
        addObject(groundUpper18,3490,226);
        GroundUpper2 groundUpper19 = new GroundUpper2();
        addObject(groundUpper19,3670,226);
        GroundUpper2 groundUpper20 = new GroundUpper2();
        addObject(groundUpper20,3990,226);
        GroundUpper2 groundUpper21 = new GroundUpper2();
        addObject(groundUpper21,4150,226);
        GroundUpper2 groundUpper22 = new GroundUpper2();
        addObject(groundUpper22,4310,226);
        
        GroundUpper2 groundUpper23 = new GroundUpper2();
        addObject(groundUpper23,4665,226);
        
        GroundUpper2 groundUpper24 = new GroundUpper2();
        addObject(groundUpper24,4901,150);
        
        
        Flag2 flag = new Flag2();
        addObject(flag,4912,109);
        
        bg2 = new GreenfootSound("playing.wav");
        bg2.playLoop();
    }
    
}
