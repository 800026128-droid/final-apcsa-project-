/**
 * StartScreen - Main menu screen with options to start game, open shop, or view info.
 */
import greenfoot.*;

public class StartScreen extends World
{
    // Background music for the start screen
    public static GreenfootSound startMusic = new GreenfootSound("Map (Night) - Tomodachi Life OST.mp3");

    /**
     * Constructor - Sets up start screen dimensions, music volume, and UI.
     */
    public StartScreen()
    {    
        super(500, 500, 1); 
        startMusic.setVolume(50);
        prepare();
    }

    /**
     * started - Play looping menu music when start screen activates.
     */
    public void started()
    {
        startMusic.playLoop();
    }

    /**
     * stopped - Stop menu music when leaving start screen.
     */
    public void stopped()
    {
        startMusic.stop();
    }

    /**
     * prepare - Adds Start, Shop and Information buttons to the start screen.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton, getWidth()/2, 300); 
        ShopButton shopButton = new ShopButton();
        addObject(shopButton, getWidth()/2, 75);
        InformationButton informationButton = new InformationButton();
        addObject(informationButton, getWidth()/2-200, 450);
        // Optional: title / instructions via another Actor
    }
}
