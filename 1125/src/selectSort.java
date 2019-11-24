import java.util.Arrays;

public class selectSort {
   public static void main (String[] args){
    int []arr = {1,5,4,6,7,7,4,0,8,2} ;
    int [] arr1 ={1,4,4,0,2};
       test(arr);

    System.out.println(Arrays.toString(arr));
   }
   public static void test(int []arr){
    for(int i = 0 ;i <arr.length - 1 ;i++){
        int max = 0 ;
        for(int j = 1 ; j<arr.length -1 -i; j++ ){
            if(arr[max] <=arr[j]){
                max = j;
            }
        }
        int t = arr[arr.length -i -1];
        arr[arr.length -1-i] = arr[max];
        arr[max ] = t;
    }
   }

}
