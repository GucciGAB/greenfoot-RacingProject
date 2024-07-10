import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas extends Parent
{
    public gas(){
        GreenfootImage myImage = getImage();
    int myNewHeight = (int)myImage.getHeight();
    int myNewWidth = (int)myImage.getHeight();
    myImage.scale(40,60);
    }
    public void act()
    {
        // Add your action code here.
        move (-7);
        removeGas();
    }
    public void removeGas()
    {
        if (getX()== 0)
        {
            getWorld().removeObject(this);
        }
    }
}
