# 题题思路

## 1.动态规划

这个第一想法就是使用动态规划算法来解决问题，因为该问题可以简化为下面的算式：

```
f(i)=max{f(i−1)+nums[i],nums[i]}
f(i)为所有f(i)中的最大值
```

### 1.1 代码

```java
public class Soluton{
    public int maxSubArray(int[] nums) {
            int sum = 0;
            int ans  = nums[0];
            for (int i=0;i<nums.length;i++){
                sum = Math.max(sum+nums[i],nums[i]);
                ans = Math.max(sum,ans);
            }
            return ans;
        }
}
```



### 1.2复杂度

* 时间复杂度：O(n)，其中 n 为 nums 数组的长度。我们只需要遍历一遍数组即可求得答案。
* 空间复杂度：O(1)。我们只需要常数空间存放若干变量。

