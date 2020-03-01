
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int[] arr = new int[100];
        int i = 0;
        for (i = 0; arr[i] <= 1000000; i++) {
            if (i == 0) {
                arr[0] = 0;
            } else if (i == 1) {
                arr[1] = 1;
            } else if (i == 2) {
                arr[2] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int j = 0;
            while (arr[j] <= num) {
                if (arr[j] == num) {
                    int c = 0;
                    System.out.println(c);
                }
                j++;
            }
            int a = arr[j] - num;
            int b = num - arr[j - 1];
            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
//    public static void F(int [] arr){
//        int i =0;
//        for(i=0;arr[i]<=1000000;i++){
//            if(i == 0){
//                arr[0] =0;
//            }
//            else if(i == 1){
//                arr[1] =1;
//            }
//            else {
//                arr[i]= arr[i-1]+arr[i-2];
//            }
//
//        }
//    }

    }
    INSERT INTO exam_result (id,name, chinese, math, english) VALUES (1,'唐三藏', 67, 98, 56),(2,'孙悟空', 87.5, 78, 77),(3,'猪悟能', 88, 98.5, 90),(4,'曹孟德', 82, 84, 67),(5,'刘玄德', 55.5, 85, 45),(6,'孙权', 70, 73, 78.5),(7,'宋公明', 75, 65, 30);
