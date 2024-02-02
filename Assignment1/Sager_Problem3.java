import java.util.Scanner;

public class Sager_Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter any integer: ");
        n = scan.nextInt();
        int sum = 0;
        while (n != 0){
            sum = sum + (int)Math.pow(n%10, 3);
            n = n / 10;
        }
        System.out.print(sum);
        scan.close();
    }    
}
