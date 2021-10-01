public class Stock_buy_Sell {


    public static  int maxProfit2( int[] arr){

        /**
         * we will have i has a lopp iterator of array
         * and  utill we will be having data of min price behind it
         * Also will store maxprofit in a variable as we did in the previos part
         *
         * Note: At any point of the iteration , we will have the correct data till that point.
         * Time Complexity -> Liner i.e. O(n){ where n is the size of arr}
         */

        int min_price=0 ;
        int max_profit =0;


        min_price= arr[0]; //7

        for ( int i = 1; i < arr.length; i++){
            int pro = arr[i]-min_price;
            if( pro> max_profit){
                max_profit=pro;
            }
            if (arr[i]<min_price ){
                min_price=arr[i];
            }
        }

        return max_profit;





    }

    public static int maxProfit(int[] arr){

        /**
         * We will check all the possible combinations of the given array
         * For each combination , we will find the profit
         * We will store the maximum profit in our varibale and then return it afterwards
         *
         *   time Complexity = O(n^2) {where n is the size of arr}
         */

        int profit = 0 ;


        for( int i = 0 ; i < arr.length; i++){
            int buy_price= arr[i];
            for (int j = i; j <arr.length ; j++) {

                int sell_price = arr[j];
                int pro = sell_price-buy_price;
                if( pro> profit){
                    profit=pro;
                }
            }

        }
        return profit;


    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,45,78};

        System.out.println(maxProfit2(arr));



    }

}
