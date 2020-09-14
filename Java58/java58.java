package Java58;
import java.util.Scanner;
public class java58 {


        public static int [] outArray = new int [26];
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            sortString(s);
            printArray(outArray);


        }
        public static void sortString(String s){
            char temp ;
            for(int i = 0;i<s.length();i++){
                temp = s.charAt(i);
                outArray[temp-'A']++;
            }
        }
        public static void printArray(int[] arr){
            for(int i = 0;i<arr.length;i++){
                if(arr[i]!= 0) {
                    char c = (char) ('A' + i);
                    System.out.print("" + c + "=" + arr[i] + "");
                }
            }
        }


}
