package taxisong;

public class Main {

//    In a linked list of size n, where n is even,
//    the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node,
//    if 0 <= i <= (n / 2) - 1.
//
//        For example, if n = 4, then node 0 is the twin of node 3,
//        and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
//
//    The twin sum is defined as the sum of a node and its twin.
//
//    Given the head of a linked list with even length,
//    return the maximum twin sum of the linked list.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int MaximumTwinSumofaLinkedList(ListNode head){
        int ans = 0;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode last = slow.next;
        while (last.next != null){
            ListNode cur = last.next;
            last.next = cur.next;
            cur.next = slow.next;
            slow.next = cur;
        }

        ListNode left = head;
        ListNode right = slow.next;
        while (right != null){
            ans = Math.max(ans, left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return ans;
    }
}//end of Main
