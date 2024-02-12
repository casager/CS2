import java.util.Arrays;

public class CallingFunctions {
    public static void main(String[] args) 

    { 

        // int[] a = {2, 4, 6, 8 }; 

        // CallingFunctions myClass = new CallingFunctions();

        // myClass.myFunction(a);

        // a[2] += 2;

        // System.out.println("My array: " + Arrays.toString(a)); 

        int[] c = { 1, 3, 5, 7, 9 };

        int answer    = 0;
     
        // scan the array
     
       for ( int index=0; index < c.length; index++ )
     
       { 
     
           answer = answer + c[ index ] ;  
     
       }
     
       System.out.println( answer ); 

   }

    // private void myFunction(int[] b) {

    //        b[0] += 6;

    //        b[1] += 4;

    //        b = new int[4];

    //        b[2] += 6;

    //        b[3] += 4;

    //  }
    }
