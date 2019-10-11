//实现链表以下操作
//        1. 删除链表中指定的所有元素
//        2. 反转一个单链表
//        3. 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
//        4. 输入一个链表，输出该链表中倒数第k个结点
//        5. 将两个有序链表合并为一个新的有序链表并返回
//
//        尝试使用在线 OJ 完成代码(OJ链接参考课件)
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        if(head == null){
//            return null;
//        }
//        ListNode prev = head;
//        ListNode node = head.next;
//
//        while(node != null){
//            if(node.val == val){
//                prev.next = node.next;
//                node = prev.next;
//            }
//            else{
//                prev = node;
//                node = node.next;
//            }
//        }
//        if(head.val == val){
//            head = head.next;
//        }
//        return head;
//    }
//}
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if(head == null){
//            return null;
//        }
//        if(head.next == null ){
//            return head;
//        }
//        ListNode prev = head;
//        ListNode node = head.next;
//        while(node != null){
//            ListNode temp = null;
//            temp = node.next;
//            node.next = prev;
//            prev = node;
//            node = temp;
//
//        }
//        head.next = null;
//        return prev;
//    }
//}
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        if(head ==null){
//            return null;}
//        if(head.next == null){
//            return head;
//        }
////         ListNode node1 = head;
////         ListNode node2 = head;
////         while(node2 != null&&node2.next != null){
////             node1 =node1.next;
////             node2=node2.next.next;
//
////         }
////         return node1;
//        ListNode newNode = head;
//        int midlle =size(head)/2;
//        for(int i =0;i<midlle;i++){
//            newNode = newNode.next;
//        }
//        return newNode;
//    }
//    public int size(ListNode head){
//        int size =0;
//        for(ListNode cur = head ;cur != null ;cur = cur.next){
//            size++;
//        }
//        return size;
//    }
//}
///*
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}*/
//public class Solution {
//    public ListNode FindKthToTail(ListNode head,int k) {
//        if(head == null){
//            return null;
//        }
//        int number = size(head);
//        if(number<k){
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        for(int i =0; i<k;i++){
//            fast=fast.next;
//        }
//        while(fast != null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//    public int size(ListNode head){
//        int size = 0;
//        for(ListNode cur = head;cur != null;cur = cur.next){
//            size++;
//        }
//        return size;
//    }
//}
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        ListNode cur1 = l1;
//        ListNode cur2 = l2;
//        ListNode newHead = null;
//        ListNode newTail = null;
//        while (cur1 != null && cur2 != null) {
//            if (cur1.val < cur2.val) {
//                if (newHead == null) {
//                    newHead = cur1;
//                    newTail = cur1;
//                    cur1 = cur1.next;
//                } else {
//                    newTail.next = cur1;
//                    newTail = newTail.next;
//                    cur1 = cur1.next;
//                }
//            } else {
//                if (newHead == null) {
//                    newHead = cur2;
//                    newTail = cur2;
//                    cur2 = cur2.next;
//                } else {
//                    newTail.next = cur2;
//                    newTail = newTail.next;
//                    cur2 = cur2.next;
//                }
//            }
//        }
//        if (cur1 == null){
//            newTail.next = cur2;
//        } else {
//            newTail.next = cur1;
//        }
//        return newHead;
//    }
//}
public class lianbiaoXiTi {
}
