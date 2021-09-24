package org.codeforcause.rhb.lecture7;

import java.util.Arrays;

public class QquickSort {
    public static void main(String[] args) {
        int[] nums = {324, 324, 2, 3, 53,24, 25, 11, 55};
        QquickSort.quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = QquickSort.getPivot(nums, start, end);

        QquickSort.quickSort(nums, start, pivot-1);
        QquickSort.quickSort(nums, pivot+1, end);
    }

    private static int getPivot(int[] nums, int start, int end) {
        int pvalue = nums[end];

        int i = start;

        for (int j = start; j <= end ; j++) {
            if(nums[j] < pvalue){
                if(i != j){
                    QquickSort.swap(nums, i, j);
                }
                i++;
            }
        }

        QquickSort.swap(nums, i, end);

        return i;
    }

    public static void swap(int[] nums, int one, int two){
        int temp = nums[one];
        nums[one] = nums[two];
        nums[two] = temp;
    }
}
