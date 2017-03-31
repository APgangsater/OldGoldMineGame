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
        GreenfootImage image = new  GreenfootImage(500, 380);
        int x ;
    public Fade(){
        x=0;
image.setColor(java.awt.Color.BLACK);
image.fill();
image.setTransparency(x);
setImage(image);
    }
    public void act() 
    {
        if(x<250){
            x+=10; 
              image.setTransparency(x);
        }
        else{
            Greenfoot.setWorld(new MineEasy(SelectMode.level));
        }
      
       
    }    
}
