import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryA extends Actor
{
    /**
     * Act - do whatever the TryA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicking.wav");  
        Person.score = 0;
        
        Greenfoot.setWorld(new MineEasy());
        }
        
    }   
    public TryA()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(50 , 50);
    }
}
