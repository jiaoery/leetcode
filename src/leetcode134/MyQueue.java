package leetcode134;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
       if(outStack.isEmpty()){
           outStack.push(x);
       }else {
           //先将out中的数据移入in
           while (!outStack.isEmpty()){
               inStack.push(outStack.pop());
           }
           inStack.push(x);
           //将in中数据移入out
           while (!inStack.isEmpty()){
               outStack.push(inStack.pop());
           }

       }
    }

    public int pop() {
       return outStack.pop();
    }

    public int peek() {
       return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty();
    }
}
