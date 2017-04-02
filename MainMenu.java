import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends Actor
{
    /**
     * Act - do whatever the MainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))//To check if click the world will change to Selectmode
        {
            Greenfoot.playSound("Clicking.wav");
        Person.score = 0;
     
        Greenfoot.setWorld(new SelectMode());
        }
    }    
    public MainMenu()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(250 , 250);
    }
}
