import java.util.Scanner;

public class Sager_Problem3 {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Array before reversal:");
        printArray(nums);
        System.out.println("\nArray after reversal:");
        reverse(nums);
        printArray(nums);
        scan.close();
    }
}
