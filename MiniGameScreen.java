/**
 * Write a description of class MiniGameScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class MiniGameScreen extends World {

    public MiniGameScreen() {
        super(500, 500, 1);
        setBackground("500px MiniGameScreen.png");
        prepare();
    }

    private void prepare() {
        addObject(new Chest(), 125, 360);
        addObject(new Chest(), 250, 360);
        addObject(new Chest(), 375, 360);
    }

    // Called by Chest after selecting a chest
    public void revealSummary(int amount) {
        Greenfoot.setWorld(new MiniGameSummary(amount));
    }
}


