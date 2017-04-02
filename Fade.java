import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Fade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fade extends Actor
{
    /**
     * Act - do whatever the Fade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        GreenfootImage image = new  GreenfootImage(500, 380); // create an image.
        int x ; // this is for fading.
    public Fade(){// Create a black rectangle with 0 transparency.
        x=0; // fading
image.setColor(java.awt.Color.BLACK); // set this object's color to black.
image.fill(); // fill the object with the current color.
image.setTransparency(x); //set the current transparency to 0 ; x=0.
setImage(image); // set the iamge.
    }
    public void act() 
    {
      fadeOut();
      
       
    }    
    public void fadeOut(){ //Fading out
          if(x<250){ // the max transparency of an image is 255.
            x+=10;  //increase the x by 10
              image.setTransparency(x); // set the transparency equal to x.
        }
        else{
            Greenfoot.setWorld(new MineEasy(SelectMode.level)); // if x is more than or equal 250, set the world MineEasy.
        }
    }
}
