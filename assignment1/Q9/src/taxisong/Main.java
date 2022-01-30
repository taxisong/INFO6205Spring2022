package taxisong;

import java.util.Arrays;

public class Main {

//    Given an array of integers nums,
//    sort the array in increasing order based on the frequency of the values.
//    If multiple values have the same frequency, sort them in decreasing order.
//
//    Return the sorted array.

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1,1,2,2,2,3};//Exmaple 1

        SortArraybyIncreasingFrequency(nums1);
    }//end of main

    public static int[] SortArraybyIncreasingFrequency(int[] nums){
        int[] cnts = new int[201];
        for (int n : nums){
            cnts[n + 100]++;
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = 201 * cnts[nums[i] + 100] - nums[i] + 100;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            nums[i] = 100 - nums[i] % 201;
        }
        return nums;
    }
}//end of Main
