import java.math.BigInteger;

public class PE_problem20 {
    public static void main(String[] args) {
        BigInteger result = factorial(BigInteger.valueOf(100));
        String reString = result.toString();
        int length = reString.length();
        int val = 0;
        int totalSum = 0;
        for(int i = 0; i < length; i++){
            val = reString.charAt(i) - '0';
            totalSum += val;
        }
        System.out.println(totalSum);
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
