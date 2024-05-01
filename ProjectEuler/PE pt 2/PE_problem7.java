public class PE_problem7 {

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
        int count = 0;
        int i = 2;
        while(count != 10001){
            if (isPrime(i)){
                count++;
            }
            i++;
        }
        System.out.print(i-1);
    }
}
