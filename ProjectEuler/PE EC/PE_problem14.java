public class PE_problem14 {
    public static void main(String[] args) {
        long max_length = 0;
        long index_max = 0;
        for (int i = 2; i < 1000000; i++){
            long count = 1;
            long num = i;
            while (num != 1){
                if (num % 2 == 0){
                    num = num /2;
                }
                else {
                    num = 3 * num + 1;
                }
                count++;
            }
            if (count > max_length){
                max_length = count;
                index_max = i;
            }
        }
        System.out.println(index_max);
    }

}
