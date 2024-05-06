import java.math.BigInteger;

public class PE_problem48 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) {
            BigInteger base = BigInteger.valueOf(i);
            sum = sum.add(base.pow(i));
        }
        // take last ten digits
        String lastTenDigits = sum.toString().substring(Math.max(0, sum.toString().length() - 10));

        System.out.println("Last 10 digits: " + lastTenDigits);
    }
}
