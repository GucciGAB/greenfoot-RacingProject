import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy3 extends Parent
{
    int speed = Greenfoot.getRandomNumber(10);
    int score;
    public enemy3 ()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(180,80);
    }
    public void act()
    {
        
        //Actor i = getOneIntersectingObject(enemy3.class);
        move(speed - 15); 
        deductscore();
        
        removeEnemy3();
    }
    
    public void removeEnemy3()
    {
        if (getX()== 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void deductscore(){
        if(isTouching(gas.class)){
            score = score - 10;
            removeTouching(gas.class);
        }
    }
    
    }
