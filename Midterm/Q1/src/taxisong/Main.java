package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {0, 1, 3, 50 ,75};
        returnMissingNumber(nums1, 0, 99);
    }//end of main

    public static void returnMissingNumber(int[] nums, int lower, int upper){
        if (nums[0] != lower) System.out.print("[" + lower + ", " + (nums[0] - 1) + "], ");
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i + 1] - 1 && i < nums.length - 2) System.out.print("[" + (nums[i] + 1) + ", " + (nums[i + 1] - 1) + "], ");
            else if (nums[i] != nums[i + 1] - 1) System.out.print("[" + (nums[i] + 1) + ", " + (nums[i + 1] - 1) + "]");
        }
        if (nums[nums.length - 1] != upper) System.out.print(" , [" + (nums[nums.length - 1] + 1) + ", " + upper + "] ");
    }//end of returnMissingNumber
}//end of Main
