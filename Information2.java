/**
 * Information2 - Displays additional info page with navigation and music controls.
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and so forth)

public class Information2 extends World
{
    private GreenfootSound startMusic = new GreenfootSound("Map (Night) - Tomodachi Life OST.mp3");

    /**
     * Constructor - Initializes additional info screen.
     */
    public Information2()
    {
        super(500, 500, 1);
        startMusic.setVolume(70);
        prepare();
    }

    /**
     * Called when this info page is activated; plays music.
     */
    public void started()
    {
        startMusic.playLoop();
    }

    /**
     * Called when leaving this info page; stops music.
     */
    public void stopped()
    {
        startMusic.stop();
    }

    /**
     * Adds navigation buttons to this info page.
     */
    private void prepare()
    {
        HomeButton homeButton = new HomeButton();
        addObject(homeButton, getWidth()/2, 450);
        leftArrowButton lA = new leftArrowButton();
        addObject(lA, getWidth()/2, 50);
    }
}
