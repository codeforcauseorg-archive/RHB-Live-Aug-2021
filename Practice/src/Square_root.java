public class Square_root {


    public static  int sqrt( int x){


        if( x==0){
            return 0 ;
        }

        int start =1;
        int end = x;

        while( start<=end){

            if( start==end){
                return  start-1;
            }

            int mid = (start+end)/2;
            if ( mid==x/mid){
                return  mid;
            }
            else if( mid < x/mid){
                start=mid+1;
            }
            else {
                // mid2> x

                end= mid-1;
            }


        }
        return  -1;
    }



    public static void main(String[] args) {
        int x = 1000000;

        int ans_sqrt = sqrt( x);
        System.out.println(ans_sqrt);

    }
}
