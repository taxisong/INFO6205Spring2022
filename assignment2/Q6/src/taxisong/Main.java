package taxisong;

import java.util.Arrays;

public class Main {

//    Given an integer array nums of length n and an integer target,
//    find three integers in nums such that the sum is closest to target.
//
//    Return the sum of the three integers.
//
//    You may assume that each input would have exactly one solution.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;
        for (int i = 0; i < n; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1, k = n - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)){
                    best = sum;
                }
                if (sum > target){
                    int k0 = k - 1;
                    while (j < k0 && nums[k0] == nums[k]){
                        --k0;
                    }
                    k = k0;
                } else {
                    int j0 = j + 1;
                    while (j0 < k && nums[j0] == nums[j]){
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }
}//end of Main
