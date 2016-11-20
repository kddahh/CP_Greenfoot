import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public void regenerateWorms(){
        List<worm> Worm = getObjects(worm.class);
        int worms;
       for(worms = 0; worms < 10; worms ++){
           addObject(new worm(), Greenfoot.getRandomNumber(1346), Greenfoot.getRandomNumber(890));
        }
        if(Worm.size() < 10){
        addObject(new worm(), Greenfoot.getRandomNumber(1346), Greenfoot.getRandomNumber(890));
       }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1346, 890, 1); 
        
        regenerateWorms();
        addObject(new crab(), 110, 100);
        addObject(new lobster(), 1200, 750);
        addObject(new turtle(), 400, 300);
    }
}

