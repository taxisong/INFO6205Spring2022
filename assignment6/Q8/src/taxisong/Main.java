package taxisong;

public class Main {

//    Given a binary tree root and an integer target,
//    delete all the leaf nodes with value target.
//
//    Note that once you delete a leaf node with value target,
//    if its parent node becomes a leaf node and has the value target,
//    it should also be deleted (you need to continue doing that until you cannot).

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && root.val == target) root = null;
        return root;
    }
}//end of Main
