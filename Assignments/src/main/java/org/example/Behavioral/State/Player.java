package org.example.Behavioral.State;

import org.example.Behavioral.State.PlayerState.NoviceLevel;
import org.example.Behavioral.State.PlayerState.PlayerState;

import java.util.Random;

public class Player {
    private String playerName;
    private PlayerState level;
    private int experiencePoints;
    private int healthPoints;

    private boolean hasWon = false;

    String bold = "\u001B[1m";
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String yellow = "\u001B[33m";
    String green = "\u001B[32m";

    public Player(){
        level = new NoviceLevel(this);
        experiencePoints = 0;
        healthPoints = 10;
    }

    public void update(){
        level.update();
    }

    public boolean hasPlayerWon() { return hasWon; }
    public void playerWon(){ hasWon = true; }

    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public void spawnPlayer(){
        for (int i = 0; i < 50; i++) {System.out.println();}

        System.out.println("✨ Greetings, "+ playerName +"! ✨\nPrepare yourself for an unforgettable journey! 🚀");
        System.out.println(yellow + "Your goal is to become an " + bold + "expert" + reset + yellow + ", " + "but now you are a " + bold + "novice" + "!" + reset);
        System.out.println("\n" + yellow + "Prepare yourself for the journey ahead... 🚀" + reset);
    }

    public void setState(PlayerState state){
        level = state;
    }

    public int getExperiencePoints(){
        return experiencePoints;
    }

    public void setExperiencePoints(int points){
        experiencePoints += points;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public void setHealthPoints(int points){
        healthPoints += points;

        if(healthPoints < 0) {
            healthPoints = 0;
            return;
        }

        if(healthPoints > 10){
            healthPoints = 10;
        }
    }

    public void setChoice(String choice){
        if(getHealthPoints() <= 0)
            return;

        for (int i = 0; i < 50; i++) {System.out.println();}
        switch (choice){
            case "1":
                System.out.print("> You decided to train! You " + yellow + bold + "gain 50 experience points" + reset + "!");
                setExperiencePoints(50);
                break;
            case "2":
                if (level.getLevelName() == "Intermediate" || level.getLevelName() == "Master") {
                    System.out.print("> You decided to meditate! You " + green + bold + "regain your health points!" + reset);
                    setHealthPoints(10);
                } else {
                    System.out.print(red + "Invalid input! Try again!" + reset);
                }
                break;
            case "3":
                if (level.getLevelName() == "Master") {
                    Random rand = new Random();
                    int randomNum = rand.nextInt(5) + 1;

                    System.out.print("> You decided to engage in a fight! You " + yellow + bold + "gain 200 experience points" + reset + " and " + red + bold + "lose " + randomNum +" health points" + reset + "!");
                    setHealthPoints(-randomNum);
                    setExperiencePoints(200);
                } else {
                    System.out.print(red + "Invalid input! Try again!" + reset);
                }
                break;
            default:
                System.out.print(red + "Invalid input! Try again!" + reset);
                break;
        }

        System.out.println();
        displayPlayerData();
    }

    public void displayPlayerData(){
        // Player name row
        System.out.println(bold + "\n\uD83E\uDDD9 Player: " + playerName);

        // Level row
        System.out.println("🏅 Level: " + level.getLevelName());

        // hp row
        System.out.println("\uD83D\uDC96 Health: " + healthPoints + "/" + "10");

        // xp row
        System.out.println("✨ XP: " + experiencePoints + "/" + level.getToNextLevel());
    }
}
