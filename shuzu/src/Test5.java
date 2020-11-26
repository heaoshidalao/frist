import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(num(n));
    }
    public static int num (int n){
        if(n>100){
            return -1;
        }

            for(int j = 0;j<17;j++){
            for(int i = 0;i<13;i++){
                if((i*8+j*6)==n){
                    return i+j;
                }
            }
        }
        return -1;
    }

}
