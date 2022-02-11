package taxisong;

public class Main {

//    Given the head of a sorted linked list,
//    delete all nodes that have duplicate numbers,
//    leaving only distinct numbers from the original list.
//    Return the linked list sorted as well.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode RemoveDuplicatesfromSortedListII(ListNode head){
        if (head == null){
            return null;
        }
        ListNode ans = new ListNode(0, head);
        ListNode temp = ans;
        while (temp.next != null && temp.next.next != null){
            if (temp.next.val == temp.next.next.val){
                int x = temp.next.val;
                while (temp.next != null && temp.next.val == x){
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        return ans.next;
    }
}//end of Main
