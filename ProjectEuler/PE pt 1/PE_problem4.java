//Program prints the  largest palindrome made from the product of two 3-digit numbers

public class PE_problem4 {
    public static void main(String[] args) {
        int testNum = 0;
        String strNum;
        int maxPal = 0;

        for (int i = 100; i < 1000; i++){
            for(int j = i + 1; j< 1000; j++){ //setting at i + 1 gets rid duplicates
                testNum = i * j;
                strNum = String.valueOf(testNum);
                if(strNum.length() == 5){
                    if(strNum.charAt(0) == strNum.charAt(4)
                    && strNum.charAt(1) == strNum.charAt(3)){
                        if(testNum > maxPal) maxPal = testNum;
                    }
                }
                else if(strNum.length() == 6){
                    if(strNum.charAt(0) == strNum.charAt(5)
                    && strNum.charAt(1) == strNum.charAt(4)
                    && strNum.charAt(2) == strNum.charAt(3)){
                        if(testNum > maxPal) maxPal = testNum;
                    }
                }
            }
        }
        System.out.println("Maximum Palindrome: " + maxPal);
    }
}
