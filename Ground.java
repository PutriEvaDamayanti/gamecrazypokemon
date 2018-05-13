import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends World
{

    /**
     * Constructor for objects of class Ground.
     * 
     */
    public Ground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(Background.class,BolaBiru.class,Bola.class,Coin.class);
        
        prepare();
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     * 
     */
    private void prepare()
    {
        Asphalt asphalt = new Asphalt();
        addObject(asphalt, 290, 37);
        Asphalt asphalt2 = new Asphalt();
        addObject(asphalt2, 298, 114);
        asphalt2.setLocation(290, 106);
        Asphalt asphalt3 = new Asphalt();
        addObject(asphalt3, 295, 199);
        asphalt3.setLocation(290, 179);
        Asphalt asphalt4 = new Asphalt();
        addObject(asphalt4, 300, 252);
        asphalt4.setLocation(291, 248);
        Asphalt asphalt5 = new Asphalt();
        addObject(asphalt5, 348, 306);
        asphalt5.setLocation(292, 315);
        Asphalt asphalt6 = new Asphalt();
        addObject(asphalt6, 298, 389);
        asphalt6.setLocation(293, 380);
        asphalt.setLocation(289, 25);
        asphalt2.setLocation(289, 76);
        Asphalt asphalt7 = new Asphalt();
        addObject(asphalt7, 364, 159);
    }
}
