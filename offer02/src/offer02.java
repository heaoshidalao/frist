import java.util.*;
public class offer02 {


public static void main(String [] args){
    StringBuffer str = new StringBuffer ("We Are Happy");
    System.out.println(replaceSpace(str));

}
public static String replaceSpace(StringBuffer str){
    return str.toString().replace(" ","%20");
}
}
