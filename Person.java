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
     static String high ;
     static String name;
     static int highScore = 0;
     static int score;
     static int pu;
     static boolean in;
     boolean dead;
     public Person()
     {
            this(0,0,false,false);

      
        }
             public Person(int score,int pu,boolean in,boolean dead){
                   Ask(); // getting the name from the user.
            this.score = score;
            this.pu = pu;
            this.in = in;
            this.dead = dead;
        }
   public void act() 
    {
        CheckPo();
        Po();
        getScore();
        checkKeypress();
        checkScore();
       
    
    }  
    
        
    public void Ask(){// To get User's name
                         while(true){
 String x =Greenfoot.ask("Please input your name? (8 characters maximum )"); 
 if(x.length()<=8){
     name =x; 
     break;
    }
}
        
    }
     
   
    
    public void moveYou(int dir) // to move your character
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

        public boolean canYouMove(int canYou) // to check the obstacle
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
    
    public void checkKeypress()//Check if the specify key is press.
    {
        int whichWay;
  
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) 
        {
            whichWay = 0;
            setImage("personright.png" );
            if(getX()==15&&getWorld().getObjectsAt(0,getY(),Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( 0 , getY());
            }
     else if (canYouMove(whichWay) == true){
 
                moveYou(whichWay);}
      
    }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) 
        {
            whichWay = 1;
            setImage("personleft.png");
            
             if(getX()==0&&getWorld().getObjectsAt(16,getY(),Rock.class).isEmpty()){//warp if warpable and there are no rocks in the way.
                 setLocation( 16 , getY());
            }
     else if (canYouMove(whichWay) == true){
 
                moveYou(whichWay);}
    
        }
    if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) 
        {
            whichWay = 2;
            setImage("personup.png");
         
           
              if(getY()==0&&getWorld().getObjectsAt(getX(),15,Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( getX(),15);
            }
     else if (canYouMove(whichWay) == true){
 
                moveYou(whichWay);}
    }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) 
        {
            whichWay = 3;
            setImage("persondown.png");
             
          if(getY()==15&&getWorld().getObjectsAt(getX(),0,Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( getX(),0);
            }
     else if (canYouMove(whichWay) == true){
 
                moveYou(whichWay);}
        }
    }
            
    
    
    public void CheckPo(){ // For collecting power ups
        if(isTouching(Pwr.class)&&!in){
            Greenfoot.playSound("Go.mp3");
            in = true;
            removeTouching(Pwr.class);
        }
    }
    public void Po(){ //Transparency when pick up power ups
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
    public void checkScore() //check the highest score.
    {
        
   
     if(score > highScore)
    {
        high =name;
    highScore = score;
    }
    else if(high==null){
      high =name;
    }

    }
    
   
    public void death() // to check if you touch zombie the game will be over
    {
    Actor zombie = getOneObjectAtOffset(0 , 0, Zombie.class);
    if(zombie != null && isTouching(Zombie.class)&&!in) 
    {
           
        dead = true;
          checkScore();
    getWorld().removeObject(this);
    Greenfoot.playSound("Scream.wav");
    Greenfoot.setWorld(new ToMainMenu());
    }
    }
    
    
    public void getScore()// to get the score when you collect the gold bars
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
