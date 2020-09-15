package xiaomi;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();

        System.out.println(remove(str));

    }
    public static String remove(String str){
        if(str == null){
            return str;
        }
        StringBuffer s = new StringBuffer();
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            int first = str.indexOf(c);
            int last = str.lastIndexOf(c);
            if(last == first ||first == i){
                s.append(c);
            }
        }
        return s.toString();
    }
}
