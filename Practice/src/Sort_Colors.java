public class Sort_Colors {


    public static void main(String[] args) {
        int[] arr = {1, 2, 1 ,0 ,0 , 0 , 1, 0 ,2};
        sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(int[] arr) {
        // count the 0 , 1 and 2
        ///replace them in arr;

        int count0 = 0 ;
        int count1 = 0 ;
        int count2 = 0 ;

        for (int i = 0; i < arr.length ; i++) {
            if( arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else if(arr[i]==2){
                count2++;
            }
        }
        //ount0=3
        int ind =0 ;
        for (int i = 0; i < count0; i++) {
            arr[ind]=0;
            ind++;
        }
        //000-------
        for( int i =0; i<count1; i++){
            arr[ind]=1;
            ind++;
        }

        for( int i =0; i<count2; i++){
            arr[ind]=2;
            ind++;
        }


    }
}
