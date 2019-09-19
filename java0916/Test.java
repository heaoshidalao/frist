import java.util.Scanner;
public class Test{
    // //2. 实现代码: 递归求 N 的阶乘 
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("请输入数字：");
    //     int num=scanner.nextInt();
    //     int ret =jieChen(num);
    //     System.out.println(num+"的阶乘是"+ret); 
    //     scanner.close();
    // }
    // public static int jieChen( int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return n*jieChen(n-1);
    //     }
    // }
    // //3. 实现代码: 递归求 1 + 2 + 3 + ... + 10
    // public static void main(String[] args) {
    //     int n = 10;
    //     int ret = numberSum(n);
    //     System.out.println("和为"+ret);
    // }
    // public static int numberSum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return n+numberSum(n-1);
    //     }
    // }
    // //4. 实现代码: 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) 
    // public static void main(String[] args) {
    //     int n=1234;
    //     printnum(n);
    // } 
    // public static void printnum( int n){
    //     if(n>9){
    //        printnum(n/10);
    //     }
    //         n=n%10;
    //         System.out.print(n+" ");
    // }
    // 5. 实现代码: 写一个递归方法，输入一个非负整数，返回组成它的数字之和. 
    public static void main(String[] args) {
        int num=1314;
        int ret=sumNum(num);
        System.out.println(ret);
    }
    public static int sumNum(int n){
        if(n<10){
                   return n;
                }
        else{
            return (n%10)+sumNum(n/10);
        }
    }
}