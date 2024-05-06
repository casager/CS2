import java.math.BigInteger;

public class PE_problem25 {public static void main(String[] args) {
        int index = findIndexOfThousandDigitFibonacci();
        System.out.println(index);
    }

    public static int findIndexOfThousandDigitFibonacci() {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger limit = BigInteger.TEN.pow(999); // 10^999

        int index = 2; // Start from the 3rd Fibonacci number (index 2)
        while (b.compareTo(limit) < 0) {
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
            index++;
        }

        return index;
    }
}
