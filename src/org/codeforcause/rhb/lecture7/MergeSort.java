package org.codeforcause.rhb.lecture7;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] nums = {324, 324, 2, 3, 53,24, 25, 11, 55};

        int[] sol = MergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(sol));




    }

    public static int[] mergeSort(int[] nums){
        if(nums.length < 2){
            return nums;
        }

        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        int[] leftSorted = MergeSort.mergeSort(left);
        int[] rightSorted = MergeSort.mergeSort(right);

        return MergeSort.merge(leftSorted, rightSorted);
    }

    public static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ((i < first.length) && (j < second.length)){
            if(first[i] < second[j]){
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }

        while((i < first.length)){
            result[k++] = first[i++];
        }

        while((j < second.length)){
            result[k++] = second[j++];
        }

        return result;

    }
}
