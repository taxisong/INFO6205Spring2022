package taxisong;

public class Main {

//    Given the head of a singly linked list
//    and two integers left and right where left <= right,
//    reverse the nodes of the list from position left to position right,
//    and return the reversed list.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode ReverseLinkedListII(ListNode head, int left, int right){
        if (head == null || head.next == null || left == right){
            return head;
        }
        ListNode preHead = new ListNode(0, head);
        ListNode ans = preHead;
        ListNode tail = head;
        for (int i = 0; i < left - 1; i++){
            preHead = preHead.next;
        }
        for (int j = 1; j < right; j++){
            tail = tail.next;
        }
        ListNode temp = preHead.next;
        while (temp != tail){
            ListNode cur = temp;
            temp = temp.next;
            cur.next = tail.next;
            tail.next = cur;
        }
        preHead.next = tail;
        return ans.next;
    }
}//end of Main
