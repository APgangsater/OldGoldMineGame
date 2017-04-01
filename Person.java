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
     
     static int highScore = 0;
     static int score = 0;
     static int pu=0;
     static boolean in = false;
     boolean dead;
     boolean wrap = true;
     public Person()
     {
        dead = false;
        }
    public void act() 
    {
        CheckPo();
        Po();
        getScore();
        checkKeypress();
        checkScore();
        death();
        if(dead == false)
        {
       wrap();
    }
    }  
    
        
    public void wrap()
    {
       
        World myWorld = getWorld();
        Actor person = getOneObjectAtOffset(0 , 0, Person.class);
         
     
        if(dead == false){
     if(isAtEdge() && this.getX() == 15 && wrap ==true)
        {
            if(person == null){
        setLocation( 0 , getY());
    }
    
        }
        else
        if(isAtEdge() && this.getX() == 0)
        {
            if(person == null)
            {
        setLocation( 15 , getY());
        }
    }
        
    }
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
            
    
    
    public void CheckPo(){
        if(isTouching(Pwr.class)&&!in){
            Greenfoot.playSound("Go.mp3");
            in = true;
            removeTouching(Pwr.class);
        }
    }
    public void Po(){
        if(in){
            pu++;
            getImage().setTransparency(100);
        }
        if(pu>=30){
            in=false;
            getImage().setTransparency(255);
            pu = 0;
        }
    }
    public void checkScore()
    {
    if(score > highScore)
    {
    highScore = score;
    }
    }
    
   
    public void death()
    {
    Actor zombie = getOneObjectAtOffset(0 , 0, Zombie.class);
    if(zombie != null && isTouching(Zombie.class))
    {
        dead = true;
    getWorld().removeObject(this);
    Greenfoot.playSound("Scream.wav");
    Greenfoot.setWorld(new ToMainMenu());
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
