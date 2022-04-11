package taxisong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

//    There is an undirected graph with n nodes numbered from 0 to n - 1 (inclusive).
//    You are given a 0-indexed integer array values where values[i] is the value of the ith node. You are also given a 0-indexed 2D integer array edges, where each edges[j] = [uj, vj, timej] indicates that there is an undirected edge between the nodes uj and vj, and it takes timej seconds to travel between the two nodes. Finally, you are given an integer maxTime.
//
//    A valid path in the graph is any path that starts at node 0, ends at node 0, and takes at most maxTime seconds to complete. You may visit the same node multiple times. The quality of a valid path is the sum of the values of the unique nodes visited in the path (each node's value is added at most once to the sum).
//
//            Return the maximum quality of a valid path.
//
//            Note: There are at most four edges connected to each node.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    private int ans = 0;
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        int n = values.length;
        List<int[]>[] adjs = new List[n];
        for (int i = 0; i < n; i++) {
            adjs[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adjs[edge[0]].add(new int[]{edge[1], edge[2]});
            adjs[edge[1]].add(new int[]{edge[0], edge[2]});
        }
        Map<Integer, Integer> seen = new HashMap<>(n);
        helper(values, maxTime, adjs, seen, 0, 0);
        return ans;
    }

    private void helper(int[] values, int remainTime, List<int[]>[] adjs, Map<Integer, Integer> seen, int curr, int val) {
        if (seen.getOrDefault(curr, 0) == 0) {
            val += values[curr];
        }
        seen.put(curr, seen.getOrDefault(curr, 0) + 1);
        for (int i = 0; i < adjs[curr].size(); i++) {
            int[] next = adjs[curr].get(i);
            if (remainTime >= next[1]) {
                helper(values, remainTime - next[1], adjs, seen, next[0], val);
            }
        }
        if (curr == 0) {
            this.ans = Math.max(this.ans, val);
        }
        seen.put(curr, seen.get(curr) - 1);
    }
}//end of Main
