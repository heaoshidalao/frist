 import java.util.Scanner;
  public class Test{
    // //1. 实现代码: 求斐波那契数列的第 N 项    
    //  public static void main(String[] args) {
    //     Scanner scanner =new Scanner(System.in);
    //     System.out.println("请输入第N列：");
    //     int n =scanner.nextInt();
    //     int ret =Fibonacci(n);
    //     System.out.println("第n项为"+ret);
    //     scanner.close();
    // }
    // public static int Fibonacci(int n){
    //     if(n==1){
    //         return n=1;
    //     }
    //     else if(n==2){
    //         return n=1;
    //     }
    //     else 
    //     return Fibonacci(n-1)+Fibonacci(n-2);
    // }
//     2. 实现代码: 求解汉诺塔问题(提示, 使用递归) 

// 汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower），又称河内塔，源于印度一个古老传说。 

// 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。 

// 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。 

// 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。 

// 问应该如何操作？ 
    // static long count;
    // static void hanoi(int n,char a,char b,char c)
    // {
    // if(n==1)
    // {
    // System.out.printf("第%d次移动：\n 圆盘从%c棒移动到%c棒\n",++count,a,c);
    // }
    // else
    // {
    // hanoi(n-1,a,c,b);
    // System.out.printf("第%d次移动：\n 圆盘从%c棒移动到%c棒\n",++count,a,c);
    // hanoi(n-1,b,a,c);
    // }
    // }
    // public static void main(String[] args)
    // {
    // int n;
    // count=0;
    // System.out.print("请输入数量：");
    // Scanner scanner=new Scanner(System.in);
    // n=scanner.nextInt();
    // hanoi(n,'A','B','C');
    // System.out.printf("总共需要%d步移动",count);
    // scanner.close();
    // }
    //8. 实现代码: 青蛙跳台阶问题(提示, 使用递归) 
    //一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法 
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入n值：" );
        int num=scanner.nextInt();
        int ret=numWays(num);
      System.out.println("总共有"+ret+"方法");
      scanner.close();
    }
     public static int numWays(int n){
         if(n==1){
             return 1;
         }
         else if(n==2){
             return 2;
         }
         else{
             return numWays(n-1)+numWays(n-2);
         }
     }
}



