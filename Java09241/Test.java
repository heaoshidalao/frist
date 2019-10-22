//数组定义和使用
import java.util.Arrays;
public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
// // 获取数组长度
// System.out.println("length: " + arr.length); // 执行结果: 3
// // 访问数组中的元素
// System.out.println(arr[1]); // 执行结果: 2
// System.out.println(arr[0]); // 执行结果: 1
// arr[2] = 100;
// System.out.println(arr[2]); // 执行结果: 100
//     }
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4};
    //     // for(int i=0;i<arr.length;i++){
    //     //     System.out.println(arr[i]);
    //     // }
    //     for (int x:arr){
    //         System.out.println(x);
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     printArray(arr);
    // }
    // public static void printArray(int[] a) {
    //     for (int x : a) {
    //         System.out.println(x);
    //    }
    // }
    // public static void main(String[] args) {
    //     int num = 0;
    //     func(num);
    //     System.out.println("num = " + num);
    // }
    // public static void func(int x) {
    //     x = 10;
    //     System.out.println("x = " + x);
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     func(arr);
    //     System.out.println("arr[0] = " + arr[0]);
    //    }
    //    public static void func(int[] a) {
    //        a[0] = 10;
    //        System.out.println("a[0] = " + a[0]);
    //    }
       
    //     public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     transform(arr);
    //     printArray(arr);
    //     }
    //     public static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    //     }
    //     }
    //     public static void transform(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //     arr[i] = arr[i] * 2;
    //     }
        
    //    } 
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3};
    //     int[] output = transform(arr);
    //     printArray(output);
    //     }
    //     public static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    //     }
    //     }
    //     public static int[] transform(int[] arr) {
    //     int[] ret = new int[arr.length];
    //     for (int i = 0; i < arr.length; i++) {
    //     ret[i] = arr[i] * 2;
    //     }
    //     return ret;
    //     } 
//数组转字符串
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6};
    //     String newArr = Arrays.toString(arr);
    //     System.out.println(newArr); 
    //  }
// 拷贝数组
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6};
    //     int[] newArr = Arrays.copyOf(arr, arr.length);
    //     System.out.println("newArr: " + Arrays.toString(newArr));
    //     arr[0] = 10;
    //     System.out.println("arr: " + Arrays.toString(arr));
    //     System.out.println("newArr: " + Arrays.toString(newArr)); 
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6};
    //     System.out.println(max(arr));
    //    }
    //    public static int max(int[] arr) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //     if (arr[i] > max) {
    //     max = arr[i];
    //     }
    //     }
    //     return max;
    //    } 
    //顺序查找
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,10,5,6};
    //     System.out.println(find(arr, 10));
    //    }
    //    public static int find(int[] arr, int toFind) {
    //     for (int i = 0; i < arr.length; i++) {
    //     if (arr[i] == toFind) {
    //     return i;
    //     }
    //     }
    //     return -1; 
    //    } 
    //二分查找
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
         System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch(int[] arr, int toFind) { 
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind>mid){
                left=mid+1;
            }
            else if(toFind<mid){
                right=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
       
}