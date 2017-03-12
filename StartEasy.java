import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartEasy extends Actor
{
    /**
     * Act - do whatever the StartEasy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MineEasy ME = new MineEasy();
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.playSound("Clicking.wav");   
        Greenfoot.setWorld(ME);
        }
    }    
}
