public class test1 {
    public static void main(String [] args){
//        int x =20;
//        int y =5;
//        System.out.println(x+y);
//        System.out.println((x+y)+y);
//        System.out.println(x+y+""+(x+y)+y);
        mystery(1234);
    }
    public static void mystery(int x){
        System.out.print(x%10);
        if((x/10)!=0){
            mystery(x/10);
        }
        System.out.println(x%10);
    }
}
