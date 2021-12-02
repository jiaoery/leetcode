package leetcode134;

import leetcode133.MyStack;

public class Solution13401 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        for (int i=1;i<=100;i++){
            myQueue.push(i);
        }
        while (!myQueue.empty()){
            System.out.println(myQueue.pop());
        }

    }
}
