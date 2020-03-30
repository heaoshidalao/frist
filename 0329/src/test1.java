import java.util.Scanner;
public class test1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = in.nextInt();
            if(a<=0 ||a>=40000){
                return ;
            }
            int m = a*a;
            int sum1 = 0;
            int sum2 = 0;
            while(a>0){
                sum1+=a%10;
                a=a/10;
            }
            while(m>0){
                sum2+=m%10;
                m/=10;
            }
            System.out.println(sum1 +" "+sum2);
        }
    }
}
