
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Test {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode  pre = null;
        ListNode nex = null; nex = head.next;
        while(head != null){

            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;


        }
        return pre;
    }
}

