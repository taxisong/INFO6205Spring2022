package taxisong;

public class Main {

//    You are given a sorted array consisting of only integers where every element appears exactly twice,
//    except for one element which appears exactly once.
//
//    Return the single element that appears only once.
//
//    Your solution must run in O(log n) time and O(1) space.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int SingleElementinaSortedArray(int[] nums){
        for (int i = 0; i < nums.length - 1; i+=2){
            if (nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}//end of Main
