import java.util.Scanner;

public class Sager_Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter any integer: ");
        n = scan.nextInt();
        int sum = 0;
        /* A running total sum was used within the while loop in order
         * to increase the sum each iteration.Used the modulo (%) 10 in order to get 
         * the right most digit for each iteration.  Used the power function from the Math
         * library in order to raise the modulus to the power of 3 for each iteration. Then
         * divided the number by 10 until no digits left, similar to problem 1.
         */
        while (n != 0){
            sum = sum + (int)Math.pow(n%10, 3);
            n = n / 10;
        }
        System.out.print(sum);
        scan.close();
    }    
}
