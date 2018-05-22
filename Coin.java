import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World world;
    public void act() 
    {
        // Add your action code here.
         setLocation(getX(),getY()+4);
         Actor ball = getOneIntersectingObject(Bola.class);//deteksibolaapakahmenyentuhatautidak
         world = getWorld();
         if (isAtEdge())
         {
            world.removeObject(this);
         }
         if(ball != null)
         {
            getWorld().removeObject(this);
            Ground.skor++;
            Ground.scores.setScore(Ground.skor);
          
         }
        }
}   
    
