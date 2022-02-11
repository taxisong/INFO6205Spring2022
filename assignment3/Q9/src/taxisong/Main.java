package taxisong;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    You are given the head of a linked list with n nodes.
//
//    For each node in the list, find the value of the next greater node.
//    That is, for each node,
//    find the value of the first node that is next to it and has a strictly larger value than it.
//
//    Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed).
//    If the ith node does not have a next greater node, set answer[i] = 0.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int[] NextGreaterNodeInLinkedList(ListNode head){
        List<Integer> list = new ArrayList<Integer>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j) > list.get(i)){
                    res[i] = list.get(j);
                    break;
                }
            }
        }
        return res;
    }
}//end of Main
