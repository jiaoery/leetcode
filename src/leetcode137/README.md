# 解题思路

使用两个栈，一个栈保存push进的数据（后面称为stack），一个栈保存对应的最小值（后面称为minStack），具体的push方法如下：![fig1](https://assets.leetcode-cn.com/solution-static/155/155_fig1.gif)

* 当stack为空，直接在stack和minStack中push对应元素
* 当stack不为空，stack push对应元素，minStack 需要判断当前栈顶和需要push的元素最小值，push对应值
* 按照上面的操作，保证stack中的数据数量和minStack相同，并且每次minStack的栈顶数据都是当前最小值

pop操作：

* pop操作只需要把stack和minStack栈顶元素移除

top操作：

* stack进行peek（只取出，不移除栈顶元素）

min操作：

* minStack进行peek操作

## 1.1 代码

```java
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
```

## 1.2 复杂度分析

* 时间复杂度：O(1),对于题目中的所有操作，时间复杂度均为 O(1)。因为栈的插入、删除与读取操作都是 O(1)，我们定义的每个操作最多调用栈操作两次。
* 空间复杂度：O(n)，其中 n为总操作数。最坏情况下，我们会连续插入 n个元素，此时两个栈占用的空间为 O(n)。