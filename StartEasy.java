import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartEasy extends Actor
{
    /**
     * Act - do whatever the StartEasy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   String o [] = {"Start_Easy.png","Start_Normal.png","Start_Hard.png"};
   int ok;
   public StartEasy(int y){
      setImage(o[y]);
       ok =y;
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.playSound("Clicking.wav");   
              getWorld().addObject(new Fade(),getWorld().getWidth()/2,getWorld().getHeight()/2);
       SelectMode.level =ok;
        }
    }    
}
