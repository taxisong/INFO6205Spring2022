package taxisong;

import java.util.HashSet;
import java.util.Set;

public class Main {

//    You are given the head of a linked list
//    containing unique integer values and an integer array nums
//    that is a subset of the linked list values.
//
//    Return the number of connected components in nums
//    where two values are connected if they appear consecutively in the linked list.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int LinkedListComponents(ListNode head, int[] nums){
        int ans = 0;
        Set<Integer> Gset = new HashSet<>();
        for (int num : nums){
            Gset.add(num);
        }
        ListNode cur = head;
        while (cur != null){
            if (Gset.contains(cur.val) && (cur.next == null || !Gset.contains(cur.next.val))){
                ans++;
            }
            cur = cur.next;
        }
        return ans;
    }
}//end of Main
