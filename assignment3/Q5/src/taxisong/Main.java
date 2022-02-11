package taxisong;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Given the head of a singly linked list, return true if it is a palindrome.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static boolean PalindromeLinkedList(ListNode head){
        List<Integer> list = new ArrayList<Integer>();
        ListNode node = head;
        while (node != null){
            list.add(node.val);
            node = node.next;
        }
        int front = 0, back = list.size() - 1;
        while (front < back){
            if (!list.get(front).equals(list.get(back))){
                return false;
            }
            front++;back--;
        }
        return true;
    }
}//end of Main
