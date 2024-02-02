import java.util.Scanner;

public class Sager_Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int flag = 0;
        System.out.print("Enter an integer greater than 1: "); //numbers <= 1 cannot be prime
        n = scan.nextInt();
        if (n <= 1){
            System.out.print("Invalid number");
            flag = 1;
        }
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
