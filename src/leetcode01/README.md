# 解题思路

## 1.暴力解法

### 1.1可以使用两次循环来实现效果，解法效果如下

```java
public static int[] twoSum1(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			return new int[] {i,j};
        		}
        	}
        }
        throw new RuntimeException("there has no number match the target");
    }
```

### 1.2复杂度分析

* 时间复杂度：O(N^2),N为输入数组长度
* 空间复杂度：O(1)

## Hash表

### 2.1使用一个HashMap表存储数据，以空间换时间，具体的解法效果如下

![img](https://pic.leetcode-cn.com/146e209493728cd7b9fd6095c5947300732799db9b28b2f8e497525ea7b31d58-Messages%20Image(1369442164).png)

最终的代码效果：

```java
public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int j ;
        for(int i=0;i<nums.length;i++){
            j = target - nums[i];
            if(map.containsKey(j)){
                return new int[]{map.get(j),i};
            } else{
                map.put(nums[i],i);
            }
        }
        throw new RuntimeException("there has no number match the target");
    }
```

### 2.2 辅助度分析

* 时间复杂度：O(N)，N为输入数组的长度
* 空间复杂度：O(N)，Hash表极限情况下需要存储所有数组数据