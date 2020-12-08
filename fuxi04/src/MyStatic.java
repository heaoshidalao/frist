public class MyStatic {

    static {
        System.out.println("静态代码块");
    } static void mymethed(){
        System.out.println("静态方法");
    }
    String name;
           public MyStatic (){
            System.out.println("gouzaofangfa");
    }
     void printname(){
        System.out.println("putongfasfa");
     }
     public static void main(String [] args){
         MyStatic.mymethed();
        MyStatic a1 = new MyStatic();
        a1.printname();
         MyStatic a2 = new MyStatic();
         a2.printname();
     }

    }
