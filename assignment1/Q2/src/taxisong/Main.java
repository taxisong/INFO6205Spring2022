package taxisong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

//    Given an integer array of size n,
//    find all elements that appear more than ⌊ n/3 ⌋ times.

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {3,2,3};//Example 1
        int[] nums2 = {1};//Example 2
        int[] nums3 = {1,2};//Example 3
    }//end of main

    public static List<Integer> MajorityElementII(int[] nums){
        HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            if (cnt.containsKey(nums[i])){
                cnt.put(nums[i],cnt.get(nums[i]) + 1);
            } else {
                cnt.put(nums[i], 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int x : cnt.keySet()){
            if (cnt.get(x) > nums.length / 3){
                ans.add(x);
            }
        }

        return ans;
    }//end of MajorityElementII
}//end of Main
