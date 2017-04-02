import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends Actor
{
    /**
     * Act - do whatever the HowTo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HowTo() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("HOW TO PLAY" , 100 , Color.WHITE , Color.BLACK)); // create a new image with the word "HOW TO PLAY" in white and the Bg in black.
        getImage();
    }    
}
