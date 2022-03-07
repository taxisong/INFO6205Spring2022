package taxisong;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

//    Given a binary tree,
//    find the lowest common ancestor (LCA) of two given nodes in the tree.
//
//    According to the definition of LCA on Wikipedia:
//    “The lowest common ancestor is defined between two nodes p and q
//    as the lowest node in T that has both p and q as descendants
//    (where we allow a node to be a descendant of itself).”

    public static void main(String[] args) {
	// write your code here
    }//end of main

    static Map<TreeNode, TreeNode> map = new HashMap<>();
    static Set<Integer> set = new HashSet<>();

    public static TreeNode LowestCommonAncestorofaBinaryTree(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return null;
        helper(root);
        while (p != null) {
            set.add(p.val);
            p = map.get(p);
        }
        while (q != null){
            if (set.contains(q.val)) return q;
            q = map.get(q);
        }
        return null;
    }

    public static void helper(TreeNode node){
        if (node.left != null) {
            map.put(node.left, node);
            helper(node.left);
        }
        if (node.right != null) {
            map.put(node.right, node);
            helper(node.right);
        }
    }

}//end of Main
