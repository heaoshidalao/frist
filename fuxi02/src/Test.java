class Node1{    int val;

    public Node1(int val) {
        this.val = val;
    }

    Node1 next;

}
public class Test {
    public static void main(String [] args){
        Node1 a = new Node1(1);
        a.next = new Node1(1);
        Node1 c = null;
  //      int a1 =c.val;
        Node1 b =a;

        System.out.println(a);
        System.out.println(a.val);
        System.out.println(b);
        System.out.println(b.val);

        System.out.println(a.next);
        System.out.println(a.next.val);
       String a11 ="abc";
       String  a12 = new String("abc");
        System.out.println(a11==a12);
        System.out.println(a11);
        System.out.println(a11.equals(a12));

    }
}
