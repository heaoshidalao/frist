// 给定两个 int 变量, 交换变量的值
// public class Test{
//     public static void main(String[] args){
//         int a=10;
//         int b=20;
//         int temp=0;
//         temp=b;
//         b=a;
//         a=temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }
//给定三个 int 变量, 求其中的最大值和最小值. 
public class Test{
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        if(a-b>0){
            if(a-c>0){
                 System.out.println(a);
            }
            else{
                 System.out.println(c);
            }
        }

        else{
            if(b-c>0){
                 System.out.println(b);
            }
            else{
                 System.out.println(c);
            }
        }
    }
}

