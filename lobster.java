import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge() )
        {
            turn(17);
        }    
        
        if (Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        move(5);
    }
}
