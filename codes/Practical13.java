import java.util.Random; 
import java.util.Scanner;
public class Practical13 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in); 
        int guessTheNumber = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            System.out.print("Guess the number (between 1 and 100): "); 
            int userGuess = sc.nextInt();
            guessTheNumber++;
            if (userGuess == randomNumber) {
            System.out.println("Congratulations! You've guessed the number " + randomNumber + " in "+ guessTheNumber + " guesses.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again."); 
            } else {
                System.out.println("Too high. Try again."); 
            }
        } 
    }
}