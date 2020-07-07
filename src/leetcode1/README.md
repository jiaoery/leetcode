# 解题思路

1.可以使用两次循环来实现效果

2.使用一个HashMap表存储数据，以空间换时间，具体的解法效果如下

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

其中，只循环一次，时间复杂为O(n),空间复杂度为S(n).