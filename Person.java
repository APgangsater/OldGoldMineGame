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
     static final int east = 0;
     static final int west = 1;
     static final int north = 2;
     static final int south = 3;
     int direction;
     static int amountOfGold = 0;
     static int score = 0;
    public void act() 
    {
        if(foundGold()) {
            mineGold();
        }
        checkKeypress();
    }  
    
    public void moveYou(int dir)
    {
        
        if (dir==0){
            setLocation(getX() + 1, getY());
                
            }
        if (dir==1){
            setLocation(getX() - 1, getY());
                
            }
        if (dir==2){
            setLocation(getX(), getY() - 1);
                
            }
        if (dir==3){
            setLocation(getX(), getY() + 1);
                
            }
        }

        public boolean canYouMove(int canYou)
        {
        
        World myWorld = getWorld();
        int x = getX();
        int y = getY();
        
        if (canYou==0){
            x++;
                
            }
        if (canYou==1){
            x--;
                
            }
        if (canYou==2){
            y--;
                
            }
        if (canYou==3){
            y++;
                
            }
        
        if (x >= myWorld.getWidth() || y >= myWorld.getHeight()) {
            return false;
        }
        else if (x < 0 || y < 0) {
            return false;
        }
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
        int whichWay;
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) 
        {
            whichWay = 0;
            setImage("personright.png" );
            if (canYouMove(whichWay) == true){
            moveYou(whichWay);
        }
    }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) 
        {
            whichWay = 1;
            setImage("personleft.png");
            if (canYouMove(whichWay) == true){
                moveYou(whichWay);
            }
        }
    if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) 
        {
            whichWay = 2;
            setImage("personup.png");
            if (canYouMove(whichWay) == true){
            moveYou(whichWay);
        }
    }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) 
        {
            whichWay = 3;
            setImage("persondown.png");
            if (canYouMove(whichWay) == true){
            moveYou(whichWay);
        }
        }
    }
    
    public boolean foundGold()
    {
        Actor gold = getOneObjectAtOffset(0, 0, Goldbar.class);
        if(gold != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void mineGold()
    {
        Actor gold = getOneObjectAtOffset(0, 0, Goldbar.class);
        if(gold != null) {
            Greenfoot.playSound("PickupGold.aiff");
            getWorld().removeObject(gold);
            amountOfGold = amountOfGold + 1;
            score+=10;
        }
        
    }
}
