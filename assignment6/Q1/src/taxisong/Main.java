package taxisong;

public class Main {

//    Given the root of a binary tree and an integer targetSum,
//    return the number of paths where the sum of the values along the path equals targetSum.
//
//    The path does not need to start or end at the root or a leaf,
//    but it must go downwards (i.e., traveling only from parent nodes to child nodes).

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int PathSumIII(TreeNode root, int targetSum){
        int ans = 0;
        if (root == null) return ans;

        return helper(root, targetSum) + PathSumIII(root.left, targetSum) + PathSumIII(root.right, targetSum);
    }

    public static int helper(TreeNode node, int target){
        int ret = 0;
        if (node == null) return 0;
        if (node.val == target) ret += 1;

        return ret + helper(node.left, target - node.val) + helper(node.right, target - node.val);
    }
}//end of Main
