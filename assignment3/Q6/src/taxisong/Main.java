package taxisong;

public class Main {

//    Given the head of a linked list,
//    remove the nth node from the end of the list and return its head.

    public static void main(String[] args) {
        // write your code here
    }//end of main

    public static ListNode RemoveNthNodeFromEndofList(ListNode head, int n) {
        ListNode ans = new ListNode(0, head);
        ListNode first = head;
        ListNode second = ans;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return ans.next;
    }
}