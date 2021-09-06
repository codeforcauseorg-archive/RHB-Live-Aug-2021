package org.codeforcause.rhb.lecture3;

public class NextBiggerBinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 34, 56, 71};

        int result = NextBiggerBinarySearch.search(nums, 22);
        System.out.println(result);
    }

    public static int search(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if((nums[start] > target)){
                return start;
            }

            if((nums[end] < target) && (end+1 < nums.length)){
                return end+1;
            }

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }



        return -1;
    }

}
