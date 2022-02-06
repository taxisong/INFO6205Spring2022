package taxisong;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

//    Given an array of meeting time intervals intervals
//    where intervals[i] = [starti, endi],
//    return the minimum number of conference rooms required.

    public static void main(String[] args) {
	// write your code here
        int[][] intervals1 = {{0,30}, {5,10}, {15,20}};//Example 1
        int[][] intervals2 = {{7,10}, {2,4}};//Example 2

        System.out.println(meetingRoomsII(intervals1));
        System.out.println(meetingRoomsII(intervals2));
    }//end of main

    public static int meetingRoomsII(int[][] intervals){
        if (intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, (interval1, interval2) ->{
            return interval1[0] - interval2[0];
        });

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] > pq.peek()){
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }
        return pq.size();
    }
}//end of Main
