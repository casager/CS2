public class Sager_Problem5 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
        int[][] newarr = new int[arr[0].length][arr.length];
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println();
            for(int j = 0; j < arr[0].length; j++){
                newarr[j][i] = arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("\n\nTransposed and multiplied array: ");
        for (int i = 0; i < newarr.length; i++){
            System.out.println();
            for(int j = 0; j < newarr[0].length; j++){
                System.out.print(newarr[i][j]*3 + " ");
            }
        }
    }
}
