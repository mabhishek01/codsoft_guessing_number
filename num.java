import java.util.Random;
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lb = 1;//lowerBound
        int ub = 100;//upperBound
        int numberToGuess = random.nextInt(ub - lb + 1) + lb;
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lb + " and " + ub + ".");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < lb || userGuess > ub) {
                System.out.println("Please enter a number between " + lb + " and " + ub + ".");
            } else if (userGuess < numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
