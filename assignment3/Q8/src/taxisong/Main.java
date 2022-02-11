package taxisong;

public class Main {

//    Given a Circular Linked List node, which is sorted in ascending order,
//    write a function to insert a value insertVal into the list such that it remains a sorted circular list.
//    The given node can be a reference to any single node in the list and may not necessarily be the smallest value in the circular list.
//
//    If there are multiple suitable places for insertion,
//    you may choose any place to insert the new value.
//    After the insertion, the circular list should remain sorted.
//
//    If the list is empty (i.e., the given node is null),
//    you should create a new single circular list and return the reference to that single node.
//    Otherwise, you should return the originally given node.

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static Node InsertintoaSortedCircularLinkedList(Node head, int insertVal){
        if (head == null){
            Node ans = new Node(insertVal);
            ans.next = ans;
            return ans;
        }
        Node cur = head;
        while (true){
            if (cur.val < cur.next.val){
                if (cur.val <= insertVal && insertVal <= cur.next.val){
                    cur.next = new Node(insertVal, cur.next);
                    break;
                }
            } else if (cur.val > cur.next.val){
                if (cur.val <= insertVal || insertVal <= cur.next.val){
                    cur.next = new Node(insertVal, cur.next);
                    break;
                }
            } else {
                if (cur.next == head){
                    cur.next = new Node(insertVal, cur.next);
                    break;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}//end of Main
