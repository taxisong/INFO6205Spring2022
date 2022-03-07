package taxisong;

public class Main {

//    Given the root of a complete binary tree,
//    return the number of the nodes in the tree.
//
//    According to Wikipedia, every level, except possibly the last,
//    is completely filled in a complete binary tree,
//    and all nodes in the last level are as far left as possible.
//    It can have between 1 and 2h nodes inclusive at the last level h.
//
//    Design an algorithm that runs in less than O(n) time complexity.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int countNodes(TreeNode root) {
        return helper(root);
    }

    public static int helper(TreeNode node){
        if (node == null) return 0;
        return helper(node.left) + helper(node.right) + 1;
    }

}//end of Main
