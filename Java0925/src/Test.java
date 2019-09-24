//实现顺序表代码
public class Test {
    public static void main(String [] args){
        table list = new table();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.add(5,6);
        list.add(6,7);
        list.add(7,8);
        list.add(4,9);
        list.display();
        System.out.println(list.contains(8));
        System.out.println(list.contains(1));
        System.out.println(list.search(8));
        System.out.println(list.search(1));
        System.out.println(list.getPos(4));
        list.setPos(8,10);
        list.display();
        list.remove(9);
        list.display();
        System.out.println(list.Size());
        list.clear();
        list.display();
    }
}
