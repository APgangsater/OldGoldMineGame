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
        final static int EAST = 0;
        final static int WEST = 1;
        final static int NORTH = 2;
        final static int SOUTH = 3;
        int direction;
        public void act() 
        {
            // Add your action code here.
            if(foundPerson())
            {
            killPerson();
            }
            if(canMove())
            {
            move();
            }
            else{
            turnRnd();
            }
        }
        
        public void move()
        {
          if(!canMove())
          {
            return;
            }
          
        switch(direction)
        {
            case SOUTH :
                setLocation(getX() , getY()+1);
                break;
            case EAST :
                setLocation(getX()+1 , getY());
                break;
            case NORTH :
                setLocation(getX() , getY()-1);
                break;
            case WEST :
                setLocation(getX()-1 , getY());
                break;
        }
        }
        public void turnRnd()
        {
        int turns = Greenfoot.getRandomNumber(4);
        int random = 0;
        
        for(int i = 0; i < turns; i++)
        {
        random = Greenfoot.getRandomNumber(2);
        if(random == 0)
        {
        turnRight();
        }
        else
        {
        turnLeft();
        }
        }
        }
        public void turnLeft()
        {
        if(direction == SOUTH)
        {
        setDirection(EAST);
        }
        else
            if(direction == NORTH)
            {
            setDirection(WEST);
            }
            else
                if(direction == WEST)
                {
                setDirection(NORTH);
                }
                else
                    if(direction == EAST)
                    {
                    setDirection(SOUTH);
                    }
    }
    
        public void turnRight()
        {
        if(direction == SOUTH)
        {
        setDirection(WEST);
        }
        else
            if(direction == NORTH)
            {
            setDirection(EAST);
            }
            else
                if(direction == WEST)
                {
                setDirection(SOUTH);
                }
                else
                    if(direction == EAST)
                    {
                    setDirection(NORTH);
                    }
        }
        public boolean canMove()
        {
        World world = getWorld();
        int dx = getX();
        int dy = getY();
        if(direction == SOUTH)
        {
        dy++;
        }
        else
            if(direction == EAST)
            {
            dx++;
            }
            else
                if(direction == WEST)
                {
                dx--;
                }
                else
                    if(direction == NORTH)
                    {
                    dy--;
                    }
                if(dx >= world.getWidth() || dy >= world.getHeight())
                {
                return false;
                }
                else
                    if(dx < 0 || dy < 0)
                    {
                    return false;
                    }
                    List rocks = world.getObjectsAt(dx , dy , Rock.class);
                    if(rocks.isEmpty())
                    {
                    return true;
                    }
                    else
                    {
                    return false;
                    }
        }
        public void setDirection(int direction)
        {
        this.direction = direction;
        switch(direction)
        {
        case SOUTH:
           
            setImage("ZombieRight_1.png");
            GreenfootImage image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_2.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_3.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_4.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_5.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_6.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_7.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_8.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_9.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_10.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_11.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_12.png");
            image = getImage();
            image.scale(50 , 50);
            break;
        case EAST :
           
            setImage("ZombieRight_1.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_2.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_3.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_4.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_5.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_6.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_7.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_8.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_9.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_10.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_11.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieRight_12.png");
            image = getImage();
            image.scale(50 , 50);
        
            break;
            
        case WEST :
            
            setImage("ZombieLeft_1.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_2.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_3.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_4.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_5.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_6.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_7.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_8.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_9.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_10.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_11.png");
            image = getImage();
            image.scale(50 , 50);
            
        break;
        
        case NORTH : 
            
            setImage("ZombieLeft_1.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_2.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_3.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_4.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_5.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_6.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_7.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_8.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_9.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_10.png");
            image = getImage();
            image.scale(50 , 50);
            setImage("ZombieLeft_11.png");
            image = getImage();
            image.scale(50 , 50);
        break;
        
        default :
        break;
    }
    }
    ToMainMenu TMM = new ToMainMenu();
        public boolean foundPerson()
        {
        Actor person = getOneObjectAtOffset(0 , 0 , Person.class);
        return person != null;
        }
        public void killPerson()
        {
        Actor person = getOneObjectAtOffset(0 , 0 , Person.class);
        if(person != null)
        {
        getWorld().removeObject(person);
        MineEasy.time = 90;
        
     
        Greenfoot.playSound("Scream.wav");
        MyWorld.sound.stop();
        Greenfoot.setWorld(TMM);
        
        }
        }
    }
