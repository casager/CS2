public class Sager_Problem6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,8,7,9,4,1};
        int notUnique = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if ((arr[i] == arr[j]) && (i != j)){
                    notUnique++;
                }
                else {
                    continue;
                }
            }
        }
        int unique = arr.length-notUnique;
        System.out.println(unique);

    }
}
