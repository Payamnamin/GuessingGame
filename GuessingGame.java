import java.util.Scanner; // Import the Scanner class for user input
import java.util.Random;  // Import the Random class for generating random numbers

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        Random random = new Random(); // Create a Random object for generating random numbers
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0; // Variable to count the number of attempts
        int guess = 0; // Variable to store the user's guess

        System.out.println("\n---Welcome to the guessing game! Guess a number between 1 and 100---\n");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            System.out.print("Your guess: "); // Prompt the user for a guess
            guess = scanner.nextInt(); // Read the user's guess
            attempts ++; // Increment the attempt counter

            // Provide feedback based on the user's guess
            if (guess != randomNumber) {
                System.out.println(" Please enter number between 0-100 ! ");   
            }
            if (guess < randomNumber) {
                System.out.println("No! Higher. Try again."); // Hint if the guess is too low
            } else if (guess > randomNumber) {
                System.out.println("No! Lower. Try again."); // Hint if the guess is too high
            } else {
                // If the guess is correct, inform the user of their success
                System.out.println("You guessed it right! It took you " + attempts + " attempts.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}