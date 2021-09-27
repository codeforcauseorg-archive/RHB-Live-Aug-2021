import java.util.Scanner;

public class RevString {

    public  char[] reverse2(char[] arr){
        // bage
        char[] revarr= new char[arr.length];
        int ind = 0 ;


        for (int i = arr.length-1; i >=0 ; i--) {

            revarr[ind]=arr[i];
            ind++;
        }
        return  revarr;

    }


    public static  void reverse(char[] arr){

        //a y u s he->



        for( int i =0  ; i < arr.length/2; i++ ){
            char ithpos = arr[i]; // u
            char lastith = arr[arr.length-(i+1)];// s
            arr[i]=lastith; // ehsshe
            arr[arr.length-(i+1)]=ithpos;//ehsuya

        }


    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.next();

        char[] arr = input.toCharArray();
        System.out.println(String.valueOf(arr));

        reverse(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }

}
