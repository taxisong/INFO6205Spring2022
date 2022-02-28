package taxisong;

import java.util.HashMap;
import java.util.Map;

public class Main {

//    Given the root of a binary tree, return the maximum width of the given tree.
//
//    The maximum width of a tree is the maximum width among all levels.
//
//    The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes are also counted into the length calculation.
//
//    It is guaranteed that the answer will in the range of 32-bit signed integer.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    int ans = 0;
    Map<Integer, Integer> map = new HashMap<>();

    public int MaximumWidthofBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return ans;
    }

    public void dfs(TreeNode node, int depth, int pos){
        if (node == null) return;
        map.computeIfAbsent(depth, x -> pos);
        ans = Math.max(ans, pos - map.get(depth) + 1);
        dfs(node.left, depth + 1, 2 * pos);
        dfs(node.right, depth + 1, 2 * pos + 1);
    }
}//end of Main
