import java.util.Scanner;
import java.util.Random;

public class Sager_Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(1000) + 1;
        //System.out.println("Hint: " + target); //used this in order to debug effectively
        System.out.print("Pick a number between 1 and 1000: ");
        int input = scan.nextInt();
        int numGuesses = 1;
        /* Used a while loop until the user guessed the correct target number.
         * If statements were used within the loop to give the user feedback on
         * which direction they need to guess next.
         */
        while (input != target){
            if (input < target){
                System.out.print("Too low, guess again: ");
            }
            if (input > target){
                System.out.print("Too high, guess again: ");
            }
            input = scan.nextInt();
            numGuesses++;
        }
        System.out.println("\nCorrect, the number was " + target);
        System.out.println("You used " + numGuesses + " guesses"); //output # of guesses
        scan.close();
    }
}
