package taxisong;

public class Main {

//    Given a sorted array of distinct integers and a target value,
//    return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1,3,5,6};//Example 1

        System.out.println(SearchInsertPosition(nums1, 5));
    }//end of main

    public static int SearchInsertPosition(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right){
            int mid = ((right - left) >> 1) + left;//右移运算
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}//end of Main
