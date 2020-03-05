package test;

import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < ch.length; i++){
                if(ch[i] >= '0' && ch[i] <= '9')
                    sb.append(ch[i]);
                else sb.append('a');
            }
            String[] s = sb.toString().split("a");
            int max = 0;
            for(int i = 0; i < s.length; i++){
                if(s[i].length() > max) max = s[i].length();
            }
            for(int i = 0; i < s.length; i++){
                if(s[i].length() == max) System.out.print(s[i]);
            }
            System.out.println("," + max);
            /*String[] s = sc.next().split("");
            ArrayList<String> list = new ArrayList<>();
            int max = 0;
            int[] f = new int[s.length + 1];
            for(int i = 1; i < f.length; i++){
                if(s[i - 1].matches("[0-9]")) f[i] = f[i - 1] + 1;
                else f[i] = 0;
                if(f[i] > max) max = f[i];
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 1; i < f.length; i++){
                if(f[i] == max){
                    for(int j = i - max; j < i; j++)
                        sb.append(s[j]);
                }
            }
            System.out.println(sb + "," + max);*/
        }
        sc.close();
    }
}


