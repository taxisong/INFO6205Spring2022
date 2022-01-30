package taxisong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//    Given an array of integers arr,
//    sort the array by performing a series of pancake flips.
//
//    In one pancake flip we do the following steps:
//
//    Choose an integer k where 1 <= k <= arr.length.
//    Reverse the sub-array arr[0...k-1] (0-indexed).
//    For example, if arr = [3,2,1,4] and we performed a pancake flip choosing k = 3,
//    we reverse the sub-array [3,2,1],
//    so arr = [1,2,3,4] after the pancake flip at k = 3.
//
//    Return an array of the k-values corresponding to a sequence of pancake flips that sort arr.
//    Any valid answer that sorts the array within 10 * arr.length flips will be judged as correct.

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3,2,4,1};//Example 1

        PancakeSorting(arr);
    }//end of main

    public static List<Integer> PancakeSorting(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Integer[] arr_ = new Integer[n];
        for (int i = 0; i < n; i++){
            arr_[i] = i + 1;
        }
        Arrays.sort(arr_, (i, j) -> arr[j - 1] - arr[i - 1]);
        for (int i : arr_){
            for (int f : ans){
                if (i <= f){
                    i = f + 1 - i;
                }
            }
            ans.add(i);
            ans.add(n--);
        }
        return ans;
    }
}//end of Main
