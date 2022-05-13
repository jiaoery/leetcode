# 解题思路

## 滑动窗口

这道题可以使用滑动窗口的方式来做，

首先定义两个指针 `left` 和 `right`，后续遍历数组与记录用，

* 左右指针起始均在位置 `0` ；用右指针遍历数组，每次循环中右指针右移一次；
* 移动过程中纪录从左指针到右指针路上的连续数的乘积为 `sum`；
* 如果乘积大于 `k` 了，则左指针右移，注意此处用的是 `while` 来使左指针右移，因为实际情况可能是：右指针最后右移一次指向了一个比较大的数使得 `sum` 不小于目标值，此时左指针需要右移多次才能使得 `sun` 刚小于 `k`；
* 最后用 `count` 记录 `sum` 小于 `k` 时的数组组合；

## 代码

```java
public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int sum = 1;
        int count = 0;
        int left  = 0;
        int right = 0;
        while(right< nums.length){
            sum *= nums[right++];
            while (left<right&&sum>=k){
                sum /= nums[left++];
            }
            count += right-left;
        }
        return count;
    }
}
```

## 复杂度分析

本题采用的是双指针滑动窗口，大循环是右指针的移动，内部小循环是左指针的移动。

* 时间复杂度：`O(n)`，其中 `n `是数组 `nums` 的长度，右指针遍历一遍数组，左指针紧随其后最多遍历一遍数组；
* 空间复杂度：O(1)，只创建了有限的几个常量变量作为记录。
* 

