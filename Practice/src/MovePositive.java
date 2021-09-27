public class MovePositive {

    public static  void swap ( int i , int j , int[] arr){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public  static  void movePosiitve( int[] arr){
        /***
         * index=0 ;
         * loop over the array , if any negative number comes
         * swap it with latest index
         *
         */


        int ind =0 ;
        for (int i = 0; i < arr.length ; i++) {
            if( arr[i]<0){
                swap( ind, i , arr);
                ind++;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = { 1, -2 ,3 , -4,-5,-9, 10 ,111};

        movePosiitve(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }

}
