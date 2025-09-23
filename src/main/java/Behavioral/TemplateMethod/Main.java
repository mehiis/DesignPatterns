package Behavioral.TemplateMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Game codeBreaker = new CodeBreaker();

        main.info();
        codeBreaker.play(main.setPlayerAmount());
    }

    private int setPlayerAmount() {
        int playerAmount = 0;
        boolean validNumber = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of players: ");

        while(!validNumber){
            try {
                playerAmount = Integer.parseInt(input.nextLine());

                if(playerAmount > 0 && playerAmount <= 4){
                    validNumber = true;
                    continue;
                }

                System.out.println("Invalid input. Type a number between 1 and 4: ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Type a number between 1 and 4: ");
            }
        }
        return playerAmount;
    }

    private void info() {
        System.out.println("\n\n### GAME INFO ###\n");
        System.out.println(
                "Welcome to the Code-Cracker Game! 🔐\n" +
                        "\n" +
                        "• This game can be played by 1-4 players.\n" +
                        "• Your mission: crack the secret 4-digit code.\n" +
                        "\n" +
                        "How to play:\n" +
                        "1️⃣ Each round, enter a guess consisting of four numbers.\n" +
                        "2️⃣ After each guess, you will receive feedback:\n" +
                        "    ✅ A number in the correct position and correct value.\n" +
                        "    \uD83D\uDD14 A number that exists in the code but is in the wrong position.\n" +
                        "\n" +
                        "Keep guessing until you discover the full code.\n" +
                        "If all four numbers are guessed correctly in the right order, the code is broken and you win the game! 🏆\n"
        );
    }
}

