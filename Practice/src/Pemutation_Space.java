
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pemutation_Space {


    public  static  ArrayList<String> func( String s ){
        //"abc"
        //bc[b c, bc]
        //c. [c]
        if ( s.length()==1){
            ArrayList<String> arr= new ArrayList<>();
            arr.add(s);
            return  arr;
        }

        ArrayList<String> rest_ans= func( s.substring(1));
        //[b c, bc]
        ArrayList<String> finalans = new ArrayList<>();

        for (String xyz : rest_ans){
            finalans.add(s.charAt(0)+" "+xyz);
            //[a b c]
            // [a b c ,ab c,a bc ]
            finalans.add(s.charAt(0)+xyz);
            // [a b c ,ab c, ]
            // [a b c ,ab c,a bc,abc ]
        }
        return  finalans;
        //[b_c, bc]

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        ArrayList<String>  arr= func( input );

        System.out.println(arr);



    }
}
