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
     static String high ; // highest score name.
     static String name; // current player name.
     static int highScore = 0; // highest score.
     static int score; // current score.
     static int pu; // invincibility time;
     static boolean in; // invincibility.
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
                         while(true){ //Will end if the name length is less than or equal 8.
 String x =Greenfoot.ask("Please input your name? (8 characters maximum )"); //Using the ask method, you will get the player's name.
 if(x.length()<=8){ //To check the length.
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
  
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))  // move to the right if the specific key is pressed.
        {
            whichWay = 0;
            setImage("personright.png" ); // set the image to facing right.
            if(getX()==15&&getWorld().getObjectsAt(0,getY(),Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( 0 , getY());
            }
     else if (canYouMove(whichWay) == true){ // if there are no rocks in the desired direction.
 
                moveYou(whichWay);}
      
    }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) // move to the left if the specific key is pressed.
        {
            whichWay = 1;
            setImage("personleft.png");// set the image to facing left.
            
             if(getX()==0&&getWorld().getObjectsAt(16,getY(),Rock.class).isEmpty()){//warp if warpable and there are no rocks in the way.
                 setLocation( 16 , getY());
            }
     else if (canYouMove(whichWay) == true){// if there are no rocks in the desired direction.
 
                moveYou(whichWay);}
    
        }
    if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) // move up if the specific key is pressed.
        {
            whichWay = 2;
            setImage("personup.png");// set the image to facing up.
         
           
              if(getY()==0&&getWorld().getObjectsAt(getX(),15,Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( getX(),15);
            }
     else if (canYouMove(whichWay) == true){// if there are no rocks in the desired direction.
 
                moveYou(whichWay);}
    }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S"))  // move down if the specific key is pressed.
        {
            whichWay = 3;
            setImage("persondown.png"); // set the image to facing down.
             
          if(getY()==15&&getWorld().getObjectsAt(getX(),0,Rock.class).isEmpty()){ //warp if warpable and there are no rocks in the way.
                 setLocation( getX(),0);
            }
     else if (canYouMove(whichWay) == true){// if there are no rocks in the desired direction.
 
                moveYou(whichWay);}
        }
    }
            
    
    
    public void CheckPo(){ // For collecting power ups
        if(isTouching(Pwr.class)&&!in){ // if this object touches the power up.
            Greenfoot.playSound("Go.mp3"); // play this sound.
            in = true; // Activate the invincibility.
            removeTouching(Pwr.class); // remove the touching power up.
        }
    }
    public void Po(){ //Transparency when pick up power ups
        if(in){ //while being invincible.
            pu++; // increase the invinciblity time.
            getImage().setTransparency(100); //make the image transparent.
        }
        if(pu>=30){ // if the invinciblity time reaches 30.
            in=false; // Deactivate the invincibility.
            getImage().setTransparency(255); // set the image to normal transparency
            pu = 0; // reset the invinciblity time.
        }
    }
    public void checkScore() //check the highest score.
    {
        
   
     if(score > highScore) // if the score is higher than the high score.
    {
        high =name; //replace the highest score name with the current name.
    highScore = score;//replace the highest score with the current score.
    }
    else if(high==null){ // if there is no high score yet.
      high =name; // set the current name.
    }

    }
    
   
    public void death() // to check if you touch zombie the game will be over
    {
    Actor zombie = getOneObjectAtOffset(0 , 0, Zombie.class);
    if(zombie != null && isTouching(Zombie.class)&&!in) //if this object touches the zombie while invincibility is still deactivate.
    {
           
        dead = true;
          checkScore(); // check the score.
    getWorld().removeObject(this); // remove this object.
    Greenfoot.playSound("Scream.wav");
    Greenfoot.setWorld(new ToMainMenu()); // go to the score menu.
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
