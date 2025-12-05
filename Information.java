/**
 * Information - Displays information screen with navigation options and music.
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and so forth)

public class Information extends World
{
    // Background music for the information screen
    private GreenfootSound startMusic = new GreenfootSound("Map (Night) - Tomodachi Life OST.mp3");

    /**
     * Constructor - Sets up info screen dimensions, music, and objects.
     */
    public Information()
    {
        super(500, 500, 1);
        startMusic.setVolume(70);
        prepare();
    }

    /**
     * Called when the info world becomes active; plays music.
     */
    public void started()
    {
        startMusic.playLoop();
    }

    /**
     * Called when leaving info world; stops music.
     */
    public void stopped()
    {
        startMusic.stop();
    }

    /**
     * Adds navigation buttons to the info screen.
     */
    private void prepare()
    {
        HomeButton homeButton = new HomeButton();
        addObject(homeButton, getWidth()/2, 450);
        rightArrowButton rA = new rightArrowButton();
        addObject(rA, getWidth()/2, 50);
    }
}
