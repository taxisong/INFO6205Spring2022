package taxisong;

public class Main {

//    You are given the head of a linked list.
//
//    The nodes in the linked list are sequentially assigned to non-empty groups
//    whose lengths form the sequence of the natural numbers (1, 2, 3, 4, ...).
//    The length of a group is the number of nodes assigned to it. In other words,
//
//    The 1st node is assigned to the first group.
//    The 2nd and the 3rd nodes are assigned to the second group.
//    The 4th, 5th, and 6th nodes are assigned to the third group, and so on.
//    Note that the length of the last group may be less than or equal to 1 + the length of the second to last group.
//
//    Reverse the nodes in each group with an even length,
//    and return the head of the modified linked list.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode ReverseNodesinEvenLengthGroups(ListNode head){
        ListNode preHead = new ListNode(0, head);
        ListNode cur = head;
        int flag = 0;
        for (int j = 1; flag == 0; j++){
            int cnt = 0;
            ListNode reverseHead = preHead;
            ListNode reverseTail = null;
            while (cur != null && cnt < j){
                reverseTail = cur;
                preHead = preHead.next;
                cur = cur.next;
                cnt++;
                if (cur == null){
                    flag = 1;
                }
            }
            if (cnt % 2 == 0){
                preHead = reverse(reverseHead, reverseTail);
            }
        }
        return head;
    }//end of ReverseNodesinEvenLengthGroups

    public static ListNode reverse(ListNode preHead, ListNode tail){
        ListNode head = preHead.next;
        ListNode temp = head;
        while (temp != tail){
            ListNode cur = temp;
            temp = temp.next;
            cur.next = tail.next;
            tail.next = cur;
        }
        preHead.next = tail;
        return head;
    }
}//end of Main
