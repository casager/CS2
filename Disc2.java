import java.util.Scanner;

public class Disc2 {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // String input = scan.nextLine();
        // String output = "";
        // int length = input.length();
        // for (int i = 0; i < length; i++){
        //     if (input.charAt(i) == 'a' || input.charAt(i) =='e' || input.charAt(i) =='i' ||input.charAt(i) == 'o' || input.charAt(i) =='u' ||input.charAt(i) == 'A' ||input.charAt(i) == 'E' ||input.charAt(i) == 'I' ||input.charAt(i) == 'O' ||input.charAt(i) == 'U'){
        //         output = output + "";
        //     }
        //     else output = output + input.charAt(i);
        // }
        // System.out.println(output);

        // String cityA = new String("New");
        // String cityB = new String("York");
        // cityA = cityB;
        // if (cityA == cityB){
        //     System.out.println("Two copies of a reference");
        //     System.out.println(cityA);
        // }
        // else System.out.println("two different references");

        int i = 10;
        float f = 30.89f;
        double d = 100.25;
        
        f = (float) i;
        d = (double) f; //d technically changed to 10.0 here
        i = (int) d;

        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}
