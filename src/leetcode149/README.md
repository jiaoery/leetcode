# 解题思路

一开始的想法就是用滑动窗口的方式来做，具体思路如下：

* 取最近长度的2的整数倍进行判断，记标准长度为`maxLength`
* 滑动窗口，每次取`maxLength`的长度,如果为标准有效括号；直接返回`maxLength`
* 如果到末尾未取到标准有效括号，令`maxLength=maxLength-2`,继续上一步的步骤
* 若是maxLength==0，结束循环，返回0

一顿操作写出来，然后超时。。。。。。

## 1.栈

那么如何解决这个问题呢？其实说到括号，还有个第一想法就是用栈，那么怎么呢？

其实我们可以发现，遇到'('会可以入栈，‘)’出栈；不符合规范的节点，是没有另一部分的，如 ()((),第三个字符'('分割了有效字符，那么是否可以记录最后不符合规范的字符位置；举例：

![](img1.gif)

其中遇到`（`入栈，`）`出栈，若是栈为空，代表当前位置找不到对应的匹配符号，将当前位置的下标入栈，若是栈不为空，计算当前长度`length`和`result`的最长长度,记录到`result`中.最终返回result值

### 1.1 代码

```java
public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int index = 0;
        //栈底元素，由于遍历从0开始，这里记录-1
        stack.push(-1);
        while (index<s.length()){
            char current  = s.charAt(index);
            //'('为有效位值开始处
            if (current == '('){
                stack.push(index);
            }else if (current==')'){
                stack.pop();
                //有效位置记录下当前最长自串
                if(!stack.isEmpty()){
                    result = Math.max(result,index - stack.peek());
                }else {
                    //记录上次最长子串被截断的部分
                    stack.push(index);
                }
            }
            index++;
        }
        return result;
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为字符串的长度，需要遍历一次字符串
* 空间复杂度：O(n),栈需要占据的空间，极限情况下，使用到字符串长度的空间

## 2.动态规划

除了使用栈来解决，还可以使用动态规划来实现，引入一个长度与数组长度相同的动态数组`dp`.显然有效的子串一定以`)`结尾，因此我们可以知道以`(`结尾的子串对应的`)` 值必定为 0 ，我们只需要求解`)`在 `dp` 数组中对应位置的值。所以处理流程如下，

* 若是字符`)`前一个字符为`(`,形如`……()`，`dp[i]=dp[i-2]+2`可以理解其将原来的有效长度扩大了2
* 若是字符`)`前一个字符为`,)`形如`......))`,可以推断`dp[i]=dp[i−1]+dp[i−dp[i−1]−2]+2`

### 2.1 代码

```java
public class Solution(){
   public int longestValidParentheses(String s) {
        int index = 1,length = s.length(),maxLength =0;
        //动态规划数组
        int[] dp = new int[length];
        while (index<length){
            if(s.charAt(index)==')'){
                if(s.charAt(index-1)=='('){
                    //前面是否还有元素
                    if(index-2>=0){
                        dp[index] = 2+dp[index-2];
                    }else {
                        dp[index] = 0;
                    }
                }//之前的有效位置
                else if(s.charAt(dp[index-1-dp[index-1]])=='('){
                    if (index - dp[index - 1] - 2 >= 0) {//以i-1结尾的有效字符在向前看2个位置 如果>=于0
                        //当前状态=以i-1结尾的有效字符长度 + 当前匹配2个有效括号 + 以i - dp[i - 1] - 2结尾的有效字符长度
                        dp[index] = dp[index - 1] + 2 + dp[index - dp[index - 1] - 2];
                    } else {
                        //以i-1结尾的有效字符在向前看2个位置 如果<于0
                        //当前状态=以i-1结尾的有效字符长度 + 当前匹配2个有效括号
                        dp[index] = dp[index - 1] + 2;
                    }
                }
            }
            maxLength = Math.max(maxLength,dp[index]);
            index++;
        }
        return maxLength;
    }
}
```

### 2.2复杂度分析

* 时间复杂度：O(n),n为字符串的长度，需要遍历一次字符串
* 空间复杂度：O(n),栈需要占据的空间，极限情况下，使用到字符串长度的空间