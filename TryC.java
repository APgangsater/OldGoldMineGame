import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryC extends Actor
{
    /**
     * Act - do whatever the TryC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicking.wav");
        Person.score = 0;

        Greenfoot.setWorld(new MineHard());
        }
    }    
    public TryC()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(50 , 50);
    }
}
