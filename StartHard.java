import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartHard extends Actor
{
    /**
     * Act - do whatever the StartHard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MineHard MH = new MineHard();
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.playSound("Clicking.wav");    
        Greenfoot.setWorld(MH);
        
        }
    }    
}
