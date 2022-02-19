package taxisong;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    List<Integer> list;
    Random random;

    public Solution(ListNode head){
        list = new ArrayList<Integer>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        random = new Random();
    }
    public int getRandom(){
        return list.get(random.nextInt(list.size()));
    }
}
