import java.util.*;

public class Finder2 {
    public static void main (String[] args){
        int [] a = {1,3,5,2,2};
        int K=3;
        int n = 5;
        int result =findKth(a,n,K);
        System.out.println(result);
    }
    public static int findKth(int[] a, int n, int K) {
        // for(int i = 0;i<n;i++){
        //     for(int j = 0;j<n-1-i;j++){
        //         if(a[j]>a[j+1]){
        //             int temp = 0;
        //            temp = a[j];
        //            a[j] = a[j+1];
        //           a[j+1] = temp;
        //       }
        //    }
        // }
        //  int c =K -1;
        //  return a[c];
        sort(a,0,n-1);
        return a[K-1];

    }
    public static void sort (int[] a, int left,int right){
        if(left>=right){
            return ;
        }
        int part = help(a,left,right);
        sort(a,left,part-1);
        sort(a,part+1,right);
    }
    public static int help(int[] a,int left ,int right){
        int dex = left;
        int temp = a[dex];
        int i = left;
        int j = right;
        while(i<j){
            while(i<j&&a[i]<=temp){
                i++;
            }
            while(i<j&&a[j]>=temp){
                j--;
            }
            swap(a,i,j);
        }
        if(a[j]<temp){
            swap(a,dex,j);
            return j;
        }
        else{
            swap(a,dex,j-1);
            return j-1;
        }

    }
    public static void swap(int [] a,int y,int x){
        int temp2 = 0;
        temp2= a[y];
        a[y] = a[x];
        a[x] =temp2;
    }

}
