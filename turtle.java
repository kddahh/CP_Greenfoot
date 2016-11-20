import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor implements Freezable
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    public void act() 
    {
    
        if (counter < 0){
            move();
            counter --;
        }
        else
            counter --;
        if(counter < -Greenfoot.getRandomNumber(500)){
            freeze(Greenfoot.getRandomNumber(100)+50);
        }
    }
    public void move(){
        if (isAtEdge() )
        {
            turn(17);
        }
        
        if (Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        move(2);
    }
    public void freeze(int count){
        counter = count;
    }
    public turtle() {
        counter = 100;
    }
}
