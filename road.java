import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class road extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("gamebgm.mp3");
    public static int speed = 0;
    public road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 410, 1); 
        stopped();
        started();
        prepare();
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(200)<1)
    {
        enemy();
    }
    if(Greenfoot.getRandomNumber(200)<1)
    {
        Enemy2();
    }
    if(Greenfoot.getRandomNumber(200)<1)
    {
        Enemy3();
    }
    if(Greenfoot.getRandomNumber(200)<1)
    {
        Enemy4();
    }
    if(Greenfoot.getRandomNumber(100)<1)
    {
      gas();  
    }
    
    if(Greenfoot.getRandomNumber(3)<1)
    {
      effects();  
    }
    if(Greenfoot.getRandomNumber(3)<1)
    {
      CopyOfeffects ();  
    }
    }    
    
    private void prepare()
    {
        ae101 ae101 = new ae101();
        addObject(ae101,380,263);
        
        

        ae101.setLocation(352,268);
        ae101.setLocation(276,268);
        ae101.getRotation();
    }
    
    public void stopped()
    {
     backgroundMusic.stop();
    }
 
    public void started()
    {
    backgroundMusic.playLoop();
    backgroundMusic.setVolume(30);
    }
    
    public void enemy()
    {
        addObject(new enemy(), 900 ,Greenfoot.getRandomNumber(400));
    }
    
    public void Enemy2()
    {
            addObject(new enemy3(), 900   ,Greenfoot.getRandomNumber(400));
    }
    
    public void Enemy3()
    {
            addObject(new integra(), 900   ,Greenfoot.getRandomNumber(400));
    }
    
    public void Enemy4()
    {
            addObject(new gt86(), 900   ,Greenfoot.getRandomNumber(400));
    }
    
    public void gas()
    {
            addObject(new gas(),  900 , Greenfoot.getRandomNumber(263));
    }
    
    public void effects()
    {
            addObject(new effects(),  Greenfoot.getRandomNumber(400)+ 900 , 305 );
    }
    
    public void CopyOfeffects ()
    {
            addObject(new CopyOfeffects (),  Greenfoot.getRandomNumber(400)+ 900 , 98 );
    }
    
    
    }
