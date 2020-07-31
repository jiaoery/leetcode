# 解题思路

## 1.1 遍历法

通过遍历的方式，直接查找下标等于位置值的位置，找到第一个就返回。

## 1.2 代码

```
public int findMagicIndex(int[] nums) {
		if(nums.length<1||nums.length>10000) {
			throw new RuntimeException("array's length out of limit");
		}
        for(int i =0;i<nums.length;i++){
            if(nums[i]==i){
                return i;
            }
        }
        return -1;
    }
```

## 1.3 复杂度分析

* 时间复杂度：因为有一个for循环，时间复杂度`O(n)`.
* 空间复杂度：因为只有一个返回值，空间复杂度为`O(1)`