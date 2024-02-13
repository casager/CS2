import java.util.Scanner; //Scanner library used for each problem
//run and clean workspace cache if directory problem occurs
public class Sager_Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        int digits = 0;
        System.out.print("Enter any integer: "); //prompting user for input
        n = scan.nextInt();
        /* My method is taking the input integer, increasing the digits variable,
        then dividing the integer by 10 to "get rid" of the digit recorded
        until we have no digits left */
        while (n != 0){ 
            digits++;
            n = n / 10;
        }
        System.out.println("Number of digits: " + digits);
        scan.close();
    }
}