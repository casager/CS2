public class PE_problem8 {
    public static void main(String[] args) {
        int divisor_count = 0;
        int tri_num = 1;
        int i = 1;
        while(divisor_count <= 500){
            divisor_count = 0;
            for(int j = 1; j < (int)Math.sqrt(tri_num); j++){
                if(tri_num % j == 0){
                    divisor_count+= 2;
                }
            }

            i++;
            tri_num+=i;
        }
        System.out.print(tri_num-i);
    }
}
