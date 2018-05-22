import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crash extends Actor
{
    /**
     * Act - do whatever the Crash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      if (Greenfoot.mouseClicked(this))
      {
        
        ground.skor = 0;
        Greenfoot.setWorld(new ground());
       
      }
        
    }    
}
