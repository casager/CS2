//Program finds smallest positive number that is evenly divisble by all numbers 1-20

public class PE_problem5 {
    public static void main(String[] args) {
        int flag = 1;
        int i = 1;
        outerloop:
        while(flag == 1){
            flag = 0; //resets flag
            for (int j = 1; j <= 20; j++){
                if(i % j != 0){
                    flag = 1; //signifies next number needed
                    i++;
                    continue outerloop;
                }
                else if(flag == 0 && j == 20){
                    System.out.println(i);
                    flag = 0;
                }
            }
        }
    }
}
