import java.util.Scanner;

public class njiexheng {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(jiecheng(n));

    }
    public static int jiecheng(int x){
        if(x == 1){
            return 1;
        }
        else{
            return  x*jiecheng(x-1);
        }
    }
}
