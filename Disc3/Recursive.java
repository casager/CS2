import java.util.Scanner;

public class Recursive {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } 
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer (>= 0) to find the fibonacci number at that position:");
        int n = scan.nextInt();
        int result = fib(n);
        System.out.println("Fibonacci number at " + n + " is: " + result);
        scan.close();
    }
}
