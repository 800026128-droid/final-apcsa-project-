import greenfoot.*;

public class RedPanda extends Actor
{ 
    private static final GreenfootImage NORMAL_IMAGE = new GreenfootImage("redPanda.png");

    public RedPanda()
    {
        // Set the initial image
        setImage(NORMAL_IMAGE);
    }

    public void act()
    {
        // 1. Handle the click action (same as before)
        if (Greenfoot.mouseClicked(this))
        {
            Levels.color = 0;
        }
    }    
}