package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumber(l1, l2).val);
        System.out.println(addTwoNumber(l1, l2).next.val);
        System.out.println(addTwoNumber(l1, l2).next.next.val);
    }//end of main

    public static ListNode addTwoNumber(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(l1 != null || l2 != null){
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;;
            int sum = n1 + n2 + carry;
            if (head == null)  head = tail = new ListNode(sum % 10);
            else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) tail.next = new ListNode(carry);
        return head;
    }
}//end of Main
