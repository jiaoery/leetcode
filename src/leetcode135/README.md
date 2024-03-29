# 解题思路

由于我们希望数组的和尽可能大，因此除非万不得已，我们应当总是修改负数或者0，并且优先修改值最小的负数或零（当零是最小数）。因为将负数 -x修改成 x会使得数组的和增加 2x，所以这样的贪心操作是最优的。

当给定的 K小于等于数组中负数的个数时，我们按照上述方法从小到大依次修改每一个负数即可。但如果 K的值较大，那么我们不得不去修改非负数（即正数或者 0）了。由于修改 0对数组的和不会有影响，而修改正数会使得数组的和减小，因此

- 如果数组中存在 0，那么我们可以对它进行多次修改，直到把剩余的修改次数用完；

- 如果数组中不存在 0 并且剩余的修改次数是偶数，由于对同一个数修改两次等价于不进行修改，因此我们也可以在不减小数组的和的前提下，把修改次数用完；

- 如果数组中不存在 0 并且剩余的修改次数是奇数，那么我们必然需要使用单独的一次修改将一个正数变为负数（剩余的修改次数为偶数，就不会减小数组的和）。为了使得数组的和尽可能大，我们就选择那个最小的正数。

  需要注意的是，在之前将负数修改为正数的过程中，可能出现了（相较于原始数组中最小的正数）更小的正数，这一点不能忽略。

## 1.1代码

```java
public class Solution{
   public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<nums.length;i++){
            if(k>0&&(nums[i]<=0)){
               k--;
               min = Math.min(min,-nums[i]);
               sum +=-nums[i];
            }else {
                sum += nums[i];
                min = Math.min(min,nums[i]);
            }
        }
        if(k>0&&(k&1)==1){
            sum = sum - 2*min;
        }
        return sum;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(nlogn),快速排序使用
* 空间复杂度：O(nlogn),快速排序使用