//Program determines sum of even fibonacci numbers in range
public class PE_problem2 {
    public static void main(String[] args) {
        int value = 1;
        int nextValue = 2;
        int sum = 0;
        int temp;
        while(nextValue < 4000000){ //initially checked lower numbers like 10
            if(value % 2 == 0){
                sum = sum + value;
            }
            temp = value;
            value = nextValue;
            nextValue = nextValue + temp;
        }
        if(value % 2 == 0){
            sum = sum + value;
        }
        System.out.println("Sum of even-valued terms: "  + sum);
    }
}
