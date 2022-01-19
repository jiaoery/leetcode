package leetcode147;

import java.util.*;

public class Solution14701 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Node> stack = new Stack<>();
        for (int i=0;i<logs.size();i++){
            String[] data = logs.get(i).split(":");
            int id = Integer.parseInt(data[0]);
            int time = Integer.parseInt(data[1]);
            //start 时候出栈，end 时候出栈
            if("start".equals(data[1])){
                stack.push(new Node(id,time));
            }else {
                Node node = stack.pop();
                int timeCount = time - node.time+1;
                if (!stack.isEmpty()) {
                    //若还有程序在其中，需要减去现在程序消耗的时间
                    result[stack.peek().id] -= timeCount;
                }
                result[node.id] = timeCount;
            }
        }
        return result;
    }

    class Node{
        public Node(int id, int time) {
            this.id = id;
            this.time = time;
        }

        public int id;
        public int time;
    }

    public static void main(String[] args) {
        Solution14701 solution = new Solution14701();
    }
}
