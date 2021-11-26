# 解题思路

我们用` f(x)`表示爬到第 `x`级台阶的方案数，考虑最后一步可能跨了一级台阶，也可能跨了两级台阶，所以我们可以列出如下式子：

> *f*(*x*)=*f*(*x*−1)+*f*(*x*−2)

其中，初始条件为f(1)=1,f(2)=3;那么这个问题可以转化为一个动态规划问题。

## 1.动态规划

![示例图](https://assets.leetcode-cn.com/solution-static/70/70_fig1.gif)

### 1.1 代码

```java
public class Solution {
    public int climbStairs(int n) {
        //1层楼只有一个
        if(n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return climbStairs(n-2)+climbStairs(n-1);
        }
    }
}
```

但是如果n很大，就会出现一些元素被重复运算多次，这很容易就超时了，而且不出意外，放上去就超时了。是否可以改进呢？当然可以。

由于`f(n) = f(n-1)+f(n-2)`,只关注前两项，那么我们可以用两个临时变量来存储`f(n-1)`和`f(n-2)`;避免重复运算

```java
public class Solution {
    public int climbStairs(int n) {
        int one =1;
        int two = 2;
        if(n==1){
            return one;
        }
        if(n==2){
            return two;
        }
        for (int i=3;i<=n;i++){
            int temp = one;
            one = two;
            two = one+temp;
        }
        return two;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(n),需要循环n次才能获取到结果
* 空间复杂度：O(1),用于滚动缓存，所以只使用到常数级的额外空间