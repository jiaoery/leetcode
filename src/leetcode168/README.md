# 解题思路

首先按照左边界从小到大的区域进行排序，然后右边距选择最小的

## 1.1 代码

```java
public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int res = 0;
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(end <= intervals[i][0])
                end = intervals[i][1];
            else{
                end = Math.min(end, intervals[i][1]);
                res++;
            }
        }

        return res;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(nlogn），排序部分使用
* 空间复杂度：O(nlogn），排序部分使用