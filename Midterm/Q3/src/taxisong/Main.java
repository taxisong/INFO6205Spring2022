package taxisong;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20,7};
        System.out.println(OriginalTree(preorder, inorder).val);
        System.out.println(OriginalTree(preorder, inorder).left.val);
        System.out.println(OriginalTree(preorder, inorder).right.val);
        System.out.println(OriginalTree(preorder, inorder).right.left.val);
        System.out.println(OriginalTree(preorder, inorder).right.right.val);
        System.out.println(OriginalTree(preorder, inorder).left.left.val);
        System.out.println(OriginalTree(preorder, inorder).left.right.val);
    }//end of main

    static Map<Integer, Integer> map1 = new HashMap<>();
    static Map<Integer, Integer> map2 = new HashMap<>();

    public static TreeNode OriginalTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 0; i < preorder.length; i++) map1.put(preorder[i], i);
        for (int i = 0; i < inorder.length; i++) map2.put(inorder[i], i);

        helper(root, preorder, inorder, new int[]{0, preorder.length});

        return root;
    }

    public static void helper (TreeNode node, int[] preorder, int[] inorder, int[] range){
        if (map1.get(node.val) == preorder.length - 1) {
            node.left = null;
            node.right = null;
            return;
        }
        if (map2.get(preorder[map1.get(node.val) + 1]) < map2.get(node.val) && map2.get(preorder[map1.get(node.val) + 1]) >= range[0] && map2.get(preorder[map1.get(node.val) + 1]) <= range[1]) {
            node.left = new TreeNode(preorder[map1.get(node.val) + 1]);
            helper(node.left, preorder, inorder, new int[]{0, map2.get(node.val) - 1});
        }
        else if (map2.get(preorder[map1.get(node.val) + 1]) > map2.get(node.val) && map2.get(preorder[map1.get(node.val) + 1]) >= range[0] && map2.get(preorder[map1.get(node.val) + 1]) <= range[1]) {
            node.right = new TreeNode(preorder[map1.get(node.val) + 1]);
            helper(node.right, preorder, inorder, new int[]{map2.get(node.val) + 1, 0});
        }
        if (map1.get(node.val) < preorder.length - 2 && node.left != null && map2.get(preorder[map1.get(node.val) + 2]) > map2.get(node.val) && map2.get(preorder[map1.get(node.val) + 2]) >= range[0] && map2.get(preorder[map1.get(node.val) + 2]) <= range[1]) {
            node.right = new TreeNode(preorder[map1.get(node.val) + 2]);
            helper(node.right, preorder, inorder, new int[]{map2.get(node.val) + 2, 0});
        }
        else {
            node.left = null;
            node.right = null;
            return;
        }
    }
}//end of Main
