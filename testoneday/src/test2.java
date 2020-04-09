public class test2 {
    public static void main(String [] args){
        String str = "Hello";
        System.out.println(toLowerCase(str));

    }
public static String toLowerCase(String str) {

        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                str = str.replace(c, (char) (c + 32));
            }
        }
        return str;
    }
}
