import java.util.*;

public class Finder {
    public static void main (String[] args){
        int [] a = {1,3,5,2,2};
        int K=5;
        int n = 5;
        int result =findKth(a,n,K);
        System.out.println(result);
    }
    public static  int findKth(int[] a, int n, int K) {
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        int c =K -1;
        return a[c];
    }
}