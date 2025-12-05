/**
 * AdvanceLevel - Handles advanced level start screen for the game, including setup and music.
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and so forth)

public class AdvanceLevel extends World
{
    // Background music for the start screen
    private static GreenfootSound startMusic = new GreenfootSound("Map (Night) - Tomodachi Life OST.mp3"); 

    /**
     * Constructor - Initializes the advanced level start screen and its buttons.
     */
    public AdvanceLevel()
    {
        super(500, 500, 1); // Match PandaWorld for smooth transition.
        startMusic.setVolume(70); // Set music volume.
        prepare();
    }

    /**
     * Called when this world is activated (game starts or returns here).
     */
    public void started()
    {
        startMusic.playLoop();
    }

    /**
     * Called when switching to another world or stopping the scenario.
     */
    public void stopped()
    {
        startMusic.stop();
    }

    /**
     * Prepares screen, adding navigation and functional buttons.
     */
    private void prepare()
    {
        LevelButton levelButton = new LevelButton();
        addObject(levelButton, getWidth()/2, 300);
        ReplayButton replayButton = new ReplayButton();
        addObject(replayButton, getWidth()/2, 400);
        ShopButton shopButton = new ShopButton();
        addObject(shopButton, getWidth()/2, 75);
        InformationButton informationButton = new InformationButton();
        addObject(informationButton, getWidth()/2-200, 450);
        // Title/instructions button optional
    }
}
