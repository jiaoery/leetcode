# 解题思路

按照先进后出，这个数据结构肯定是栈结构了，然后start时入栈，end时出栈，然后时间一般为end时间-start时间+1（一开始没这个+1，结果错了，看评论才知道有+1），如果中间有其他任务，也需要在上一级去掉这个任务消耗的时间



## 1.1 代码

```java
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Stack<Node> stack = new Stack<>();
        for (int i=0;i<logs.size();i++){
            String[] data = logs.get(i).split(":");
            int id = Integer.parseInt(data[0]);
            int time = Integer.parseInt(data[2]);
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
                result[node.id] += timeCount;
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

}
```

## 1.2 复杂度分析

- 时间复杂度：O(n),n为输入字符中的命令数，需要遍历一次执行
- 空间复杂度：O(1),除了返回结果的空间，其他使用的变量数为常数