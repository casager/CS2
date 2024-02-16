import java.util.Scanner;

public class Sager_Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 integers:");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++){
            nums[i] = scan.nextInt();
        }
        //nums = {10, 20, 30, 40, 50};
        for (int i = 0 ; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if ((i != j) && (nums[i] - nums[j] != 0)){
                    System.out.println("[" + nums[i] + " ," + nums[j] + "]");
                }
            }
        }
        scan.close();
        

    }
}
