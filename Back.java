import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Actor
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back() //To make image.
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(100 , 100);
    }
   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))//When this object is clicked.
        {
            Greenfoot.playSound("Clicking.wav"); //Play this Sound.
        Greenfoot.setWorld(new MyWorld()); //Set the world MyWorld.
        
        }
    }    
}
