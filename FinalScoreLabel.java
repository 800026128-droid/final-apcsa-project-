import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalScoreLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalScoreLabel extends Actor
{
    /**
     * Act - do whatever the FinalScoreLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FinalScoreLabel()
    {
        GreenfootImage img = new GreenfootImage("Final Score: " + PandaWorld.savedScore, 30, Color.WHITE, null); // null for transparent background
        img.setFont(new Font("Comic Sans MS", 30));
        setImage(img);
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }
}
