package leetcode133;

import java.util.LinkedList;
import java.util.Queue;

public class Solution13301 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("top "+myStack.top());
        System.out.println("pop "+myStack.pop());
        System.out.println("isEmpty "+myStack.empty());// 返回 False

    }
}
