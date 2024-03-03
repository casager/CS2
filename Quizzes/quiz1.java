import java.util.Scanner;
import java.util.Random;

public class quiz1 {
    public static void main(String[] args){
        int count =0;
        for (int i = 0; i < 10; i++){
            for (int j = i; j < 10; j++){
                System.out.println(i * j);
                count++;

            }
        }
        System.out.print("Count:" + count);
    }
}
