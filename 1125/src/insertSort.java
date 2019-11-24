import java.util.*;
//直接插入排序
public class insertSort {
    public static void main(String []args){
    int [] arr = {84,543,5,632,563,63,2,5,63,6,};
    test(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void test (int [] arr){
       int bound = 1;
       for(bound = 1 ;bound <arr.length ;bound ++){
           int temp = arr [bound];
           int cur = bound -1;
           for(;cur>= 0 ; cur -- ){
               if(arr[cur] >temp){
                   arr[cur +1] = arr[cur];
               }
               else break;

           }
           arr[cur+1] = temp;
       }
    }
}
