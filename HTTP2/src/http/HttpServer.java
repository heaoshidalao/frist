package http;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private static final int PORT =80;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(PORT);
        while(true){
            Socket socket =server.accept();
            POOL.execute(new HttpTask(socket));
        }
    }

}
    public static void ppt(int [] arr,int left,int right){

        if (left >= right) {
            // 如果只有一个元素或者没有元素, 都不需要排序
            return;
        }
        int part = part1(arr,left,right);
        ppt(arr,left,part-1);
        ppt(arr,part+1,right);
    }
    public static int part1(int []arr,int left,int right){
//        int temp =arr[left];
//        int i =left;
//        int j = right;
//        while(i<j){
//            while(i<j&&arr[i]<temp){
//                i++;
//            }
//            while(i<j&&arr[j]>temp){
//                j--;
//            }
//            swap(arr,i,j);
//        }
//        swap(arr,i,left);
//
//
//        return i;
        int baseIndex = left;
        int baseValue = array[baseIndex];
        while (left < right) {
            while (left < right && array[right] >= baseValue) {
                right--;
            }
            // 循环结束之后, right 指向的位置, 就是从右往左第一个比基准值小的元素
            while (left < right && array[left] <= baseValue) {
                left++;
            }
            // 循环结束之后, left 指向的位置, 就是从左往右第一个比基准值大的元素.

            // 交换 left 和 right 位置的元素
            swap(array, left, right);
        }
        // 当前这个代码是把 left 和 right 重合位置的元素和基准值交换.
        // 基准值选取的是最后一个元素, 如果要想交换
        // 前提是 left 和 right 重合位置对应的元素, 必须得比基准值大.
        // 循环结束有两种情况:
        // 1. left++导致的循环结束
        //    上次循环过程中, 进行了一个 swap 操作. 经过这个 swap 操作之后,
        //    right 一定指向一个大于基准值的元素. 此时如果 left 和 right 重合
        //    也一定是指向一个大于基准值的元素
        // 2. right-- 导致的循环结束
        //    此时由于 left 刚刚找到一个比基准值大的元素, 此时 right 和 left
        //    重合之后, 对应的元素也就是刚才的那个比基准值大的值
        swap(array, left, baseIndex);
        return left;
    }


    private static void swap(int[] array, int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }