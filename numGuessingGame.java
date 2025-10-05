import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1 se 100
        int guess = -1;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Input validation: check agar integer diya gaya hai
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer (1-100).");
                scanner.next(); // consume invalid token
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            // Range check
            if (guess < 1 || guess > 100) {
                System.out.println("Guess must be between 1 and 100. Try again.");
                continue;
            }

            if (guess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
