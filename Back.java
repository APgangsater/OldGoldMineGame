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
    public Back()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(100 , 100);
    }
    MyWorld MW = new MyWorld();
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Clicking.wav");
        Greenfoot.setWorld(MW);
        Person.score = 0;
        MineEasy.time = 90;
        }
    }    
}
