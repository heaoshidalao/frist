import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String b = in.nextLine();
        printA(s,b);
    }
    public static void printA(String s,String b){
        char [] arr = s.toCharArray();
        char[]  brr = b.toCharArray();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<brr.length;j++){
                if(arr[i] == brr[j]){
                    arr[i] = '0';
                }
            }
        }
        StringBuilder  newS = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
           if(arr[i]!='0'){
               newS.append(arr[i]);
           }
        }
        System.out.print(newS);

    }
}
//    They are students.
//        aeiou