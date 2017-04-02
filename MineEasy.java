import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MineEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MineEasy extends World
{

    /**
     * Constructor for objects of class MineEasy.
     * 
     */
    int  time = 90; // time limit.
    static int level; // the current level.
    
    int timer = 40;
    int spawn = 0;
        int spn; // delay between spawning a power up.
    public MineEasy(int level) //To get Level of game there are easy , normal , hard
    {    
        // Create a new world with 16x16 cells with a cell size of 32x32 pixels.
        super(16, 16, 32); 
        
        this.level = level; // get the level.
        deterLe(); // To determind the level and create objects respond to the level.
        addObject(new TryA() , 2 , 0); // add a restart button.
        addObject(new MainMenu() , 12 , 1); // add a main menu button.
           
    }

    public void act() 
    {
         showText("Time : " + time , 8 , 0); // Show the time.
         showText("Score : " + Person.score , 8 , 2); // Show the player's score.
          showText("Invincibility : " + Person.in , 8 , 4); // Show the current state of invincibility.
   spwnPo(); // see spwnPo method.
          spn++;
    spwner();
    timer -=2 ;
}
public void spwner(){ //To spawn power up
      if(timer == 0)
        {
            spawn++;
            time --;
          
            if(time == 0)
            {
            Greenfoot.setWorld(new ToMainMenu());
            }
            if(spawn == 3)
            {
                int x,y;
            
                x = Greenfoot.getRandomNumber(10)+1;
                y = Greenfoot.getRandomNumber(10)+1;
            if(getObjectsAt(x , y ,(Rock.class)).size() == 0&&getObjectsAt(x , y ,(Pwr.class)).size() == 0&&getObjectsAt(x , y ,(Person.class)).size() == 0)
            {
            addObject(new Goldbar(), x, y);
            if(Greenfoot.getRandomNumber(100)<=20){
              addObject(new Pwr(), x, y);  
            }
            
        }
        spawn = 0;
            }
      
    timer = 40;
    }
}
public void deterLe(){ //check which level is selected and create the needed objects .
     if(level==0){ //Easy Mode
               for(int i = 1; i <=15; i++)
        {
        addObject(new Rock() , 0, i);
        addObject(new Rock() , i , 0);
        addObject(new Rock() , 15 , i);
        addObject(new Rock() , i , 15);
        }
        addObject(new Person() , 1 , 14);
        addObject(new Rock(), 6 , 10);
        addObject(new Rock(), 8 , 13);
        addObject(new Rock(), 12 , 11);
        addObject(new Rock(), 4 , 11);
        addObject(new Rock(), 8 , 6);
        addObject(new Rock(), 12 , 3);
        addObject(new Rock(), 3 , 4);
        addObject(new Rock(), 7 , 2);
        addObject(new Rock(), 3 , 9);
        addObject(new Rock(), 12 , 3);
        addObject(new Rock(), 1 , 7);
        addObject(new Rock(), 14 , 5);
        addObject(new Rock(), 9 , 3);
        addObject(new Goldbar(), 4 , 4);
        addObject(new Goldbar(), 13 , 3);
        addObject(new Goldbar(), 10 , 8);
        addObject(new Goldbar(), 14 , 13);
        addObject(new Zombie() , 11 , 3);
        addObject(new Zombie() , 8 , 8);
        spn=50;
    }
    if(level==1){ // Normal mode.
        addObject(new Person() , 1 , 14);

        addObject(new Rock(), 9 , 15 );
        addObject(new Rock(), 13 , 14 );
        addObject(new Rock(), 5 , 14 );
        addObject(new Rock(), 1 , 13 );
        addObject(new Rock(), 13 , 11 );
        addObject(new Rock(), 10 , 10 );
        addObject(new Rock(), 6 , 11 );
        addObject(new Rock(), 2 , 11 );
        addObject(new Rock(), 15 , 7 );
        addObject(new Rock(), 2 , 9 );
        addObject(new Rock(), 12 , 8 );
        addObject(new Rock(), 9 , 6 );
        addObject(new Rock(), 5 , 7 );
        addObject(new Rock(), 1 , 5 );
        addObject(new Rock(), 13 , 3 );
        addObject(new Rock(), 6, 3);
        addObject(new Rock(), 11 , 1 );
        addObject(new Rock(), 2 , 1 );
        addObject(new Rock(), 0 , 15 );
        addObject(new Rock(), 0 , 14 );
        addObject(new Rock(), 7 ,  0);
        addObject(new Goldbar() , 15 , 15);
        addObject(new Goldbar() , 15 , 0);
        addObject(new Goldbar() , 8 , 7);
        addObject(new Goldbar() , 0 , 3);
        addObject(new Zombie() , 2 , 7);
        addObject(new Zombie() , 9 , 3);
        addObject(new Zombie() , 14 , 9);
          spn=70; 
    }
    if(level==2){ // Hard mode.
         addObject(new Person() , 1 , 14);
        addObject(new Rock() , 1 , 15);
        addObject(new Rock() , 8 , 15);
        addObject(new Rock() , 12 , 15);
        addObject(new Rock() , 5 , 14);
        addObject(new Rock() , 15 , 13);
        addObject(new Rock() , 9 , 13);
        addObject(new Rock() , 12 , 12);
        addObject(new Rock() , 10 , 11);
        addObject(new Rock() , 7 , 11);
        addObject(new Rock() , 2 , 11);
        addObject(new Rock() , 1 , 12);
        addObject(new Rock() , 15 , 10);
        addObject(new Rock() , 12 , 9);
        addObject(new Rock() , 4 , 9);
        addObject(new Rock() , 1 , 9);
        addObject(new Rock() , 11 , 8);
        addObject(new Rock() , 13 , 7);
        addObject(new Rock() , 10 , 7);
        addObject(new Rock() , 9 , 7);
        addObject(new Rock() , 8 , 7);
        addObject(new Rock() , 7 , 7);
        addObject(new Rock() , 2 , 6);
        addObject(new Rock() , 5 , 5);
        addObject(new Rock() , 12 , 5);
        addObject(new Rock() , 9 , 4);
        addObject(new Rock() , 13 , 2);
        addObject(new Rock() , 3 , 3);
        addObject(new Rock() , 4 , 2);
        addObject(new Rock() , 1 , 1);
        addObject(new Rock() , 9 , 1);
        addObject(new Rock() , 10 , 0);
        addObject(new Rock() , 0 , 0);
        addObject(new Rock() , 0 , 7);
        addObject(new Rock() , 5 , 0);
        addObject(new Rock() , 15 , 0);
        addObject(new Rock() , 15 , 8);
        
        addObject(new Goldbar() , 15 , 2);
        addObject(new Goldbar() , 12 , 8);
        addObject(new Goldbar() , 15 , 15);
        addObject(new Goldbar() , 3 , 2);
        addObject(new Goldbar() , 9 , 0);
        addObject(new Goldbar() , 2 , 9);
        
        addObject(new Zombie() , 13 , 13);
        addObject(new Zombie() , 12 , 6);
        addObject(new Zombie() , 6 , 0);
        addObject(new Zombie() , 1 , 4);
        addObject(new Zombie() , 7 , 9);
          spn=90;
    }
    
}
  public void spwnPo(){ //To spawn power up
    int x,y;
            
                x = Greenfoot.getRandomNumber(10)+1; // get the location x randomly.
                y = Greenfoot.getRandomNumber(10)+1; // get the location y randomly.
                // if that location doesn't have a rock,a goldbar,a power up, and a person. Spawn a power up there.
                    if(getObjectsAt(x , y ,(Rock.class)).size() == 0&&getObjectsAt(x , y ,(Goldbar.class)).size() == 0&&getObjectsAt(x , y ,(Pwr.class)).size() == 0&&getObjectsAt(x , y ,(Person.class)).size() == 0)
            {
                if(spn>=50){ 
            addObject(new Pwr(), x, y); // spawn a power up.
            spn=0; // reset the delay.
        }
        }
}  
   
}
