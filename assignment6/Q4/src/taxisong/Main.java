package taxisong;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

//    Serialization is the process of converting a data structure or object
//    into a sequence of bits so that it can be stored in a file or memory buffer,
//    or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
//
//    Design an algorithm to serialize and deserialize a binary tree.
//    There is no restriction on how your serialization/deserialization algorithm should work.
//    You just need to ensure that a binary tree can be serialized to a string
//    and this string can be deserialized to the original tree structure.
//
//    Clarification: The input/output format is the same as how LeetCode serializes a binary tree.
//    You do not necessarily need to follow this format,
//    so please be creative and come up with different approaches yourself.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return rserialize(root, "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return rdeserialize(dataList);
    }

    public String rserialize(TreeNode node, String str){
        if (node == null) return str += "None,";
        else {
            str += str.valueOf(node.val) + ",";
            str = rserialize(node.left, str);
            str = rserialize(node.right, str);
        }
        return str;
    }

    public TreeNode rdeserialize(List<String> dataList){
        if (dataList.get(0).equals("None")){
            dataList.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(dataList.get(0)));
        dataList.remove(0);
        node.left = rdeserialize(dataList);
        node.right = rdeserialize(dataList);

        return node;
    }

}//end of Main
