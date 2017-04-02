import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 700x450 cells with a cell size of 1x1 pixels.
        super(700, 450, 1); 
        addObject(new HowTo() , 340 , 180);// add the HowTo object to the world.(See more at HowTo class)
        addObject(new NextPlay() , 594 , 399); // add the NeXtPlay object to the world.(See more at NextPlay class)
        showText("1.Collect the gold bars to get score" + 
        "\n                  2.Beware zombies do not let them touch you." + 
        "\n                                    3.Using W A S D or UP , RIGHT , DOWN LEFT to control " , getHeight()/2 , 300); // show instruction texts.
    }
}
