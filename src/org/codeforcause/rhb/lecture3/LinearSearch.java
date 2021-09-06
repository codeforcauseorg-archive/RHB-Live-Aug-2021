package org.codeforcause.rhb.lecture3;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 5, 11, 56, 34};

        int result = LinearSearch.linearSearch(nums, 22);
        System.out.println(result);
    }

    public static int linearSearch(int[] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == value){
                return i;
            }
        }

        return -1;
    }


}
