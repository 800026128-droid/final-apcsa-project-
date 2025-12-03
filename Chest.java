import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Chest extends Actor {

    public static int amount = 0;
    private boolean opened = false;

    public void act() {
        if (!opened && Greenfoot.mouseClicked(this)) {
            opened = true;
            openChest();
        }
    }

    private void openChest() {
        // Optional: change to an “open chest” image if you have one
        // setImage("ChestOpen.png");

        // Random result: -100, 0, or +100
        int r = Greenfoot.getRandomNumber(3);
        if (r == 0)      amount = -100;
        else if (r == 1) amount = 0;
        else             amount = 100;

        // Send the result to MiniGameScreen
        MiniGameScreen screen = (MiniGameScreen)getWorld();
        screen.revealSummary(amount);
    }
}


