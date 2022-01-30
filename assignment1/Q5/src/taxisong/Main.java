package taxisong;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    Given a sorted integer array arr,
//    two integers k and x,
//    return the k closest integers to x in the array.
//    The result should also be sorted in ascending order.
//
//    An integer a is closer to x than an integer b if:
//
//            |a - x| < |b - x|, or
//            |a - x| == |b - x| and a < b

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {1,2,3,4,5};//Example 1

        FindKClosestElements(arr1, 4, 3);
    }//end of main

    public static List<Integer> FindKClosestElements(int[] arr, int k, int x){
        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(ret, (a, b) -> a == b ? a - b : Math.abs(a - x) - Math.abs(b - x));
        ret = ret.subList(0, k);
        Collections.sort(ret);
        return ret;
    }//end of FindKClosestElements
}//end of Main
