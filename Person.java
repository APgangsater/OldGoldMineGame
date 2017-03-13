import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
     
     static int highScore = 0;
     static int score = 0;
    public void act() 
    {
        
        getScore();
        checkKeypress();
        checkScore();
    }  
    
        

        public boolean canMove()
        {
        int x = getX();
        int y = getY();
         if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) 
         {
             x++;
            }
            else
             if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) 
         {
             x--;
            }
            else
             if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) 
         {
             y--;
            }
             if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) 
         {
             y++;
            }
        World myWorld = getWorld();
        List rocks = myWorld.getObjectsAt(x, y, Rock.class);
        if(rocks.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public void checkKeypress()
    {
        
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) 
        {
            if(canMove())
            {
            setLocation(getX()+1 , getY());
            setImage("personright.png");
        }
        }
    
    else
         if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) 
        {
            if(canMove())
            {
           setLocation(getX()-1 , getY());
            setImage("personleft.png");
        }
            }
            else
        
            if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) 
        {
            if(canMove())
            {
            setLocation(getX() , getY()-1);
             setImage("personup.png");
        }
        }
        else
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) 
        {
            if(canMove())
            {
           setLocation(getX() , getY()+1);
            setImage("persondown.png");
        }
        }
    }
    public void checkScore()
    {
    if(score > highScore)
    {
    highScore = score;
    }
    }
    
   
        
    
    
    public void getScore()
    {
        Actor goldBar = getOneObjectAtOffset(0, 0, Goldbar.class);
        if(goldBar != null)
        {
            Greenfoot.playSound("PickupGold.aiff");
            getWorld().removeObject(goldBar);
            score+=10;
        }
        
    }
}
