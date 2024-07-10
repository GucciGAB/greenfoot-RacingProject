import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class effects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class effects extends Parent
{
    int speed = -25;
    public effects ()
        {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(70,7);
        }
    public void act()
    {
        enemy a = new enemy();
        //Actor i = getOneIntersectingObject(enemy.class);
        move(speed);
        removeEffects();
    }
    public void removeEffects()
    {
        if (getX()== 0)
        {
            getWorld().removeObject(this);
        }
    }
    
}
