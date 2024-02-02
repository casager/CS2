import java.util.Scanner;

public class Sager_Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int digits = 0;
        System.out.print("Enter any integer: ");
        n = scan.nextInt();
        while (n != 0){
            digits++;
            n = n / 10;
        }
        System.out.println("Number of digits: " + digits);
        scan.close();
    }
}