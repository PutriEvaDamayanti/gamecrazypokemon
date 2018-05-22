import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int count=0;
   int score=0;
   public void act() 
   {  
       if (count==80) {
           getWorld().addObject(new BolaBiru(),Greenfoot.getRandomNumber(180)+200,0);
           getWorld().addObject(new Coin(),Greenfoot.getRandomNumber(180)+200,0);
           count=0;
       }
       else {
           count++;
       }
      
       if (isTouching(BolaBiru.class)) {
           getWorld().addObject(new Crash(),300,200);
           
       }
        if (isTouching(Coin.class)) {
           getWorld().removeObjects(getWorld().getObjects(Coin.class));
        
        }
       else {
           if (getX()>=200 && getX()<=380) {
               if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
                }
               if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-1); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+1); 
               }
            }
            else if (getX()<200){
                if (Greenfoot.isKeyDown("right")) {
                   move(3); 
               }
               if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-1); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+1); 
               }
            }
            else {
                if (Greenfoot.isKeyDown("left")) {
                   move(-3); 
                }
                if (Greenfoot.isKeyDown("up")) {
                   setLocation(getX(),getY()-1); 
               }
               if (Greenfoot.isKeyDown("down")) {
                   setLocation(getX(),getY()+1); 
               }
            }
       }
   }   
}
