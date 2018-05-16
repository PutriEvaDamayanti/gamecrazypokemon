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
        Bola bola = new Bola();
        addObject(bola, 300, 363);
        bola.setLocation(292, 359);
        Tree tree9 = new Tree();
        addObject(tree9, 567, 53);
        BolaBiru bolabiru = new BolaBiru();
        addObject(bolabiru, 284, 72);
        asphalt8.setLocation(289, 175);
        asphalt3.setLocation(289, 225);
        asphalt4.setLocation(289, 275);
        bola.setLocation(200, 358);
        asphalt5.setLocation(289, 325);
        asphalt6.setLocation(289, 375);
        bola.setLocation(291, 360);
        bola.setLocation(221, 349);
        removeObject(bola);
        Bola bola2 = new Bola();
        addObject(bola2, 342, 347);
        bola2.setLocation(297, 359);
        tree6.setLocation(531, 164);
        Background background = new Background();
        addObject(background, 154, 40);
        background.setLocation(142, 24);
        Background background2 = new Background();
        addObject(background2, 153, 98);
        background2.setLocation(142, 74);
        Background background3 = new Background();
        addObject(background3, 165, 179);
        background3.setLocation(142, 124);
        Background background4 = new Background();
        addObject(background4, 142,  269);
        background4.setLocation(132, 179);
        Background background5 = new Background();
        addObject(background5, 93, 294);
        background5.setLocation(142, 224);
        Background background6 = new Background();
        addObject(background6, 226, 352);
        background6.setLocation(142, 274);
        Background background7 = new Background();
        addObject(background7, 459, 363);
        background7.setLocation(142, 324);
        Background background8 = new Background();
        addObject(background8, 440, 315);
        background8.setLocation(142, 374);
        Background background9 = new Background();
        addObject(background9, 154, 40);
        background9.setLocation(463, 24);
        Background background10 = new Background();
        addObject(background10, 153, 98);
        background10.setLocation(463, 74);
        Background background11 = new Background();
        addObject(background11, 165, 179);
        background11.setLocation(463, 124);
        Background background12 = new Background();
        addObject(background12, 142, 269);
        background12.setLocation(463, 179);
        Background background13 = new Background();
        addObject(background13, 93, 294);
        background13.setLocation(463, 224);
        
        
        
        
    }
}
