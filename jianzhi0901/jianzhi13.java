package jianzhi0901;

public class jianzhi13 {
    //import java.util.Stack;
//import java.util.Queue;
//import java.util.LinkedList;
//    public class Solution {
//        public void reOrderArray(int [] array) {
//            Queue<Integer> stack1 = new LinkedList<>();
//            Queue<Integer> stack2 = new LinkedList<>();
//            int num1 = 0;
//            int num = 0;
//            for(int i = 0;i<array.length;i++){
//                if(array[i]%2 == 1){
//                    stack1.offer(array[i]);
//                    num1++;
//                }
//                else{
//                    stack2.offer(array[i]);
//                    num++;
//                }
//            }
//            int j = 0;
//            while(num1!=0){
//                array[j] = stack1.poll();
//                j++;
//                num1--;
//            }
//            while(num!=0){
//                array[j] = stack2.poll();
//                j++;
//                num--;
//            }
//       /* Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//        for(int i = 0;i<array.length;i++){
//            if(array[i]%2 == 1){
//                stack1.push(array[i]);
//            }
//            else{
//                stack2.push(array[i]);
//            }
//        }
//        int j = 0;
//
//        while(!stack1.empty()){
//            array[j] = stack1.pop();
//            j++;
//        }
//        while(!stack2.empty()){
//            array[j] = stack2.pop();
//            j++;
//        }
//        */
//        /*
//        用两个栈来回倒数据完成
//        int count = 0;
//        while(!stack1.empty()){
//            stack2.push(stack1.pop()) ;
//            count++;
//        }
//        while(!stack2.empty()&&count>0){
//            count--;
//            array[j] = stack2.pop();
//            j++;
//        }
//        while(!stack2.empty()){
//            stack1.push(stack2.pop()) ;
//            count++;
//
//        }
//        while(count > 0){
//            count--;
//            array[j] = stack1.pop();
//            j++;
//        }
//        */
//        }
//    }
}
