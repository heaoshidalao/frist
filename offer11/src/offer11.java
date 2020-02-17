public class offer11 {
    public static void main(String [] args){
        int n1 = -1;
        int c=NumberOf1(n1);
        System.out.println(c);
        int c1 =NumberOf2(n1);
        System.out.println(c1);
    }
    public static int  NumberOf1(int n) {
        int count = 0;
        if(n == 0){
            return 0;
        }
        if(n>0){
            for(int i = 0 ;i<32;i++){
                int c =n%2;
                if(c == 1){
                    count++;
                }
                n = n/2;
            }
        }
        else{
            n = n+1;
            for(int i = 0 ;i<32;i++){
                int c =n%2;
                if(c == 0){
                    count++;
                }
                n = n/2;
            }
        }
        return count;
    }
    public static int  NumberOf2(int n){
    int count = 0;
    while(n!= 0){
        count++;
        n=n&(n-1);
    }
    return count;
    }

}
