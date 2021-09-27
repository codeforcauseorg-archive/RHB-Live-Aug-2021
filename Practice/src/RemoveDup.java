public class RemoveDup {


    public static  void removedup( int[] arr){
        /***
         *index=1;
         * loop through the array
         * , if we find duplicate we dont do anything
         * if we findd a unique no qwe put that into our index
         *
         */

        int ind =1;
        for (int i = 1; i < arr.length ; i++) {

            if( arr[i]!=arr[i-1]){
                // the number is unique
                arr[ind]=arr[i];
                ind++;


            }

        }
        for (int i = ind; i < arr.length; i++) {
            arr[i]=-1;
        }


    }


    public static void main(String[] args) {
        int[] arr = { 1, 2,2,2,3,4,6,6,8,8,9,10,12,12};
        removedup(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
