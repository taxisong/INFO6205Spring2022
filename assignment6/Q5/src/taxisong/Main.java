package taxisong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

//    Given the root of a binary tree,
//    calculate the vertical order traversal of the binary tree.
//
//    For each node at position (row, col),
//    its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively.
//    The root of the tree is at (0, 0).
//
//    The vertical order traversal of a binary tree is a list of top-to-bottom orderings
//    for each column index starting from the leftmost column and ending on the rightmost column.
//    There may be multiple nodes in the same row and same column.
//    In such a case, sort these nodes by their values.
//
//    Return the vertical order traversal of the binary tree.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    HashMap<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
    int min = 0, max = 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        column(root, 0, 0);
        for (int i = min; i <= max; i++){
            List<int[]> temp = map.get(i);
            Collections.sort(temp, (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0];
                else return a[1] - b[1];
            });
            List<Integer> cur = new ArrayList<>();
            for (int[] t : temp){
                cur.add(t[1]);
            }
            list.add(cur);
        }
        return list;
    }

    public void column(TreeNode node, int r, int c){
        min = Math.min(min, c);
        max = Math.max(max, c);
        List<int[]> list = map.getOrDefault(c, new ArrayList<int[]>());
        list.add(new int[]{r, node.val});
        map.put(c, list);
        if (node.left != null) column(node.left, r + 1, c - 1);
        if (node.right != null) column(node.right, r + 1, c + 1);
    }
}//end of Main
