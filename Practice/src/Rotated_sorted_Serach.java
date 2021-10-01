

public class Rotated_sorted_Serach {


    public  static  int search( int [] arr , int target ){

        int start =0 ;
        int end = arr.length-1;
        while (start<=end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            //checking my left part is sorted
            if (arr[mid] >= arr[start]) {
                // left part is sorted (now i need to check validity of th left arr)
                if (arr[start] <= target && arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // left is not sorted // sorted portion is right
            else {
                if (arr[mid] <= target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr= { 4,5,6,7,1,2,3};
        int target =5;
        System.out.println((search(arr, target)));

    }
}
