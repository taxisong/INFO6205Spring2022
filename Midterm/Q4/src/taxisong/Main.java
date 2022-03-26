package taxisong;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(mergeIntervals(intervals));
    }//end of main

    public static List<int[]> mergeIntervals(int[][] intervals){


        List<int[]> list = new ArrayList<>();

        if (intervals.length < 1) return list;
        Arrays.sort(intervals, (interval1, interval2) -> {
            return interval1[0] - interval2[0];
        });

        int start = -1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > intervals[i - 1][1]) {
                int[] interval = {start == -1 ? intervals[i - 1][0] : start, intervals[i - 1][1]};
                list.add(interval);
                start = -1;
            }
            else if (start == -1) {
                start = intervals[i - 1][0];
            }

            if (i == intervals.length - 1) {
                int[] interval = {start == -1 ? intervals[i - 1][0] : start, intervals[i][1]};
                list.add(interval);
            }
        }

        return list;
    }
}//end of Main
