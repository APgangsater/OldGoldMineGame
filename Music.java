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
    GreenfootImage image = getImage(); // get the image and set it into "image".
    setImage(image); // set the image.
    image.scale(60 , 60); // scale the image size.
    
    }
    String image1 = "Sound.png";
    String image2 = "Muted_Sound.png";
    public void act() 
    {
        // Add your action code here.
        check();
    } 
    public void check(){ //To check if this object has been clicked, est the image and stop the scenario.
       if(Greenfoot.mouseClicked(this))
        {
        setImage(image2);
        GreenfootImage image = getImage();
        image.scale(60, 60);
        Greenfoot.stop(); // stop the scenario.
        }
    }
    public void play()
    {
    Greenfoot.playSound("Moaning.mp3"); // play the moarning sound.
    }
}
