import java.util.Scanner;
import java.util.Random;

// //1. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。 
// public class Test{
//     public static void main(String[] args){
//         int i=0;
//         int count=0;
//         for(i=1;i<101;i++){
//             if(i%10==9){
//                count++;
//             }
//             if(i/10==9){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// //2. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。) 
// public class Test{
//     public static void main(String[] args){
//         int i=0;
//         for(i=100;i<1000;i++){
//             int a=i%10;
//             int b=i/10%10;
//             int c=i/100;
//             if(i==a*a*a+b*b*b+c*c*c){
//                 System.out.println(i);
//             }
//         }
//     }
// }
//3. 编写代码模拟三次密码输入的场景。 
//最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 
//可以重新输入，最多输入三次。三次均错，则提示退出程序 
// public class Test{
//     public static void main(String[] args){
//         int i=0;
//         Scanner sc = new Scanner(System.in);
//         while(i<3){
//         System.out.println("请输入一个6位数密码：");
//            int miMa=sc.nextInt();
//            int mima=123456;
//             if(miMa==mima){

//                 System.out.println("密码输入正确");
//                 return;
//             }
//             else{
//                 System.out.println("密码输入错误,请重新输入");
//             }
//             i++;
//         }
//         sc.close();
//         if(i==3){
//         System.out.println("三次密码都输入错误，请重启");
//         }
//     }
// }
// // 4. 写一个函数返回参数二进制中 1 的个数 
// // 比如： 15 0000 1111 4 个 1 
// public class Test{
//     public static void main(String[] args){
//         int a = 15;
//         int count = 0;
//         while(a!=0){
//             if(a%2==1){
//                 count = count+1;
//             }
//             a=a/2;
//         }
//         System.out.println(count);
//     }
// }
// // 5. 获取一个数二进制序列中所有的偶数位和奇数位， 
// //分别输出二进制序列。
// public class Test {
//     public static void main(String[] args){
//         int a = 7;
//         int i = 0;
//         int b = 0;
//         int c = a;
//         for(i=0;i<16;i++){
//             b = a%2;
//             a=a/2/2;
//             System.out.print(b);
//         }
//          System.out.println("\n");
//         for(i=0;i<16;i++){
//             c=c/2;
//             b=c%2;
//             c=c/2;
//             System.out.print(b);
//         }
//     }
// } 
// //6. 输出一个整数的每一位. 
// public class Test{
//     public static void main(String[] args){
//         int a = 123;
//         int c = 0;
//         while(a!=0){
//             c = a%10;
//             System.out.print(c+"   ");
//             a=a/10;
//         }
//     }
// }
//7. 完成猜数字游戏 
public class Test{
    public static void main(String[] args){
        Random random =new Random();
        Scanner scanner =new Scanner(System.in);
        int guess =random.nextInt(100);
        while(true){
            System.out.println("请输入你要输入的数字：(1-100)");
            int num =scanner.nextInt();
            if(num>guess){
                System.out.println("猜大了");
            }
            else if(num<guess){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜中了");
                break;
            }
        }
        scanner.close();
    }
}