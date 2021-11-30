package leetcode133;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> insertQueue;
    Queue<Integer> outQueue;

    public MyStack() {
        insertQueue = new LinkedList<>();
        outQueue = new  LinkedList<>();
    }

    public void push(int x) {
        //放入新数据
        insertQueue.offer(x);
        //将out里面的数据压入
        while (!outQueue.isEmpty()){
            insertQueue.offer(outQueue.poll());
        }
        //将insert里的数据压入out，保证insert一直没有数据
        while (!insertQueue.isEmpty()){
            outQueue.offer(insertQueue.poll());
        }
    }

    public int pop() {
        return outQueue.poll();
    }

    public int top() {
        return outQueue.peek();
    }

    public boolean empty() {
        return outQueue.isEmpty();
    }
}
