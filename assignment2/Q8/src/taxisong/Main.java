package taxisong;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

//    Given an array of intervals intervals where intervals[i] = [starti, endi],
//    return the minimum number of intervals you need
//    to remove to make the rest of the intervals non-overlapping.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int NonoverlappingIntervals(int[][] intervals){
        if (intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] >= right) {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }
}//end of Main
