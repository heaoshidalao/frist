import java.util.*;
//冒泡排序
public class bubbleSort {
    public static void main(String [] args){
        int[] arr = {1,7,5,3,9,4,8,2,15};
        test(arr);
        System.out.print(Arrays.toString(arr));
    }
    private static void test(int [] arr){
        int i =0;
        for(i = 0;i< arr.length;i++){
            for(int j = arr.length -1;j > i ;j--){
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void swap (int []  arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
