import static java.lang.System.out;

public class Test1 {
    public static void main(String [] args) {
//    final int i = 5;
//    System.out.println(i--);
//    System.out.println(++i);}
        for(int i = 0;i<100;i++){
            for(int j = 0 ; j<100;j++){
                for(int z = 0;z<100;z++){
                    for(int k = 0; k<100;k++){
                      if((i+j==8)&&(i+z==14)&&(j+k==10)&&(z-k==6)) {
                        System.out.println("第一行第一个数i="+i);
                          System.out.println("第一行第二个数j="+j);
                          System.out.println("第一行第三个数z="+z);
                          System.out.println("第一行第四个数k="+k);
                      }
                    }
                }
            }
        }
    }
}
