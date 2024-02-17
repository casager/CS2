/*
 * This program takes a hard-coded matrix and multiplies each
 * element of the matrix by a scalar factor of 5 
 */

public class Sager_Problem2 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}}; //declare matrix 
        System.out.print("Matrix before multiplication:");
        for (int i = 0; i < 3; i++){ //iterate through and print original matrix
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.print(mat[i][j] + ",");
            }
        }
        System.out.print("\nMatrix after scalar multiplication (x5):");
        for (int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                mat[i][j] = 5*mat[i][j];
                System.out.print(mat[i][j] + ",");
            }
        }
    }
}
