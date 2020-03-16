public class test {
    public static void main(String [] args){
        int ret = lib(4);
        System.out.println(ret);
     }
     public static int lib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return lib(n-1)+lib(n-2);
     }
    }
