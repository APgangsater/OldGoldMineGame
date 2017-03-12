import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ToMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMainMenu extends World
{

    /**
     * Constructor for objects of class ToMainMenu.
     * 
     */
    public ToMainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       addObject(new ScoreBoard() , this.getWidth()/2 , 120);
       addObject(new Back() , 537 , 344);
       addObject(new TryMore() , 103 , 375);
       //addObject(new TryAgain() , 100 , 100);
    }
}
