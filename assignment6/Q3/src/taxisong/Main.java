package taxisong;

import java.util.HashMap;
import java.util.Map;

public class Main {

//    Given the root of a binary tree,
//    return the length of the longest path,
//    where each node in the path has the same value.
//    This path may or may not pass through the root.
//
//    The length of the path between two nodes is represented by the number of edges between them.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    static int ans = 0;

    public static int LongestUnivaluePath(TreeNode root) {
        helper(root);
        return ans;
    }

    public static int helper(TreeNode node) {
        if (node == null) return 0;

        int lMax = helper(node.left);
        int rMax = helper(node.right);

        int l = 0, r = 0;
        if (node.left != null && node.left.val == node.val){
            l += lMax + 1;
        }
        if (node.right != null && node.right.val == node.val){
            r += rMax + 1;
        }

        ans = Math.max(ans, l + r);
        return Math.max(l, r);

    }

}//end of Main
