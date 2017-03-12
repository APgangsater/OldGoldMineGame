import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class NextPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextPlay extends Actor
{
    /**
     * Act - do whatever the NextPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("NEXT" , 100 , Color.WHITE , Color.BLACK));
        getImage();
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.playSound("Clicking.wav");   
        Greenfoot.setWorld(new SelectMode());
    }    
}
}
