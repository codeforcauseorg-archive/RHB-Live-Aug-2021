import java.util.Scanner;

public class RotateMatrix {

    public static  void reverse(int[] arr){





        for( int i =0  ; i < arr.length/2; i++ ){
            int ithpos = arr[i]; // u
            int lastith = arr[arr.length-(i+1)];// s
            arr[i]=lastith; // ehsshe
            arr[arr.length-(i+1)]=ithpos;//ehsuya

        }


    }

    public  static  void swap(int i , int j , int[][] arr){

        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp ;

    }

    public  static  void transpose( int[][] arr){


        /**
         * Swap the ij element with ji element
         * Precaution: Jo element ek baar process ho chuka hai , usko dubara process nahi karna hai
         *
         *
         */
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                swap(i, j ,arr);
            }
        }

    }

    public  static  void rotateArr( int[][] arr){

        for (int i = 0; i < arr.length ; i++) {
            reverse(arr[i]);
        }
    }

    public  static  void Rotate_Matrix( int[][] arr){

        /**
         *
         * 1)Transpose
         * 2) Shift every row by 1
         *
         */

        transpose(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr.length ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        rotateArr(arr);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for( int i = 0 ; i < size; i++){
            for( int j =0 ; j < size; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        Rotate_Matrix(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }




}
