package taxisong;

import java.util.*;

public class Main {

//    Given the root of a binary tree,
//    return the bottom-up level order traversal of its nodes' values.
//    (i.e., from left to right, level by level from leaf to root).

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static List<List<Integer>> BinaryTreeLevelOrderTraversalII(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null)queue.offer(node.right);
            }
            list.add(0, level);
        }
        return list;
    }
}//end of Main
