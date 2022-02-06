package taxisong;

public class Main {

//    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//            [4,5,6,7,0,1,2] if it was rotated 4 times.
//            [0,1,2,4,5,6,7] if it was rotated 7 times.
//    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//    Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//
//    You must write an algorithm that runs in O(log n) time.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int FindMinimuminRotatedSortedArray(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]){
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }//end of FindMinimuminRotatedSortedArray

}//end of Main
