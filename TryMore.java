import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class TryMore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryMore extends Actor
{
    /**
     * Act - do whatever the TryMore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public TryMore(){
      setImage(new GreenfootImage("Try Again?" , 50 , Color.WHITE , Color.BLACK));
        getImage();
     }
    public void act() 
    {
        // Add your action code here.
       check();
    
    }  
    public void check(){
          if(Greenfoot.mouseClicked(this))//To check if the mouse clicked 
        {
        Greenfoot.playSound("Clicking.wav");   
        Greenfoot.setWorld(new SelectMode());
    }  
    }
}
