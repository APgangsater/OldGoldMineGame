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
    static int level; // use to determind the current level.
    public SelectMode()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 380, 1); 
   SpwnSelect();
    }
    public void SpwnSelect(){ //Spawn level selection buttons.
           for(int i=0;i<3;i++){
        addObject(new StartEasy(i) , 250 , 110+(90*i));
    }   
    }
   
}
