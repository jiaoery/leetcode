package leetcode137;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        //保持一个数据stack和一个minStack
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        }else {
            int min = Math.min(val,minStack.peek());
            stack.push(val);
            minStack.push(min);
        }
    }

    public void pop() {
       stack.pop();
       minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
