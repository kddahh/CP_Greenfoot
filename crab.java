import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int xpos = getX();
        int ypos = getY();
        if(Greenfoot.isKeyDown("up")) {
            setRotation(0);
            ypos -= speed;
        }
        if(Greenfoot.isKeyDown("down")) {
           setRotation(180);
            ypos += speed;
        }
        if(Greenfoot.isKeyDown("left")) {
            setRotation(270);
            xpos -= speed;
        }
        if(Greenfoot.isKeyDown("right")) {
            setRotation(90);
            xpos += speed;
        }
        setLocation(xpos, ypos);
    }
}