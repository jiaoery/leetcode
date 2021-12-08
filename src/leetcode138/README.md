# 解题思路

逆波兰算法解题思路很明确，可以用栈来做操作，若是非运算符就入栈，若是运算符就出栈顶两个元素根据运算符进行运算。

整个逆波兰表达式遍历完毕之后，栈内只有一个元素，该元素即为逆波兰表达式的值。

## 1.栈

### 1.1代码

```java
public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            //is number？
            if(isNumber(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                //deal calculate
                switch (tokens[i]){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num2-num1);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num2/num1);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || 	   "*".equals(token) || "/".equals(token));
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(n),循环取值一次
* 空间复杂度：O(n)，栈所需要的空间

# 2.数组模拟栈

方法一使用栈存储操作数。也可以使用一个数组模拟栈操作。

如果使用数组代替栈，则需要预先定义数组的长度。对于长度为 n 的逆波兰表达式，显然栈内元素个数不会超过 n，但是将数组的长度定义为n 仍然超过了栈内元素个数的上界。



### 2.1 代码

```java
public class Solution {
    public int evalRPN(String[] tokens) {
        int index = -1;
        int  length = tokens.length;
        int[] stack = new int[(length+1)/2];
        for (int i = 0; i <length ; i++) {
            switch (tokens[i]){
                case "+":
                    index--;
                    stack[index]+= stack[index+1];
                    break;
                case "-":
                    index--;
                    stack[index]-= stack[index+1];
                    break;
                case "*":
                    index--;
                    stack[index]*= stack[index+1];
                    break;
                case "/":
                    index--;
                    stack[index]/= stack[index+1];
                    break;
                default:
                    index++;
                    stack[index] =Integer.parseInt(tokens[i]);
            }
        }
        return stack[index];
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(n，其中 n是数组 tokens 的长度。需要遍历数组 tokens 一次，计算逆波兰表达式的值。

* 空间复杂度：O(n)，其中 n是数组 tokens 的长度。需要创建长度为 （n+1）/2 的数组模拟栈操作。

