# 解题思路

# 1.暴力法

这个可以直接暴力解法，获取到所有的数据，并判断是否符合条件即可，但是的确暴力法很复杂

### 1.1 代码

```java
public class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k>nums.length){
            k = nums.length;
        }
        for(int i=0;i<=nums.length-k;i++){
            for(int j=1;j<=k;j++){
                if(i+j<nums.length&&nums[i]==nums[i+j]){
                    return true;
                }
            }
        }
        return false;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O（N*K），N为数组长度，需要两次遍历获取结果
* 空间复杂度：O（1），未使用额外空间

## 2.Hash表

那么是否有方法可以优化一下呢，当然可以，我们可以引入一个HashMap记录元素和元素出现的对用位置；如果二次出现，就判断索引距离是否在k距离中，其他情况按照key-value记录元素和对应位置



### 2.1 代码

```java
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O（N），N为数组长度，并且遍历一次就可以获取到结果
* 空间复杂度：O（N），N为数组长度，这里是极限情况下会将所有元素入HashMap



## 3.滑动窗口

在2方法上还可以优化，就是维持一个长度不超过k的hashset，做滑动窗口；超出长度就从头部删除元素，从尾部插入元素，并判断这个长度内是否有重复元素。



### 3.1 代码

```java
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
               return true;
            }
        }
        return false;
    }
}
```

### 3.2 复杂度分析

* 时间复杂度：O（N），N为数组长度，并且遍历一次就可以获取到结果
* 空间复杂度：O（K），维持一个最长长度为K的hashset