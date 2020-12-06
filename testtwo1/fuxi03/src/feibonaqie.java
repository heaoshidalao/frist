import java.util.Scanner;

public class feibonaqie {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(jiecheng(n));

    }
    public static int jiecheng(int x){
        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        else{
            return  jiecheng(x-2)+jiecheng(x-1);
        }
    }
}
