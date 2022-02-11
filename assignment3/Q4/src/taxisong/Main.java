package taxisong;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    You are given the head of a singly linked-list. The list can be represented as:
//
//    L0 → L1 → … → Ln - 1 → Ln
//    Reorder the list to be on the following form:
//
//    L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//    You may not modify the values in the list's nodes.
//    Only nodes themselves may be changed.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static void ReorderList(ListNode head){
        if (head == null){
            return;
        }
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while (node != null){
            list.add(node);
            node = node.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j){
            list.get(i).next = list.get(j);
            i++;
            if (i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}//end of Main
