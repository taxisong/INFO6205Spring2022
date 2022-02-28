package taxisong;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

//    Given the root of a binary tree,
//    return an array of the largest value in each row of the tree (0-indexed).

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static List<Integer> FindLargestValueinEachTreeRow(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(max);
        }
        return list;
    }
}//end of Main
