package taxisong;

public class Main {

//    A critical point in a linked list is defined as either a local maxima or a local minima.
//
//    A node is a local maxima if the current node has a value strictly
//    greater than the previous node and the next node.
//
//    A node is a local minima if the current node has a value strictly
//    smaller than the previous node and the next node.
//
//    Note that a node can only be a local maxima/minima
//    if there exists both a previous node and a next node.
//
//    Given a linked list head,
//    return an array of length 2 containing [minDistance, maxDistance]
//    where minDistance is the minimum distance between any two distinct critical points
//    and maxDistance is the maximum distance between any two distinct critical points.
//    If there are fewer than two critical points, return [-1, -1].

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static int[] FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints(ListNode head){
        int minDistance = -1, maxDistance = -1;
        int first = -1, last = -1, pos = 0;
        ListNode cur = head;
        while (cur.next.next != null){
            int x = cur.val;
            int y = cur.next.val;
            int z = cur.next.next.val;
            if (y > Math.max(x,z) || y < Math.min(x,z)){
                if (last != -1){
                    minDistance = minDistance == -1 ? pos - last : Math.min(minDistance, pos - last);
                    maxDistance = Math.max(maxDistance, pos - first);
                }
                if (first == -1){
                    first = pos;
                }
                last = pos;
            }
            cur = cur.next;
            pos++;
        }
        int[] ans = {minDistance, maxDistance};
        return ans;
    }//end of FindtheMinimumandMaximumNumberofNodesBetweenCriticalPoints
}//end of Main
