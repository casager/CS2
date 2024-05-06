public class PE_problem34 {
    public static int factorial(int n){
        int prod = 1;
        for (int i = n; i > 0; i--){
            prod = prod * i;
        }
        return prod;
    }
    public static void main(String[] args) {
        int tempValue = 0;
        int sum = 0;
        int totalSum = 0;

        for (int i = 3; i < 10000000; i++){
            sum = 0;
            String num = Integer.toString(i);
            int terms[] = new int[num.length()];
            for (int j = 0; j < num.length(); j++){
                terms[j] = num.charAt(j) - '0'; //get the integer of character
                tempValue = factorial(terms[j]);
                sum+= tempValue;
            }
            if (sum == i){
                System.out.println(i);
                totalSum +=sum;
            }
        }
        System.out.println("Total Sum: " + totalSum);
    }
}
