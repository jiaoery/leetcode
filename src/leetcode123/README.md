# 解题思路
这道题默认输入参数为正整数，所以不需要判断输入值范围；然后如何避免因子会被复用呢，（如 4=1x4；4=4x1）
其实一个数num。其中间数，也就是`sqartxsqart =num`;那么如何确认呢？
* 特殊情况处理 1 = 1x1；return false
* sum =0；
* 循环sqart情况；取sum值 
* 判断结果

## 1.1 代码
```java
public class Solution {
    public boolean checkPerfectNumber(int num) {
        //1必须要除去本身
        if (num == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        //sum里面有num本身  sum-num = num -> sum=2*num
        return sum == 2 * num;
    }
}
```

## 1.2 复杂度分析
* 时间复杂度：O(logn) ,sqart 处理后的运行次数
* 空间复杂度：O(1)