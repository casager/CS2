public class PE_problem10 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }
    public static void main(String[] args) {
        long count = 0;
        for (int i = 2; i < 2000000; i++){
            if (isPrime(i)){
                count+= i;
            }
        }
        System.out.println(count);
    }
}