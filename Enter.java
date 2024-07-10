import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Actor
{
    /**
     * Act - do whatever the Enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new road());
        }
    }
    
    public Enter()
    {
        getImage().scale(900,480);
    }
}
