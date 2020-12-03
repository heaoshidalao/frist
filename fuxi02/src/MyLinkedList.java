public class MyLinkedList {
    private Node head;
    private Node last;
    private  int size;

    public boolean add(String e){
        Node node = new Node(e);
         if(head == null ){
             head = node;
             last = node;
         }
         else{
             node.prev = last;
             last.next = node;//让尾节点指向NOde
             last = node;//更新尾节点；
         }
         size++;
         return true;
    }
    public void add(int index,String e){
        if(index<0||index>size()){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        Node node = new Node(e);


        if(head == null){
            head = node;
            last = node;

        }else if(index == 0){
               node.next =head;
               head.prev = node;
               head = node;
        }else if(index == size()){
            node.prev = last;
            last.next = node;//让尾节点指向NOde
            last = node;//更新尾节点；
        }else{
            Node prev = getPreviousByIndex(index);
            Node next = prev.next;
            node.prev = prev;
            node.next = next;
            prev.next = node;
            next.prev = node;
        }
        size++;
    }

    private Node getPreviousByIndex(int index) {
        Node prev = head;
        for(int i = 0;i<index-1;i++){
              prev = prev.next;
        }
        return prev;
    }

    public String remove(int index){
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        String v =null;
        if(size() == 1){
            v = head.val;
           head = last = null;
        }else if(index == 0){
            v = head.val;
             head = head.next;
             head.prev = null;

        }
        else if(index == size()-1){
            v = last.val;
             last = last.prev;
             last.next =null;

        }else {

            Node prev = getPreviousByIndex(index);
            v = prev.next.val;
            Node next = prev.next.next;
            prev.next = next;
            next.prev = prev;
        }
         return v;

    }
    public boolean remove (String e){
        Node current = head;
        while(current!=null){
            if(current.val.equals(e)){
                Node prev = current.prev;
                Node next = current.next;
              if(prev!=null){ prev.next = next;}
              else{
                  head = head.next;
              }
               if(next!=null){  next.prev = prev;}
               else{
                  last = last.prev;
               }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int size(){

        return size;
    }
    public String get(int index){
        if(index<0||index>=size()){
            throw new IndexOutOfBoundsException("下标越界"+index);
        }
        Node node =head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node.val;
    }

}
