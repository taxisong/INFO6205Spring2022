package taxisong;

public class Main {

//    Given the head of a linked list and a value x,
//    partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//    You should preserve the original relative order of the nodes in each of the two partitions.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode PartitionList(ListNode head, int x){
        if (head == null) {return head;}
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode curr = head;
        ListNode currLeft = left;
        ListNode currRight = right;
        while (curr != null){
            if (curr.val < x){
                currLeft.next = curr;
                currLeft = currLeft.next;
            } else {
                currRight.next = curr;
                currRight = currRight.next;
            }
            curr = curr.next;
        }
        currLeft.next = right.next;
        currRight.next = null;
        return left.next;
    }
}//end of Main
