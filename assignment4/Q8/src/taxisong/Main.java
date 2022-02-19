package taxisong;

public class Main {

//    Given the head of a singly linked list and an integer k,
//    split the linked list into k consecutive linked list parts.
//
//    The length of each part should be as equal as possible:
//    no two parts should have a size differing by more than one.
//    This may lead to some parts being null.
//
//    The parts should be in the order of occurrence in the input list,
//    and parts occurring earlier should always have a size greater than or equal to parts occurring later.
//
//    Return an array of the k parts.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode[] SplitLinkedListinParts(ListNode head, int k){
        ListNode[] ans = new ListNode[k];
        int len = 0;
        ListNode cur = head;
        while (cur != null){
            len++;
            cur = cur.next;
        }
        int quotient = len / k, remainder = len % k;
        ListNode temp = head;
        for (int i = 0 ; i < k && temp != null; i++){
            ans[i] = temp;
            int Size = quotient + (i < remainder ? 1 : 0);
            for (int j = 1; j < Size; j++){
                temp = temp.next;
            }
            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }
        return ans;
    }
}//end of Main
