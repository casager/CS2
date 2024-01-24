import java.util.Scanner;
import java.util.Random;

public class Discussion1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        int i;
        System.out.println("Correct Number:" + num);
        for(i = 0; i < 5; ++i){
            System.out.println("Guess a number 1-100");
            int guess = scan.nextInt();
            if (guess == num){
                System.out.println("Congratulations! You have guessed the number");
                break;
            }
            else {
                System.out.println("Sorry, try again.");
            }
        }
        if (i == 5){
            System.out.print("You lost!");
        }
    }
}