package org.example.Behavioral.State.PlayerState;

import org.example.Behavioral.State.Player;

import java.util.Scanner;

public abstract class PlayerState {
    private Player player;
    private Scanner scanner = new Scanner(System.in);
    private int toNextLevel;

    String reset = "\u001B[0m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";
    String cyan = "\u001B[36m";
    String bold = "\u001B[1m";

    public PlayerState(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Scanner getScanner(){
        return scanner;
    }

    public void update(){
        if(player.getHealthPoints() <= 0)
            return;

        System.out.println("\nWhat would you like to do next?");
    }

    public int getToNextLevel() {
        return toNextLevel;
    }

    public void setToNextLevel(int toNextLevel) {
        this.toNextLevel = toNextLevel;
    }

    protected void levelUp(PlayerState nextLevel) {
        if(player.getHealthPoints() <= 0)
            return;

        if(getPlayer().getExperiencePoints() >= getToNextLevel()){
            for (int i = 0; i < 50; i++) {System.out.println();}

            System.out.println(yellow + bold);
            System.out.println("**************************************************");
            System.out.println("*   " + green + "        🎉 CONGRATULATIONS!!! 🎉" + yellow + "             *");
            System.out.println("*                                                *");
            System.out.println("*      " + cyan + "   YOU HAVE REACHED A NEW LEVEL! 🚀" + yellow + "       *");
            System.out.println("**************************************************");
            System.out.println(reset);
            getPlayer().setState(nextLevel);

            getPlayer().displayPlayerData();
        }
    }

    public abstract String getLevelName();
}