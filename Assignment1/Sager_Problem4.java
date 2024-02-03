import java.util.Scanner;

public class Sager_Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");
        n = scan.nextInt();
        /* Took modulo of the input number in order to see if each digit
         * of number was binary in while loop. Continued to divide by 10 if 
         * binary number had many digits. If binary number was not present, the 
         * loop would break and user would receive response either way.
         */
        while (n != 0){
            if (n % 10 == 0 || n % 10 == 1){
                n = n / 10;
            }
            else break;
        }
        if (n == 0){
            System.out.println("Your number is a binary number");
        }
        else System.out.println("Your number is NOT a binary number");
        scan.close();
    }
}
