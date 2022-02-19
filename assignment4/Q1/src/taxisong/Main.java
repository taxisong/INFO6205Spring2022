package taxisong;

public class Main {

//    ou are given two linked lists: list1 and list2 of sizes n and m respectively.
//
//    Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode MergeInBetweenLinkedLists(ListNode list1, int a, int b, ListNode list2){
        ListNode left = list1;
        ListNode right = list1;
        ListNode curr = list2;
        for (int i = 0; i < a - 1; i++){
            left = left.next;
        }
        for (int j = 0; j < b + 1; j++){
            right = right.next;
        }
        left.next = list2;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = right;
        return list1;
    }
}//end of Main
