import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BolaBiru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BolaBiru extends Actor
{
    /**
     * Act - do whatever the BolaBiru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count=0;
    World world;
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()+2);
            world = getWorld();
            if(isAtEdge()){
                world.removeObject(this);
            }
    }    
}
