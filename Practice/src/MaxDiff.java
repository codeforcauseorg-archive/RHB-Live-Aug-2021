import java.util.Arrays;
import java.util.Scanner;

public class MaxDiff {


    public  static  int max_diff_2(int[] arr){

        Arrays.sort(arr);

        return  arr[arr.length-1]-arr[0] ;


    }

    public  static  int max_diff_3(int[] arr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(min> arr[i]){
                min=arr[i];
            }
            if ( max< arr[i]){
                max= arr[i];
            }
        }

        return  max-min;

    }

    public  static  int max_diff_1( int[] arr){
        int diff = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(Math.abs(arr[i]-arr[j]) > diff){
                    diff = Math.abs(arr[i]-arr[j]);
                }

            }

        }

      return  diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i <len  ; i++) {
            arr[i]=sc.nextInt();
        }


        int ans1 = max_diff_1(arr);
        int ans2= max_diff_2(arr);
        int ans3= max_diff_3(arr);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);


    }
}
