import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ae101 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ae101 extends Actor
{
    int score = 0;
    
    int length = getImage().getWidth();  
    
    public ae101 ()
    {
    GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight();
    int myNewWidth = (int)myImage.getHeight();
    myImage.scale(180,60);
    }
    
    
        
    
    public void act()
    {
        Keys();
        end();
        adddscore();
        getWorld().showText(" Score : " + score, 70,30);
        
        
        
    }
    public void Keys()
    {
        
        if (Greenfoot.isKeyDown("right"))
        {
        if(getX() >= 100){
            setLocation(getX() + 4, getY());}
        }
    
        if (Greenfoot.isKeyDown("left"))
        {
        if(getX() >= 120){
            setLocation(getX() - 4, getY());}
        }
        if (Greenfoot.isKeyDown("up")){
        {
        setLocation(getX(),getY()-5);}
        }
        if (Greenfoot.isKeyDown("down")){
        {
        setLocation(getX(),getY()+5);}
        }
    }
    
    public void end()
    {
        Actor enemy, enemy3, gt86,integra;
        enemy = getOneObjectAtOffset(0,0,enemy.class);
        if (enemy!=null)
            {
            World detect;
                 detect = getWorld();
                 getWorld().showText("Game Over \n score: " + score, 470,200);
                 Greenfoot.playSound("gameoverbgm.mp3");
            getWorld().addObject(new gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                 
            Greenfoot.stop();
            }
        
        enemy3 = getOneObjectAtOffset(0,0,enemy3.class);   
        if (enemy3!=null)
            {
            World detect;
                 detect = getWorld();
                 getWorld().showText("Game Over \n score: " + score, 470,200); 
                 Greenfoot.playSound("gameoverbgm.mp3");
            getWorld().addObject(new gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                
            Greenfoot.stop();
            }
            
        gt86 = getOneObjectAtOffset(0,0,gt86.class);   
        if (gt86!=null)
            {
            World detect;
                 detect = getWorld();
                 getWorld().showText("Game Over \n score: " + score, 470,200); 
                 Greenfoot.playSound("gameoverbgm.mp3");
            getWorld().addObject(new gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                 
            Greenfoot.stop();
            }  
         
        integra = getOneObjectAtOffset(0,0,integra.class);   
        if (integra!=null)
            {
            World detect;
                 detect = getWorld();
                 getWorld().showText("Game Over \n score: " + score, 470,200); 
                 Greenfoot.playSound("gameoverbgm.mp3");
            getWorld().addObject(new gameover(), getWorld().getWidth()/2, getWorld().getHeight()/2);
                
            Greenfoot.stop();
            }      
    }
    
    public void adddscore(){
        if(isTouching(gas.class)){
            score = score + 20;
            removeTouching(gas.class);
        }
    }
    
    



    
    
    }
