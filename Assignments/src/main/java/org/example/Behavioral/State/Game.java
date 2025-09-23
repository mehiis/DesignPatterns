package org.example.Behavioral.State;

import java.util.Scanner;

public class Game {
    private Player player;

    String bold = "\u001B[1m";
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String yellow = "\u001B[33m";

    public Game(Player player) { this.player = player; }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your name:");
        player.setPlayerName(sc.nextLine());
        player.spawnPlayer();

        while (player.getHealthPoints() > 0 && !player.hasPlayerWon()){
            player.update();
        }

        if(player.hasPlayerWon() && player.getHealthPoints() >= 0) {
            win();
        } else {
            lose();
        }
    }

    private void win(){
        System.out.println("\n" + yellow + "⚔️ Congratulations, " + player.getPlayerName() + "! ⚔️" + reset);
        System.out.println(bold + "You have won the game by achieving the " + bold + "expert" + " level! 🌟" + reset);
    }

    private void lose(){
        System.out.println("\n" + red + "💀 Alas, " + player.getPlayerName() + "! Your health has dropped below zero!" + reset);
        System.out.println(red + bold + "You have fallen in the battle... 💔" + reset);

        System.out.println(yellow + "\nMay your next attempt be victorious!" + reset);
    }
}
