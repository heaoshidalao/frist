package String;

public class Stringone {
    public static void main(String[] args){
        String str1 = "hello world hello bit" ;
        String[] result1 = str1.split(" ",2) ;
        for(String s: result1) {
            System.out.println(s);
        }
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(0, 10));
//        String str = "helloworld";
//        System.out.println(str.replaceAll("l","L"));
//        System.out.println(str.replaceFirst("l","l"));
        String str = "hello world i am six";
       // String[] result = str.split("l");
        String[] result = str.split("l",3);
        for(String sb : result){
            System.out.println(sb);
        }
        String str3 = " hello world " ;
        System.out.println("["+str3+"]");
        System.out.println("["+str3.trim()+"]");
        String str4 = "哈哈哈 " ;
        System.out.println(str4.length());
        System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(new String().isEmpty());
        //        int x = 20;
//        int y = 30;
//        System.out.println(x==y);
//        String str1 ="hello";
//        String str2 = "hello";
//        System.out.println(str1 == str2);
//        String str3 = new String ("hello");
//        String str4 = new String ("hello");
//        System.out.println(str3 == str4);
//        System.out.println(str3.equals(str4));
//        String str5 = null ;
//       // System.out.println(str5.equals("hello"));
//        System.out.println("hello".equals(str5));
//        String str10 = new String("hello") ;
//        String str20 = "hello" ;
//        System.out.println(str10 == str20);
//        String str11 = new String("hello").intern() ;
//        String str21 = "hello" ;
//        System.out.println(str11 == str21);
//        String str13 = "Hello world";
//        str13 = "w"+str13.substring(1);
//        System.out.println(str13);
//        String str = "Hello World";
//        System.out.println("A".compareTo("a"));
//        System.out.println("a".compareTo("A"));
//        System.out.println("A".compareTo("A"));
//        System.out.println("AB".compareTo("AC"));
//        System.out.println("刘".compareTo("杨"));
////        String str = "helloworld" ;
////        System.out.println(str.contains("world"));
//        String str = "helloworld" ;
//        System.out.println(str.indexOf("world")); // 5,w开始的索引
//        System.out.println(str.indexOf("bit")); // -1，没有查到
//        System.out.println(str.indexOf("l")); // 2
//        System.out.println(str.indexOf("l",5)); // 8
//        System.out.println(str.lastIndexOf("l")); // 8
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
