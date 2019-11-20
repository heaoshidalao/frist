package Queue;
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size = 0 ;
    //1.入队列
    public void offer(int x){
        Node cur = new Node(x);
        if(head == null){
            head = cur ;
            tail = cur ;
            size ++ ;
            return ;
        }
        tail.next = cur ;
        tail = tail.next ;
        size ++ ;
    }
    //2出队列
    public Integer poll(){
        if(head == null){
            return null;
        }
        Integer ret = head.val ;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -- ;
        return ret ;
    }
    //3取队首元素
    public Integer peek(){
        if(head == null){
            return null;
        }
        Integer ret = head.val;
        return ret ;
    }
    //4判断队列为空
    public boolean isEmpty(){
        return  head == null;
    }
    //5. 去队列中元素个数
    public int size (){
        return size ;
    }
    public static void main(String [] args){
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(5);
        myQueue.offer(6);
        myQueue.offer(7);
        myQueue.offer(8);
        while (!myQueue.isEmpty()) {
            int curFront = myQueue.peek();
            System.out.println(curFront);
            myQueue.poll();
        }
    }
}
