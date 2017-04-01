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
    
    public ScoreBoard(){
        setImage(new GreenfootImage("GAME OVER  " +"\nTop Player: "+Person.high +"  High Score: " + (Person.highScore)+"\nPlayer: "+Person.name +"  Score: " + (Person.score), 30 , Color.WHITE , Color.BLACK));
        getImage();  
    }   
}
