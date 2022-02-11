package taxisong;

public class Main {

//    You are given two non-empty linked lists representing two non-negative integers.
//    The digits are stored in reverse order,
//    and each of their nodes contains a single digit.
//    Add the two numbers and return the sum as a linked list.
//
//    You may assume the two numbers do not contain any leading zero,
//    except the number 0 itself.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static ListNode AddTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null){
            int n1 = l1 != null? l1.val : 0;
            int n2 = l2 != null? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null){
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }//wnd of AddTwoNumbers
}//end of Main
