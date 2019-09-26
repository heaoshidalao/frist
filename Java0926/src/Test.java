//- 编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算.
//        - 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
//        - 实现交换两个变量的值。要求：需要交换实参的值。
//public class Test {
//    public static void main(String [] args){
//        cacl newcacl =new cacl();
//        System.out.println("num1+num2="+newcacl.Add(2.0,3.0));
//        System.out.println("num1+num2="+newcacl.Sub(2.0,3.0));
//        System.out.println("num1+num2="+newcacl.Mul(2.0,3.0));
//        System.out.println("num1+num2="+newcacl.Div(2.0,3.0));
//        System.out.println("num1+num2="+newcacl.Div(2.0,0));
//    }
//}
import java.util.Arrays;
public class Test{
 public static void main(String[] args){
     int[] arr={10,20};
     swap(arr);
     System.out.println(Arrays.toString(arr));
 }
    public  static void swap(int[] arr){
     int temp=arr[0];
     arr[0]=arr[1];
     arr[1]=temp;
    }
}