package taxisong;

public class Main {

//    You are given the root of a binary tree containing digits from 0 to 9 only.
//
//    Each root-to-leaf path in the tree represents a number.
//
//    For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
//    Return the total sum of all root-to-leaf numbers.
//    Test cases are generated so that the answer will fit in a 32-bit integer.
//
//    A leaf node is a node with no children.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    static int ans = 0;

    public static int sumNumbers(TreeNode root) {
        if (root == null) return ans;
        helper(root, root.val);
        return ans;
    }
    public static void helper(TreeNode node, int sum){
        if (node.left == null && node.right == null) {
            ans += sum;
            return;
        }
        if (node.left != null) helper(node.left, sum * 10 + node.left.val);
        if (node.right != null) helper(node.right, sum * 10 + node.right.val);
    }
}//end of Main
