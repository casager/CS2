public class PE_problem30 {
    public static void main(String[] args) {
        int tempValue = 0;
        int sum = 0;
        int totalSum = 0;

        for (int i = 2; i < 10000000; i++){
            sum = 0;
            String num = Integer.toString(i);
            int terms[] = new int[num.length()];
            for (int j = 0; j < num.length(); j++){
                terms[j] = num.charAt(j) - '0'; //get the integer of character
                tempValue = (int)Math.pow(terms[j], 5);
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
