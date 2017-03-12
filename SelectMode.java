import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectMode extends World
{

    /**
     * Constructor for objects of class SelectMode.
     * 
     */
    public SelectMode()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 380, 1); 
        addObject(new StartEasy() , 250 , 110);
        addObject(new StartNormal() , 250 , 200);
        addObject(new StartHard() , 250 , 290);
    }
   
}
