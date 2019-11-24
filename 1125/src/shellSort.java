import java.util.Arrays;

public class shellSort {
    public static void main(String []args){
        int [] arr = {84,543,5,632,563,63,2,5,63,6,};
        test(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void test (int [] arr){
        int gap = arr.length;
        while(gap> 0){
            sort(arr,gap);
            gap = gap/2;

        }
    }
    public static void sort(int [] arr, int gap){
        int bound = 1;
        for(bound = 1;bound<arr.length;bound++){
            int temp = arr[bound];
            int cur = bound-gap;
            for(;cur>=0; cur = cur - gap ){
                if(arr[cur]>temp ){
                    arr[cur+gap] = arr[cur];
                }
                else break;
            }
            arr[cur+gap] = temp;
        }
    }
}
