import java.util.Scanner;

public class Sager_Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int flag = 0; //used flags in order to print correct output to user
        System.out.print("Enter an integer greater than 1: "); //numbers <= 1 cannot be prime
        n = scan.nextInt();
        if (n <= 1){
            System.out.print("Invalid number");
            flag = 1;
        }
        /* Used a for loop that iterates from 2 (first factor other than 1)
         * until the square root of the input number. This allows for every factor
         * of such number to be evaluated since any valid number thereon would had already been
         * in a pair with a number already in the loop. Used an if statement to determine if
         * the remainder of input divided by i was 0, thus signifying a composite input number.
         */
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                System.out.print("Your number is COMPOSITE");
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.print("Your number is PRIME");
        }
        scan.close();
    }
}
