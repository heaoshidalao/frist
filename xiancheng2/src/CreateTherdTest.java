public class CreateTherdTest {
    public static void main(String [] args){
        MyThread t = new MyThread("myname");

        t.run();
        //t.start();
        while(true){}
    }
}
class MyThread  extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
      //  System.out.println(Thread.currentThread().getName());
        while(true){}
    }
}