import java.lang.Exception;
public class Test2 {
    public static void main(String [] args) throws Exception {
        System.out.println(fun(21));
      int b = 2^100;
        System.out.println(b);
      int c = b/7;
        System.out.println(c);
        String  str1 ="hello";
        String str2 = "he"+new String("llo") ;
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        int i=20;
        if(i>10){throw new Exception ("666");}
    }
    public static int fun(int a){
        a^=(1<<5)-1;
        return a;
    }
}
