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
        asphalt5.setLocation(293, 330);
        asphalt4.setLocation(293, 281);
        asphalt3.setLocation(293, 231);
        asphalt2.setLocation(289, 75);
        asphalt7.setLocation(289, 125);
        Asphalt asphalt8 = new Asphalt();
        addObject(asphalt8, 295, 183);
        asphalt8.setLocation(289, 174);
        asphalt3.setLocation(288, 224);
        asphalt3.setLocation(289, 224);
        asphalt4.setLocation(289, 274);
        asphalt5.setLocation(288, 323);
        asphalt5.setLocation(289, 324);
        asphalt6.setLocation(289, 374);
        Tree tree = new Tree();
        addObject(tree, 443, 86);
        Tree tree2 = new Tree();
        addObject(tree2, 521, 245);
        Tree tree3 = new Tree();
        addObject(tree3, 106, 123);
        Tree tree4 = new Tree();
        addObject(tree4, 153, 231);
        Tree tree5 = new Tree();
        addObject(tree5, 68, 351);
        Tree tree6 = new Tree();
        addObject(tree6, 389, 200);
        Tree tree7 = new Tree();
        addObject(tree7, 507, 356);
        Tree tree8 = new Tree();
        addObject(tree8, 32, 45);
        
        
        
    }
}
