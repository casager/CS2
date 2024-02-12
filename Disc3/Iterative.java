import java.util.Scanner;

public class Iterative {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to count down from: ");
        int input = scan.nextInt();
        for (int i = input; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Start.");
        scan.close();
    }
}
