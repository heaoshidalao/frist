public class Test0909{
    // //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
    // public static void main(String[] args){
    //     int a=47;
    //     if(a-18<=0){
    //         System.out.println("是少年");
    //     }
    //      else if(a>18&&a<=28){
    //         System.out.println("是青年");
    //     }
    //      else if(a>28&&a<=55){
    //         System.out.println("是中年");
    //     }
    //     else if(a>55){
    //         System.out.println("是老年");
    //     }
    // }
    // //2. 判定一个数字是否是素数 
    // public static void main(String[] args){
    //     int num = 43;
    //     int i = 0;
    //     for(i=2;i<num;i++){
    //         if(num%i==0){
    //             System.out.println(num+"是素数");
    //             break;
    //         }
    //     }
    //     if(i==num){
    //     System.out.println(num+"不是素数");
    //     }
    // }
    // //3. 打印 1 - 100 之间所有的素数 
    // public static void main(String[] args){
    //     int i=0; 
    //     for(i=1;i<=100;i++){
    //        int j=0;
    //        for(j=2;j<i;j++){
    //            if(i%j==0){
    //                System.out.print(i+" ");
    //                break;
    //            }
    //        }
           
    //     }
    // }
    // //4. 输出 1000 - 2000 之间所有的闰年 
    // public static void main(String[] args){
    //     int i=0;
    //     for(i=1000;i<=2000;i++){
    //         if(i%100==0){
    //             if(i%400==0){
    //                 System.out.print(i+" ");
    //             }
    //         }
    //         else if(i%4==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }
//     //5. 输出乘法口诀表 
//     public static void main (String[] args){
//         int i=0;
//         int j=0;
//         int num=0;
//         for(i=1;i<=9;i++){
//             for(j=1;j<=i;j++){
//                 num=i*j;
//                 System.out.printf("%d * %d = %d ",i,j,num);
//             }
//             System.out.printf("\n");
//         }
//     }
// //6. 求两个正整数的最大公约数
//         public static void main(String[] args){
//             int a=16;
//             int b=36;
// 		int d = a*b;
// 		for(int c = 0;;){//存放余数
// 			if(a>b){
// 				if(a%b==0){
// 					System.out.println("最大公约数为："+b);
// 					break;
// 				}
// 				c = a%b;
// 				a = c;
				
// 			}else if(a<b){
// 				if(b%a==0){
// 					System.out.println("最大公约数为："+a);
// 					break;
// 				}
// 				c = b%a;
// 				b = c;				
// 			}	
//         }
//     } 
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
    public static void main(String[] args){
        double i=0;
        double a=0;
        double b=0;
        double sum=0;
        for(i=1;i<=100;i++){
            if(i%2==1){
                a=a+(1/i);
            }
            else {
                b=b+(1/i);
            }
        }
        sum=a-b;
        System.out.println(sum);
    }
 }