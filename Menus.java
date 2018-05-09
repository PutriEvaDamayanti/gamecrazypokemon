import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Universe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Menus extends World
{

    /**
     * Constructor for objects of class Universe.
     * 
     */
      public static GreenfootSound titleSound;
      
    public Menus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      
        super(600, 400, 1);
        if (this.getClass().getName().equalsIgnoreCase("MenuScreen"))
        {
            addObject(new StartBtn(), 550, 240);
            addObject(new AboutBtn(), 120, 300);
            addObject(new HelpBtn(),  40, 360);
            addObject(new ExitBtn(), 550, 350);
                titleSound = new GreenfootSound("title-theme.mp3");
                 titleSound.stop();
        titleSound.setVolume(0);
        titleSound.playLoop();
        }
        else
        {
            addObject(new BackBtn(), 100, 500);
        }
    }
}
