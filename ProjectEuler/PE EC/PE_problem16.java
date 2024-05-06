import java.math.BigInteger;

public class PE_problem16 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(2).pow(1000);
        String numberString = number.toString();
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
        }
        System.out.println(sum);
    }
}
