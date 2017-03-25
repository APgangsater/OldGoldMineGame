    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.util.List;
    import java.util.ArrayList;
    /**
     * Write a description of class Zombie here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Zombie extends Actor
    {
        /**
         * Act - do whatever the Zombie wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public Zombie()
        {
        GreenfootImage  image = getImage();
        setImage(image);
        image.scale(50 , 50);
        }
       
       int dir;
       final int EAST = 0;
       final int WEST = 1;
       final int NORTH = 2;
       final int SOUTH = 3;
       
       public void act()
       {
        if(canItMove())
        {
        moving();
        }
        else{
        turn();
        }
        kill();
        }
       
       boolean canItMove()
       {
        World world = getWorld();
        int dx = getX();
        int dy = getY();
        if(dir == NORTH)
        {
        dy--;
        }
        else
            if(dir == SOUTH)
            {
            dy++;
            }
            else
            if(dir == EAST)
            {
            dx--;
            }
            if(dir == WEST)
            {
            dx++;
            }
            if(dy >= world.getHeight() || dx >= world.getWidth())
            {
            return false;
            }
                else if(dx < 0 || dy<0)
                {
                return false;
                }
            List rocks = world.getObjectsAt(dx, dy , Rock.class);
            if(rocks.isEmpty())
            {
            return true;
            }
            else
            {
            return false;
            }
        }
        public void turn()
        {
        int randomTurnTimes = Greenfoot.getRandomNumber(3) + 1;
        int p = 0;
        {
        for(int a = 0; a < randomTurnTimes; a++)
        {
            p = Greenfoot.getRandomNumber(2);
            if(p == 1)
            {
            turnRight();
            }
            else
            {
            turnLeft();
            }
            
        }
        }
        }
       public void turnRight()
       {
        if(dir == WEST)
        {
        setDirection(SOUTH);
        }
        else
            if(dir == EAST)
            {
            setDirection(NORTH);
            }
        else
            if(dir == NORTH)
            {
            setDirection(WEST);
            }
            else
                if(dir == SOUTH)
                {
                setDirection(EAST);
                }
        }
       public void turnLeft()
       {
        if(dir == WEST)
        {
        setDirection(NORTH);
        }
            else
                if(dir == EAST)
                {
                setDirection(SOUTH);
                }
                else
                    if(dir == NORTH)
                    {
                    setDirection(EAST);
                    }
                        else
                            if(dir == SOUTH)
                            {
                            setDirection(WEST);
                            }
        }
       public void moving()
       {
           if(!canItMove())
           {
            return;
            }
        if(dir == NORTH )
        {
        setLocation(getX() , getY()-1);
        }
        else
            if(dir == SOUTH)
            {
            setLocation(getX() , getY()+1);
            }
            else
                if(dir == EAST)
                {
                setLocation(getX()-1 , getY()); 
                }
                    else
                    if(dir == WEST)
                    {
                    setLocation(getX()+1 , getY());
                    }
        }
        
         int time = 0;
      GreenfootImage zombieRight1 = new GreenfootImage("ZombieRight_1.png");
      GreenfootImage zombieRight2 = new GreenfootImage("ZombieRight_2.png");
      GreenfootImage zombieRight5 = new GreenfootImage("ZombieRight_5.png");
      GreenfootImage zombieRight7 = new GreenfootImage("ZombieRight_7.png");
       GreenfootImage zombieLeft1 = new GreenfootImage("ZombieLeft_1.png");
      GreenfootImage zombieLeft2 = new GreenfootImage("ZombieLeft_2.png");
      GreenfootImage zombieLeft5 = new GreenfootImage("ZombieLeft_5.png");
      GreenfootImage zombieLeft7 = new GreenfootImage("ZombieLeft_7.png");
      
        public void setDirection(int dir)
        {
      zombieRight1.scale(50, 50);
      zombieRight2.scale(50, 50);
      zombieRight5.scale(50, 50);
      zombieRight7.scale(50, 50);
      zombieLeft1.scale(50, 50);
      zombieLeft2.scale(50, 50);
      zombieLeft5.scale(50, 50);
      zombieLeft7.scale(50, 50);
        this.dir = dir;
        int time = 0;
        switch(dir)
        {
         
        case NORTH:
           time++;
            
            setImage(zombieRight1);
           if(getImage() == zombieRight1)
        {
             setImage(zombieRight5);
        }  
        if(getImage() == zombieRight5)
        {
        setImage(zombieRight7);
        }
           if(time == 60)
           {
            setImage(zombieRight5);
            time = 0;
            }
        break;
        case SOUTH :
           time++;
            setImage(zombieLeft7);
           
           if(getImage() == zombieLeft7)
        {
             setImage(zombieLeft2);
        }  
        if(getImage() == zombieLeft2)
        {
             setImage(zombieLeft5);
        }  
        if(getImage() == zombieLeft5)
        {
             setImage(zombieLeft7);
        }  
           if(time == 50)
           {
            setImage(zombieLeft1);
            time = 0;
            }
           
               
            break;
            
        case EAST :
        time++;
        setImage(zombieLeft2);
           if(getImage() == zombieLeft2)
        {
             setImage(zombieLeft5);
        }  
           if(time == 70)
           {
            setImage(zombieLeft1);
            time = 0;
            }
        
       
            
        break;
        
        case WEST : 
        time++;
        setImage(zombieRight7);
        if(getImage() == zombieRight7)
        {
        setImage(zombieRight2);
        }
        if(getImage() == zombieRight2)
        {
        setImage(zombieRight5);
        }
        
           if(time == 25)
        {
             setImage(zombieRight1);
        }  
           if(time == 70)
           {
            setImage(zombieRight5);
            time = 0;
            }
            
        break;
        
        default :
        time = 0;
        break;
    
    

    }
}
        public void kill()
        {
        Actor human = getOneObjectAtOffset(0 , 0 , Person.class);
        if(human != null&&!Person.in)
        {
        getWorld().removeObject(human);
        Greenfoot.playSound("Scream.wav");
        Greenfoot.setWorld(new ToMainMenu());
        
        }
        }
    }

