/*
 * Program used to find median of both 1d and 2d arrays. Inputs 
 * are provided for the program and sorting is used in order to get input into 
 * usable form to return the median for each type of array.
 */

public class Sager_Problem4 {

    public static int[] bubbleSort(int[] arr) { //using bubble sort to accurately find median number
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static double returnMedian(int[] arr){ //use sorted array to find median of 1d
        double med;
        arr = bubbleSort(arr);
        if (arr.length % 2 == 0){
            double low = (double)arr[(arr.length / 2)-1];
            double high = (double)arr[(arr.length / 2)];
            med = (high + low)/2;
        }
        else {
            med = arr[arr.length/2];
        }
        return med;
    }

    public static double returnMedian(int[][] arr){//find median of 2d
        //converting the 2d array into 1d
        int []singleArray = new int[arr[0].length + arr[1].length];
        for (int x = 0, i = 0; x < arr.length; x++) {
            for (int z = 0; z < arr[x].length; z++, i++) {
                singleArray[i] = arr[x][z];  
            }
        }
        singleArray = bubbleSort(singleArray);
        double med;
        if (singleArray.length % 2 == 0){
            double low = (double)singleArray[(singleArray.length / 2)-1];
            double high = (double)singleArray[(singleArray.length / 2)];
            med = (high + low)/2;
        }
        else {
            med = singleArray[singleArray.length/2];
        }
        return med;
    }
    public static void main(String[] args) {
        int [] arr1 = {3, 6, 4, 2, 5};
        int [][] arr2 = {{1,4,8}, {2,9,3,7,8}};
        System.out.println("Median of 1d array: " + returnMedian(arr1));
        System.out.println("Median of 2d array: " + returnMedian(arr2));
    }
}
