import greenfoot.*;

public class rightArrowButton extends Actor
{
    private static final GreenfootImage NORMAL_IMAGE = new GreenfootImage("rightArrow.png"); //
    private static final GreenfootImage HOVER_IMAGE = new GreenfootImage("rightArrow.png"); //
    
    public rightArrowButton()
    {
        // Set the initial image
        setImage(NORMAL_IMAGE);
    }

    public void act()
    {
        // 1. Handle the click action (same as before)
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Information2());
        }

        // 2. Handle the hover action: Switch images
        if (Greenfoot.mouseMoved(this))
        {
            // If the mouse is over the button, set the pre-faded image
            if (getImage() != HOVER_IMAGE) {
                setImage(HOVER_IMAGE);
            }
        }
        else
        {
            // If the mouse is NOT over the button, set the normal image
            if (getImage() != NORMAL_IMAGE) {
                setImage(NORMAL_IMAGE);
            }
        }
    }    
}
