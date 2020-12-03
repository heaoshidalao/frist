public class Test1 {
    public static void main(String [] args){
        MyLinkedList A = new MyLinkedList();
        String b = "we";
        A.add(b);
        A.add("c");
        A.add(1,"b");

       System.out.println(A.size());
        System.out.println(A.get(0));
        System.out.println(A.get(1));
        System.out.println(A.get(2));


    }
}
