import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("GAME OVER  " +"\nScore: " + (Person.score) +"\nHigh Score: " + (Person.highScore) , 75 , Color.WHITE , Color.BLACK));
        getImage();
    }    
}
