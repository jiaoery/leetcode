# 解题思路

## 1.排序思路

既然数组中有出现次数`> ⌊ n/2 ⌋`的元素，那排好序之后的数组中，**相同元素**总是**相邻**的。

即存在长度`> ⌊ n/2 ⌋`的一长串 由**相同元素**构成的**连续子数组**。

### 1.1 代码

```java
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(NLogN),排序所需时间复杂度
* 空间复杂度:O(NlogN),排序所需空间复杂度

## 2. 摩尔投票法

由于题目要求是时间复杂度在O(N)中，是否有更好的方法？

题目中我们需要查找的数字超过数组长度的一半，也就是说，要查找的数字target的个数会超过其他数字个数。

假设不同数字相互抵消，那么最后剩下的数字，就是我们要找的多数元素。

假设一场比赛中采取一对一盯防，到最后没有被盯住的那队人数肯定多一些。

![image.png](https://pic.leetcode-cn.com/1620725043-EouduB-image.png)

因此我们可以假设数组的第一个数字为target，然后遍历数组，我们尝试用计数count模拟这个抵消的过程，规则如下：

* 当数组中的元素与假设的target不符合时，计数count减去1.则模拟了不同的数字相互抵消
* 假设数组中的元素与假设的target相同时，技术count加1
* 当计数count等于0时，说明在当前遍历的数组元素中，当前假设的target与其他数字相互抵消（个数相同），说以我们重新假设下一个遍历的数组元素为target，继续上面的过程
* 遍历后，剩下的数字target为所求数字



### 2.1 代码

```java
public class Solution {
    //摩尔投票法
    public int majorityElement(int[] nums) {
        int count = 1;
        int target = nums[0];
        for(int i=1;i<nums.length;i++){
            if(target==nums[i]){
                count++;
            }else if(count!=0){
                count--;
            }else{
                count=1;
                target = nums[i];
            }
        }
        return target;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(N),N为数组长度，数组需要遍历一次
* 空间复杂度：O(1)