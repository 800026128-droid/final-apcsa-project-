/**
 * Chest - Mini game chest object that awards or deducts points when opened.
 */
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chest extends Actor {
    public static int amount = 0;
    private boolean opened = false;

    /**
     * Act - Opens the chest on click and reveals the random prize.
     */
    public void act() {
        if (!opened && Greenfoot.mouseClicked(this)) {
            opened = true;
            openChest();
        }
    }

    /**
     * Handles chest opening, randomizes prize and triggers summary reveal.
     */
    private void openChest() {
        int r = Greenfoot.getRandomNumber(3);
        if (r == 0)      amount = -100;
        else if (r == 1) amount = 0;
        else             amount = 100;

        MiniGameScreen screen = (MiniGameScreen)getWorld();
        screen.revealSummary(amount);
    }
}

