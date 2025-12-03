import greenfoot.*;

public class PurplePanda extends Actor
{ 
    private static final GreenfootImage NORMAL_IMAGE = new GreenfootImage("purplePanda.PNG");

    public PurplePanda()
    {
        // Set the initial image
        setImage(NORMAL_IMAGE);
    }

    public void act()
    {
        // 1. Handle the click action (same as before)
        if (Greenfoot.mouseClicked(this))
        {
            Levels.color = 5;
            return; 
        }
    }    
}
