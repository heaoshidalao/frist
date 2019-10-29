package String;

public class Stringone {
    public static void main(String[] args){
        int x = 20;
        int y = 30;
        System.out.println(x==y);
        String str1 ="hello";
        String str2 = "hello";
        System.out.println(str1 == str2);
        String str3 = new String ("hello");
        String str4 = new String ("hello");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        String str5 = null ;
       // System.out.println(str5.equals("hello"));
        System.out.println("hello".equals(str5));
        String str10 = new String("hello") ;
        String str20 = "hello" ;
        System.out.println(str10 == str20);
        String str11 = new String("hello").intern() ;
        String str21 = "hello" ;
        System.out.println(str11 == str21);
        String str13 = "Hello world";
        str13 = "w"+str13.substring(1);
        System.out.println(str13);
//        String str = "Hello World";
//        String str2 =new String("hello world");
//        char[] arr ={'a','b','c'};
//         String str3 =str;
//         str2 = "kang";
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(arr);
//        System.out.println(str3);


    }
}
