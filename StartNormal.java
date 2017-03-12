import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartNormal extends Actor
{
    /**
     * Act - do whatever the StartNormal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MineNormal MN = new MineNormal();
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.playSound("Clicking.wav");   
        Greenfoot.setWorld(MN);
        }
    }    
}
