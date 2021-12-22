# 解题思路
使用一个栈来维护运算，根据规则运算即可
## 1.1 代码
```java
public class Solution{
    public int calPoints(String[] ops) {
        if (ops.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "C":
                    sum -= stack.pop();
                    break;
                case "D":
                    sum += stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    stack.push(temp1);
                    sum += stack.push(temp1 + temp2);
                    break;
                default:
                    sum += stack.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        return sum;
    }
}
```

## 1.2 复杂度分析
* 时间复杂度：O(N),N为传入数组的长度
* 空间复杂度：O(N),N为传入数组的长度，极限条件下需要N个空间