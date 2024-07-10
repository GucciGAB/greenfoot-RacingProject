import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gt86 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gt86 extends Parent
{
    
    int speed = Greenfoot.getRandomNumber(10);
    int rightSideofScreen, bottomofScreen;
    int score ;
    public gt86 ()
        {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(180,60);
        }
     
    
    public void act()
    {
        // Add your action code here.
        
        enemy a = new enemy();
        //Actor i = getOneIntersectingObject(enemy.class);
        deductscore();
        move(speed - 15);
        
        removeEnemy();
        
        
    }
    
    public void removeEnemy()
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
