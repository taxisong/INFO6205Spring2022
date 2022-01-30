package taxisong;

public class Main {

//    Given an array nums with n objects colored red, white, or blue,
//    sort them in-place so that objects of the same color are adjacent,
//    with the colors in the order red, white, and blue.
//
//    We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
//    respectively.
//
//    You must solve this problem without using the library's sort function.



    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {2,0,2,1,1,0};//Example 1
        int[] nums2 = {2,0,1};//Example 2


    }//end of main

    public static void SortColors (int[] nums){
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }
        for (int i = ptr; i < n; i++){
            if (nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }
    }//end of SortColors

}//end of Main
