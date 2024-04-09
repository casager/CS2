//Problem finds product of specific Pythag triplet set

public class PE_problem9 {
    public static void main(String[] args) {
        double sum = 0;
        double c = 0;
        double total = 0;
        int product = 0;
        for(int a = 1; a< 1000; a++){
            for(int b = a+1; b < 1000; b++){
                sum = Math.pow(a,2) + Math.pow(b,2);
                c = Math.sqrt(sum);
                total = a + b + c;
                if(total == 1000){
                    product = (int)(a * b * c);
                    System.out.print(product);
                }
            }
        }
    }
}
