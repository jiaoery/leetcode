# 解题思路

本题思路简单，记录一个变量count ，遍历整个数组，出现`nums[i]`与目标值val不符合时，就将该值赋值给nums[count],并且count位移一位。最终返回的count和nums就是目标对象

## 1.1 代码

```java
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(n)
* 空间复杂度：O(1)