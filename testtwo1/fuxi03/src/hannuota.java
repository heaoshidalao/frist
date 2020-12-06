public class hannuota {
    public static void main(String [] args){
       hanoi(3,0,2);
    }
    public static void hanoi (int n,int from,int to){
        if(n<1){
            return ;
        }
        if(n == 1){
            System.out.printf("直接将1个盘子，从%d移动到%d\n",from,to);
            return;
        }
        int other = (0+1+2)-from-to;
        hanoi(n-1,from,other);
        System.out.printf("直接将1个盘子，从%d移动到%d\n",from,to);
        hanoi(n-1,other,to);
    }
}
