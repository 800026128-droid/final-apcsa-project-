import greenfoot.*;

/**
 * PurplePanda - Selectable panda skin that sets the player's color when clicked.
 */
public class PurplePanda extends Actor
{
    private static final GreenfootImage NORMAL_IMAGE = new GreenfootImage("purplePanda.PNG"); // Actor image.

    /** Constructor - Sets purple panda image. */
    public PurplePanda() { setImage(NORMAL_IMAGE); }

    /** Act - Sets Levels.color to purple when clicked. */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Levels.color = 5;
            return;
        }
    }
}
