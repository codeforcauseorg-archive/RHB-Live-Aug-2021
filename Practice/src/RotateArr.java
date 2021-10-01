public class RotateArr {

    public static void rotate ( int[] arr){
        /**
         * we will te,porarily store the last elem
         * then we iterate over the array in reverse fashion
         * starting form second last elem
         * we will shift every elem towards it right??
         * arr[i+1]=arr[i]
         * we will put the last elem (stored earlier) at 0 index
         */

        int lastelem = arr[arr.length-1];

        for( int i = arr.length-2; i >=0 ; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=lastelem;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
