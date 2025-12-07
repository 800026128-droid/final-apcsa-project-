/**
 * ReplayLevel - Screen shown when player can replay a level; includes navigation and music.
 */
import greenfoot.*;

public class ReplayLevel extends World
{
    private GreenfootSound startMusic = new GreenfootSound("Map (Night) - Tomodachi Life OST.mp3"); // Music for this screen.

    /** Constructor - Initializes replay screen and UI. */
    public ReplayLevel()
    {
        super(500, 500, 1);
        startMusic.setVolume(70);
        prepare();
    }

    /** started - Play looping music when this world becomes active. */
    public void started() { startMusic.playLoop(); }

    /** stopped - Stop music when leaving this world. */
    public void stopped() { startMusic.stop(); }

    /** prepare - Adds UI elements (replay, shop, info) to the screen. */
    private void prepare()
    {
        ReplayButton replayButton = new ReplayButton();
        addObject(replayButton, getWidth()/2, 300);
        ShopButton shopButton = new ShopButton();
        addObject(shopButton, getWidth()/2, 75);
        InformationButton informationButton = new InformationButton();
        addObject(informationButton, getWidth()/2-200, 450);
    }
}
