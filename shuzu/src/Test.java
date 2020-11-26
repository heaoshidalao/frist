import java.util.Scanner;

public class Test{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        maxPrint(a,b,c);
    }
    public static void maxPrint(int a,int b,int c){
       int [] arr=new int [3];
       arr[0]= a;
       arr[1]= b;
       arr[2] = c;
       for(int i = 0;i<3;i++){
           for(int j =0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       int max = (arr[0]+arr[1])*arr[2];
       System.out.print("("+arr[0]+"+");
        System.out.print(arr[1]+")"+"*");
        System.out.print(arr[2]+"=");
        System.out.println(max);

    }
}
