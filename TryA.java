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
     checkCk();
        
    }   
    public void checkCk(){// Check if this object has been clicked or not.
          if(Greenfoot.mouseClicked(this))//If clicked, create a world with the specific level.
        {
            Greenfoot.playSound("Clicking.wav");  
        Greenfoot.setWorld(new MineEasy(MineEasy.level));
        } 
    }
    public TryA()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(50 , 50);
    }
}
