package taxisong;

public class Main {

//    Given the head of a linked list, return the list after sorting it in ascending order.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode sortList(ListNode head) {
        return SortList(head, null);
    }//end of SortList
    public static ListNode SortList(ListNode head, ListNode tail){
        if (head == null){
            return head;
        }//nothing
        if (head.next == tail){
            head.next = null;
            return head;
        }//only one val
        ListNode slow = head, fast = head;
        while (fast != tail){
            slow = slow.next;
            fast = fast.next;
            if (fast != tail){
                fast = fast.next;
            }
        }//end of while loop
        //find the midel of the ListNode
        ListNode mid = slow;
        ListNode list1 = SortList(head, mid);//midel of the first half
        ListNode list2 = SortList(mid, tail);//midel of the second half
        ListNode sorted = merge(list1, list2);
        return sorted;
    }//end of SortList(,)
    public static ListNode merge(ListNode haed1, ListNode head2){
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = haed1, temp2 = head2;
        while (temp1 != null && temp2 != null){
            if (temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }//end of while loop
        if (temp1 != null){
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }
        return dummyHead.next;//???why not temp??
    }//end of merge
}//end of Main
