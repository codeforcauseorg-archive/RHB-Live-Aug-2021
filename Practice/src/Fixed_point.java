public class Fixed_point {


    public static  int Find_fixed_point(int[] arr){
        int start =0 ;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;
            if( arr[mid]==mid){
                return mid;
            }

            else if ( mid > arr[mid]){
                start= mid+1;
            }
            else {
                // index< val

                end= mid-1;
            }



        }

        return -1;



    }

    public static void main(String[] args) {
        int[ ] arr = {-10, -1, 0 , 2,4, 10, 11, 30, 50 , 100 };
        // increasing order and unique elements

        System.out.println((Find_fixed_point(arr)));
    }

}

