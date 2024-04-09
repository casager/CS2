//Product finds difference between square of sums and sum of squares 1-100

public class PE_problem6 {
    public static void main(String[] args) {
        int sumSquare = 0;
        int squareSum = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sumSquare += Math.pow(i,2);
            sum += i;
        }
        squareSum = (int)Math.pow(sum,2);
        int dif = squareSum - sumSquare;
        System.out.println(dif);
    }
}
