import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MineHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MineHard extends World
{

    /**
     * Constructor for objects of class MineHard.
     * 
     */
    public MineHard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(16, 16, 32);
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
        addObject(new TryC() , 2 , 0);
        addObject(new MainMenu() , 12 , 1);
    }
   int time = 90;
     int timer = 20;
    int spawn = 0;
    ToMainMenu TMM = new ToMainMenu();
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
            Greenfoot.setWorld(TMM);
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
