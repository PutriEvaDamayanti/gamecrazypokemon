import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    int count =0;
    int score=0;
    public void act() 
    {
        // Add your action code here.
        if(count==80){
            getWorld().addObject(new BolaBiru(), Greenfoot.getRandomNumber(180)+200,0);
            getWorld().addObject(new Coin(), Greenfoot.getRandomNumber(180)+200,0);
            count=0;
        } 
        else{
        count++;
        }
}
