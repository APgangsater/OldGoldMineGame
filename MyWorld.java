import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static GreenfootSound sound = new GreenfootSound("calm1.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 380, 1); 
       //Greenfoot.playSound("Moaning.mp3");
 
      addObject(new Play() , 270 , 230);

      
    }
    public void started()
    {
      sound.playLoop();
    }
}

