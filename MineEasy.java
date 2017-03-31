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
    int  time = 90;
    static int level;
    
    int timer = 40;
    int spawn = 0;
        int spn;
    public MineEasy(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 16, 32); 
        this.level = level;
 
        addObject(new TryA() , 2 , 0);
        addObject(new MainMenu() , 12 , 1);
            if(level==0){
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
    if(level==1){
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
    if(level==2){
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

    public void act()
    {
         showText("Time : " + time , 8 , 0);
         showText("Score : " + Person.score , 8 , 2);
          showText("Invincibility : " + Person.in , 8 , 4);
   spwnPo();
          spn++;
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
            if(getObjectsAt(x , y ,(Rock.class)).size() == 0&&getObjectsAt(x , y ,(Pwr.class)).size() == 0)
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
    timer -=2 ;
}
  public void spwnPo(){
    int x,y;
            
                x = Greenfoot.getRandomNumber(10)+1;
                y = Greenfoot.getRandomNumber(10)+1;
                    if(getObjectsAt(x , y ,(Rock.class)).size() == 0&&getObjectsAt(x , y ,(Goldbar.class)).size() == 0&&getObjectsAt(x , y ,(Pwr.class)).size() == 0)
            {
                if(spn>=50){
            addObject(new Pwr(), x, y);
            spn=0;
        }
        }
}  
   
}
