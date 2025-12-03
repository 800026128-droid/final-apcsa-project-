import greenfoot.*;

public class YellowPanda extends Actor
{ 
    private static final GreenfootImage NORMAL_IMAGE = new GreenfootImage("yellowPanda.PNG");

    public YellowPanda()
    {
        // Set the initial image
        setImage(NORMAL_IMAGE);
    }

    public void act()
    {
        // 1. Handle the click action (same as before)
        if (Greenfoot.mouseClicked(this))
        {
            Levels.color = 2;
            return; 
        }
    }    
}