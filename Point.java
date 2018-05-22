import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point extends Actor
{
    /**
     * Act - do whatever the Point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Point() 
    {
        // Add your action code here.
        GreenfootImage skor = new GreenfootImage(200,100);
        setImage(skor);
    }
    
    public void setScore( int score ){
        GreenfootImage skor = getImage();
        skor.clear();
        skor.setFont(skor.getFont().deriveFont(40f));
        skor.setColor(Color.RED);
        skor.drawString("Score :" + score,30,30);
        setImage(skor);
    }
}
