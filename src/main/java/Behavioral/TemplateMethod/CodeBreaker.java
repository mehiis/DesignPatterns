package Behavioral.TemplateMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CodeBreaker extends Game{
    private final HashMap<Integer, String> playerNames = new HashMap<>();
    private final ArrayList<String> guessedNumbers = new ArrayList<String>();
    private final Scanner input = new Scanner(System.in);

    private String code = "";
    private String message = "";

    private boolean codeCracked = false;
    private int gameTurns = 0;
    private int playerTurn = 0;

    // ANSI color codes
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RESET = "\u001B[0m";

    @Override
    public void initializeGame(int numberOfPlayers) {
        //Generate new code
        for(int i = 0; i < 4; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt(10);

            code += randomNum;
        }

        //set player names
        setPlayerNames(numberOfPlayers);
    }

    @Override
    public boolean endOfGame() {
        if(codeCracked)
            return true;

        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        String playerGuess = "";
        int attempt = 0;
        playerTurn = player;
        gameTurns++;

        while (!validateAnswer(playerGuess))
        {
            for (int i = 0; i <= 30; i++) { System.out.println(); }

            if(!message.isEmpty()){
                System.out.println("[Turn " + gameTurns + "]\nGuessed numbers: ");
                for(int i = 0; i <= guessedNumbers.size() - 1; i++){
                    if(i != guessedNumbers.size() - 1)
                        System.out.println(guessedNumbers.get(i) + ", ");
                    else
                        System.out.println(guessedNumbers.get(i));
                }
                System.out.println();

                System.out.println(message);
            }

            System.out.print("[" + playerNames.get(player) + "] ");

            if(attempt == 0)
                System.out.print("Guess the code (input 4 digits): ");
            else
                System.out.print("❌ Invalid input, try again! Guess the code (input 4 digits): ");

            playerGuess = input.nextLine();
            attempt++;
        }

            //check inputed numbers
            message = checkHits(playerGuess);
    }

    @Override
    public void displayWinner() {
        String victoryMessage =
                "\n" +
                        "🎉🎉🎉 CONGRATULATIONS 🎉🎉🎉\n" +
                        "🏆 "+ playerNames.get(playerTurn) +" cracked the code in " + gameTurns + " turns! 🏆\n" +
                        "\n";

        System.out.println(victoryMessage);
    }

    private void setPlayerNames(int numberOfPlayers){
        for(int i = 0; i < numberOfPlayers; i++){
            System.out.println("\nSet player " + (i + 1) + " name: ");
            String playerName = input.nextLine();

            playerNames.put(i, playerName);
        }

    }

    //check that the input is a valid four-digit number.
    private boolean validateAnswer(String answer) {
        boolean valid = false;

        if(answer.length() == 4) {
            try{
                Integer.parseInt(answer);
                valid = true;
            } catch(Exception e){ /* empty */ }
        }

        return valid;
    }

    //loop through the valid four-digit and mirror it to the actual code.
    private String checkHits(String guess) {
        StringBuilder codeCopy = new StringBuilder(code);
        int correctAndOnTheRightSpot = 0;
        int correctButInTheWrongSpot = 0;

        //check correct spot
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == codeCopy.charAt(i)) {
                correctAndOnTheRightSpot++;
                codeCopy.setCharAt(i, '*');
            }
        }

        //check correct but wrong spot
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != code.charAt(i)) { // skip already counted exact matches
                int pos = codeCopy.indexOf(String.valueOf(guess.charAt(i))); //find the character in codeCopy
                if (pos != -1) {
                    correctButInTheWrongSpot++;
                    codeCopy.setCharAt(pos, '*');
                }
            }
        }

        guessedNumbers.add(guess + " [" + GREEN + correctAndOnTheRightSpot + RESET + ", " + YELLOW + correctButInTheWrongSpot + RESET + "]");

        //if four correct, then code guessed and game end.
        if(correctAndOnTheRightSpot == 4)
            codeCracked = true;

        return "✅ " + correctAndOnTheRightSpot + " number(s) in the right spot. "
                + "\uD83D\uDD14 " + correctButInTheWrongSpot + " number(s) correct but in the wrong spot. "
                + "❌ " + (guess.length() - correctAndOnTheRightSpot - correctButInTheWrongSpot) + " wrong number(s).";
    }
}