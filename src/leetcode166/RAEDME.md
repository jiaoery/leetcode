# 解题思路

## 1.二分查找

考虑使用二分查找来实现，因为num是正整数，所以若正整数z满足zxz=num，那么x一定满足0<x<=num,于是我们可以把0和num作为二分查找搜索区间的初始边界。

**细节**

因为我们在移动左侧边界start和右侧边界end时，新的搜索区间都不会包含被检查的下标middle，所以搜索区间的边界始终是我们没有检查过的。因此，当start == end的时候，我们仍需要检查 middle = start + （end-start）/2;



### 1.1 代码

```java
public class Solution16601 {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start<=end){
            int middle = start + (end-start)/2;
            long sqrt  = (long)middle*(long)middle;
            if(sqrt<x){
                start = middle+1;
            }else if(sqrt>x){
                end = middle-1;
            }else{
                return middle;
            }
        }
        return end;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：`O(logn)`，其中 `n` 为正整数 `num` 的最大值。
* 空间复杂度：*O*(1)