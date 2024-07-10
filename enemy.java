import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class enemy extends Parent
{
    
    int speed = Greenfoot.getRandomNumber(10);
    int rightSideofScreen, bottomofScreen;
    int score ;
    public enemy ()
        {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(170,60);
        }
     
    
    public void act()
    {
        // Add your action code here.
        
        enemy a = new enemy();
        //Actor i = getOneIntersectingObject(enemy.class);
        deductscore();
        move(speed -15);
        
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
