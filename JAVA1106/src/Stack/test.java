package Stack;

public class test {
    public static void main(String[] args){
        stack stack1 = new stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.toString());
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.toString());
        System.out.println(stack1.peek());


    }
}
