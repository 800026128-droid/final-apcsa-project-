import greenfoot.*;

public class Level_2 extends Actor
{
    public Level_2()
    {
        // Set the image/text for the Level 1 title screen
        // Example: setImage(new GreenfootImage("LEVEL 1: THE OUTSKIRTS", 40, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("b"))
        {
            getWorld().removeObject(this);
        }
    }
}