public class PE_problem36 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        int totalSum = 0;
        int length = 0;
        int biLength = 0;
        for(int i = 0; i < 1000000; i++){
            String intString = Integer.toString(i);
            String binaryString = Integer.toBinaryString(i);
            length = intString.length();
            for (int j = 0; j < length / 2; j++){
                if ((intString.charAt(j) == intString.charAt(length - 1 - j))){
                    flag1 = true;
                }
                else {
                    flag1 = false;
                    break;
                }
            }
            if (flag1){
                biLength = binaryString.length();
                for (int j = 0; j < biLength / 2; j++){
                    if (binaryString.charAt(j) == binaryString.charAt(biLength - 1 - j)){
                        flag2 = true;
                    }
                    else {
                        flag2 = false;
                        break;
                    }
                }
            }
            if(length == 1){
                flag1 = true;
            }
            if(biLength == 1){
                flag2 = true;
            }
            if (flag1 && flag2){
                System.out.println(intString + " " + binaryString);
                totalSum += i;
            }
        }
        System.out.println("Total Sum:" + totalSum);
    }
}
