 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MineNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MineNormal extends World
{

    /**
     * Constructor for objects of class MineNormal.
     * 
     */
    int time = 90;
    public MineNormal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 16, 32); 
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
        addObject(new TryB() , 2 , 0);
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
            if(spawn == 2)
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
