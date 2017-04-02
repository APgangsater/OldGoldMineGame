import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goldbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goldbar extends Actor
{
    /**
     * Act - do whatever the Goldbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Goldbar() //Constuctor for making the gold bar image.
    {
    GreenfootImage image = getImage(); // get the image and store it in "image".
    setImage(image);  // set the "image".
    image.scale(30 , 30); // scale the size of the image.
    }
   
}
