//输入一个链表，输出该链表中倒数第k个结点。
 class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}
public class offer14 {

        public ListNode FindKthToTail(ListNode head,int k) {
            if(head == null){
                return null;
            }
            int length = 0;
            for(ListNode cur = head ; cur!=null;cur =cur.next){
                length++;
            }
            ListNode fastNode = head;
            ListNode slowNode = head;
            if(k>length){
                return null;
            }
            for(int i = 0;i<k;i++){
                fastNode = fastNode.next;
            }
            while(fastNode!=null){
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }
            return slowNode;
        }
    }

