import java.util.Scanner;

public class Test1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int n = a+1;
//        for(int i = 0;i<a+1;i++){
//            for(int j = 0;j<a-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<i+1;j++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for(int i = 0;i<a;i++){
//           for(int j = 0;j<i+1;j++){
//               System.out.print(" ");
//           }
//           for(int j = a-i;j>0;j--){
//               System.out.print("*");
//               System.out.print(" ");
//           }
//            System.out.println();
//        }
        int n =in.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");

            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =0;i<n+1;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
