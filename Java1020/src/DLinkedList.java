class DLinkedNode  {
    public int val = 0;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;

    public DLinkedNode(int val) {
        this.val = val;
    }
}
public class DLinkedList {
    DLinkedNode head = null;

    public DLinkedList() {
        head = new DLinkedNode(-1);
        head.next = head;
        head.prev = head;
    }

    public void addFirst(int data) {
        DLinkedNode node = new DLinkedNode(data);
        DLinkedNode node1 = head.next;
        node.next = node1;
        node1.prev = node;
        head.next = node ;
        node.prev = head ;
    }
    public void addLast(int data){
        DLinkedNode node = new DLinkedNode(data);
        DLinkedNode node1 = head.prev;
        node1.next = node ;
        node.prev = node1;
        head.prev = node;
        node.next = head;

    }
    public void addIndex(int index, int data) {
        int size = size();
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            // 头插
            addFirst(data);
            return;
        }
        if (index == size) {
            // 尾插
            addLast(data);
            return;
        }
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;

        DLinkedNode newNode = new DLinkedNode(data);
        prev.next = newNode;
        newNode.prev = prev;

        next.prev = newNode;
        newNode.next = next;
    }
    public void removeAll(int key) {
        while (true) {
        DLinkedNode toRemove = find(key);
        if (toRemove == null) {
            return;
        }
        DLinkedNode prev = toRemove.prev;
        DLinkedNode next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }
}
    public void remove(int key) {
        DLinkedNode toRemove = find(key);
        if (toRemove == null) {
            return;
        }
        DLinkedNode prev = toRemove.prev;
        DLinkedNode next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }
    public DLinkedNode getPos(int index) {
        // 找到下标为 index 对应的节点
        DLinkedNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public boolean contains(int toFind) {
        for (DLinkedNode cur = head.next;
         cur != head; cur = cur.next) {
        if (cur.val == toFind) {
            return true;
        }
      }
    return false;
}
    public void display() {
        System.out.print("[");
        for (DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            System.out.print(cur.val);

            if (cur.next != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("反向[");
        for (DLinkedNode cur = head.prev; cur != head; cur = cur.prev) {
            System.out.print(cur.val);

            if (cur.prev != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }
    public DLinkedNode find(int key) {
        for (DLinkedNode cur = head.next;
             cur != head; cur = cur.next) {
            if (cur.val == key) {
                return cur;
            }
        }
        return null;
    }
   public  int size (DLinkedNode head){
        int size =0;
        for(DLinkedNode cur = head.next;cur != null;cur = cur.next){
          size++;
        }
       System.out.println(size);
        return size;
   }
}
