public class PE_problem3 {

    public static boolean isPrime(long n) {
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

        long n = 600851475143L;
        long n_sqrt = (long)Math.sqrt(n);
        //System.out.println(n_sqrt);
        long max_factor = 0;
        for(long i = 2; i < n_sqrt; i++){
            //System.out.println(n / i);
            long mod = n % i;
            if (isPrime(i) && (mod == 0)){
                max_factor = i;
                System.out.println("test");
            }
        }
        System.out.println(max_factor);
    }
}
