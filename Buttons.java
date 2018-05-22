import greenfoot.*; 
public class Buttons extends Actor
{
   
    public void act(String buttonName) 
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(buttonName + "_over.png");
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(buttonName + ".png");
        }
       
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {
            setImage(buttonName + ".png"); 
        }
        if (Greenfoot.mouseClicked(this)) {
            setImage(buttonName + ".png");
            if      (buttonName.equalsIgnoreCase("StartBtn")) Greenfoot.setWorld(new ground());//perbandingan
            else if (buttonName.equalsIgnoreCase("AboutBtn")) Greenfoot.setWorld(new AboutScreen());
            else if (buttonName.equalsIgnoreCase("HelpBtn"))  Greenfoot.setWorld(new HelpScreen());
            else if (buttonName.equalsIgnoreCase("BackBtn"))  Greenfoot.setWorld(new MenuScreen());
            else if (buttonName.equalsIgnoreCase("ExitBtn"))  Greenfoot.stop();
        }
    }
}