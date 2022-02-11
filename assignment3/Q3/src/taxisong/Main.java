package taxisong;

import java.util.PriorityQueue;

public class Main {

//    You are given an array of k linked-lists lists,
//    each linked-list is sorted in ascending order.
//
//    Merge all the linked-lists into one sorted linked-list and return it.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode MergekSortedLists(ListNode[] lists){
        PriorityQueue queue = new PriorityQueue<Status>();
        for (ListNode node : lists){
            if (node != null){
                queue.offer(new Status(node.val, node));
            }
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (!queue.isEmpty()){
            Status f = (Status) queue.poll();
            tail.next = f.ptr;
            tail = tail.next;
            if (f.ptr.next != null){
                queue.offer(new Status(f.ptr.next.val, f.ptr.next));
            }
        }
        return head.next;
    }//end of MergekSortedLists
}//end of Main
