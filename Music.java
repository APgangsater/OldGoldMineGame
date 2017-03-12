import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Music()
    {
    GreenfootImage image = getImage();
    setImage(image);
    image.scale(60 , 60);
    
    }
    String image1 = "Sound.png";
    String image2 = "Muted_Sound.png";
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        setImage(image2);
        GreenfootImage image = getImage();
        image.scale(60, 60);
        Greenfoot.stop();
        }
    } 
    public void play()
    {
    Greenfoot.playSound("Moaning.mp3");
    }
}
