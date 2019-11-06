package Stack;

import java.util.Arrays;

public class stack {
    private int[] arr = new int [100];
    private int size = 0;
    //入栈

    public void push (int x){
        arr[size] = x;
        size++;
    }
    //出栈
    public Integer pop(){
        if(size == 0){
            return null;
        }
        int ret = arr[size-1];
        size --;
        return ret;
    }
    //取栈顶元素
    public Integer peek(){
        int ret = arr[size-1];
        return ret;
    }
    //判断栈为空
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        else{
            return false;
        }
    }
    //栈的大小
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
