import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryB extends Actor
{
    /**
     * Act - do whatever the TryB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicking.wav");
        Person.score = 0;
        MineEasy.time = 90;
        Greenfoot.setWorld(new MineNormal());
        }
    }    
    public TryB()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(50 , 50);
    }
}
