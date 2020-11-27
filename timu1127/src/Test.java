import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printNum(n));
//        System.out.println(printNum(3));
//        System.out.println(printNum(10));
//        System.out.println(printNum(81));
//        System.out.println(printNum(0));
    }
    public static int printNum(int n){
        int count = 0;
        if(n <2){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        while(n>=3){
            count = count+n/3;
            n = n/3+n%3;
        }
        if(n==2){
            count++;
        }
        return count;
    }
}
