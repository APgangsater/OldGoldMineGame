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
    public MineEasy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 16, 32); 
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
        addObject(new TryA() , 2 , 0);
        addObject(new MainMenu() , 12 , 1);
        
    }
    int timer = 40;
    int spawn = 0;
    
    public void act()
    {
         showText("Time : " + time , 8 , 0);
         showText("Score : " + Person.score , 8 , 2);
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
            if(getObjectsAt(x , y ,(Rock.class)).size() == 0)
            {
            addObject(new Goldbar(), x, y);
            
        }
        spawn = 0;
            }
      
    timer = 40;
    }
    timer -=2 ;
}
    
   
}
