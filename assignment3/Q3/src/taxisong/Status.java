package taxisong;

public class Status implements Comparable<Status>{
    @Override
    public int compareTo(Status status2) {
        return this.val - status2.val;
    }
    int val;
    ListNode ptr;

    Status(int val, ListNode ptr) {
        this.val = val;
        this.ptr = ptr;
    }
}
