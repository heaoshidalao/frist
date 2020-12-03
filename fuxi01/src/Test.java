import java.util.Scanner;
public class Test {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int z =in.nextInt();
        int n =5;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print(z);
                //System.out.print(" ");
            }
            System.out.println("");
        }
    }
}