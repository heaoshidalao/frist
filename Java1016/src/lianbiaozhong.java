///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode nodeA =  headA;
//        ListNode nodeB = headB;
//        int sizeA = size(headA);
//        int sizeB = size(headB);
//        int num =0 ;
//        if(sizeA > sizeB){
//            num =sizeA-sizeB;
//            int i = 0;
//            for(i = 0;i <num; i++){
//                nodeA = nodeA.next;
//            }
//        }
//        else{
//            num =sizeB-sizeA;
//            int i = 0;
//            for(i = 0;i <num; i++){
//                nodeB = nodeB.next;
//            }
//        }
//        while(nodeA != nodeB){
//            nodeA = nodeA.next ;
//            nodeB = nodeB.next;
//        }
//        return nodeA;
//
//    }
//    public int size(ListNode head){
//        int number = 0;
//        for(ListNode cur = head;cur!=null;cur =cur.next){
//            number++;
//        }
//        return number;
//    }
//}
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        if(head == null){
//            return false;
//        }
//
//
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast!= null&&fast.next != null){
//            fast =fast.next.next;
//            slow =slow.next;
//            if(fast == slow){
//                return true;
//            }
//
//        }
//        return false;
//    }
//}
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if(head == null){
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast!=null&&fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                break;
//            }
//        }
//        if(fast == null || fast.next == null){
//            return null;
//        }
//        ListNode newHead = head;
//        ListNode node = fast;
//        while(node!=newHead){
//            node =node.next;
//            newHead = newHead.next;
//        }
//        return node;
//    }
//}
public class lianbiaozhong {

}
