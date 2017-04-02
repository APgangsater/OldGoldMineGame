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
        check();
     
    }    
    public MainMenu()
    {
    GreenfootImage image = getImage(); // get the image and set it into "image".
    setImage(image); // set the image.
    image.scale(250 , 250); // scale the size of the image.
    }
    public void check(){
       if(Greenfoot.mouseClicked(this))//To check if click the world will change to Selectmode
        {
            Greenfoot.playSound("Clicking.wav"); //play the clicking sound.
     
        Greenfoot.setWorld(new SelectMode()); // set a new world.
        }
    }
}
