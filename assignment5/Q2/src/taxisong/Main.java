package taxisong;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Given the root of a binary tree, collect a tree's nodes as if you were doing this:
//
//    Collect all the leaf nodes.
//    Remove all the leaf nodes.
//    Repeat until the tree is empty.

    public static void main(String[] args) {
	// write your code here
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)), 3);
    }//end of main

    public static List<List<Integer>> FindLeavesofBinaryTree(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        getDepth(root, list);
        return list;
    }

    public static int getDepth(TreeNode node, List<List<Integer>> list){
        if (node == null) return -1;
        int left = getDepth(node.left, list);
        int right = getDepth(node.right, list);
        int depth = Math.max(left, right) + 1;
        if (list.size() < depth + 1) list.add(new ArrayList<>());
        list.get(depth).add(node.val);
        return depth;
    }
}//end of Main
