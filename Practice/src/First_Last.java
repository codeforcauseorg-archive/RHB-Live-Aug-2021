public class First_Last {

    public static  int first_serach(int [] arr, int target ){
        int start = 0 ;
        int end = arr.length-1;
        int index = -1;

        while (start<=end){

            int mid = (start+end)/2;

            if (arr[mid]>target){
                end= mid-1;

            }
            else  if( arr[mid]<target){
                start=mid+1;
            }
            if( arr[mid]==target){
                index=mid;
                end=mid-1;
            }

        }


    return  index;

    }
    public  static  int last_search( int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        int index = -1;
        while (start<=end) {

            int mid = (start+end)/2;

            if (arr[mid]>target){
                end= mid-1;

            }
            else  if( arr[mid]<target){
                start=mid+1;
            }
            if ( arr[mid]==target){
                index= mid;
                start=mid+1;
            }



        }

        return  index;
    }

    public static void main(String[] args) {

        int[] arr= { -1, 0 , 1,2 ,2,2,2, 2,2,2,2,3,4,5,5,5,5,5,6,7};

        int first_position=first_serach(arr , 5);
        int last_position= last_search(arr, 5);

        System.out.println("first position: "+ first_position);
        System.out.println("Last position: "+ last_position);



    }


}
