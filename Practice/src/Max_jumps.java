import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Max_jumps {


    public  static  int func( int [] arr , int start ){

        int curr_index_val = arr[start] ;

        if( start==arr.length-1){
            return  0 ;
        }

        int min_val = Integer.MAX_VALUE;
        //int[] arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        for (int i = start+1; i < arr.length && i <= start+curr_index_val; i++) {

            int x = func(arr, i);

            if (x<min_val){
                min_val=x;
            }

        }


        return  min_val+1;

    }


    public static void main(String[] args) {

        int[] arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };


        // target is to reach from start to end

        System.out.println(func( arr, 0 ));

    }

}
