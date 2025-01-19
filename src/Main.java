import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Rules are simple");
        System.out.println("You have a limited number of attempts" +
                " before you run out of guesses");
        System.out.println("Guess the right number and you win the game!");
        System.out.println("-----------------------------------\n");

        System.out.println("Would you like to play the game? ");
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.next();

        if (answer.equals("y")) {
            PlayGame();
        }
        System.exit(0);
    }

    public static void PlayGame() {
        Scanner scanner = new Scanner(System.in);

        Difficulty userDifficulty = new Difficulty();
        System.out.println("Choose the level of difficulty: ");
        String difficulty = scanner.next();
        int result = 0;

        if (difficulty.equals("Easy")) {
            result = userDifficulty.getEasy();
        } else if (difficulty.equals("Medium")) {
            result = userDifficulty.getMedium();
        } else if (difficulty.equals("Hard")) {
            result = userDifficulty.getHard();
        }

        System.out.println("\nEnter a guess: ");


        Random rand = new Random();
        int secretGuess = rand.nextInt(100);
        boolean numberGuessed = true;
        int guessCount = result - 1;

        while (numberGuessed) {
            int userGuess = scanner.nextInt();
            if (guessCount <= 0) {
                System.out.println("You have run out of attempts. " +
                        " the number was " + secretGuess);
                break;
            } else if (userGuess > secretGuess) {
                guessCount--;
                System.out.println("Number is too high. Try again");
            } else if (userGuess < secretGuess) {
                guessCount--;
                System.out.println("Number is too low. Try again");
            } else {
                System.out.println("Congratulations, you guessed the correct number" +
                        " number of guesses was " + guessCount);
                numberGuessed = false;
            }
        }
    }
}
