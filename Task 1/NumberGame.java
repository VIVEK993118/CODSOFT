import java.util.Scanner;
import java.util.Random;
public class NumberGame {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("=== Welcome to the Number Guessing Game ===");

        while (playAgain) {
        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("\nI'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
    
    while (attempts < maxAttempts) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        attempts++;

    if (userGuess == numberToGuess) {
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        guessedCorrectly = true;
        totalScore += (maxAttempts - attempts + 1) * 10;
        break;
    } else if (userGuess < numberToGuess) {
        System.out.println("Too low!");
    } else {
        System.out.println("Too high!");
    }
    }

    if (!guessedCorrectly) {
    System.out.println("Sorry! You've used all attempts. The number was: " + numberToGuess);
    }

    System.out.print("Do you want to play another round? (yes/no): ");
    String response = scanner.next().toLowerCase();
    if (!response.equals("yes")) {
    playAgain = false;
    }
    }

    System.out.println("\nGame Over! Your total score: " + totalScore);
    scanner.close();
    }
}
