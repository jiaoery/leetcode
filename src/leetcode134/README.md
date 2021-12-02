# 解题思路

跟上一题相反，这里是使用栈来实现队列的效果；那么是否可以使用跟上一题一样的原理呢。当然是可以的，具体的思路如下：（例子为插入数据为123，输出数据顺序也为123）

* 首先构建两个栈，分别为名为`in`和`out`

* 插入1

  * 判断out，是否为空（这里为空）若为空直接push

* 插入2（n数据为空，out数据为1）

  * 判断out ，是否为空（这里不为空）
  * 将out中的数据移动到in中；此时in数据为1，out数据为空
  * 将2 push进in，此时in数据为12（从栈底到栈顶）
  * 将in中数据移动到out中（in出栈，out入栈），此时in数据为空，out数据为21（从栈底到栈顶）

* 插入3（in数据为空，out数据为21）

  * 判断out ，是否为空（这里不为空）
  * 将out中的数据移动到in中；此时in数据为12，out数据为空
  * 将3 push进in，此时in数据为123（从栈底到栈顶）
  * 将in中数据移动到out中（in出栈，out入栈），此时in数据为空，out数据为321（从栈底到栈顶）

  这样就完成了push的操作，然后out栈的出栈顺序，就是队列入队列顺序

## 1.1代码

```java
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
```

## 1.2 复杂度分析

* 符合题目要求，pop，peek，isempty的复杂度都为O(1);插入操作平均复杂度为O(n).