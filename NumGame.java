import java.util.Random;
import java.util.Scanner;
public class NumGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain==true) {
            int systemGuess = random.nextInt(100 - 1 + 1) + 1;
            int Attempts = 0;
            int maxAttempts = 10;
            boolean hasGuessedCorrectly = false;

            System.out.println("*******Welcome to the Number Guessing Game.*******");

            while (Attempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = s.nextInt();
                Attempts++;

                if (userGuess < systemGuess) {
                    System.out.println("Too low Try again.");
                } else if (userGuess > systemGuess) {
                    System.out.println("Too high Try again.");
                } else {
                    System.out.println(" You guessed the number in "+ Attempts +" attempts.");
                    hasGuessedCorrectly = true;
                }
                }

                if (hasGuessedCorrectly==false) {
                    System.out.println("Sorry You have used all your attempts. The correct number was " + systemGuess );
                }
                System.out.print("Do you want to play again? yes/no ");
                String Response = s.next();
                playAgain = Response.equalsIgnoreCase("yes");

            }
        }
    }

