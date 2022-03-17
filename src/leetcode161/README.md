# 解题思路

## 1.排序 + 双指针
本题的难点在于如何去除重复解。

### 1.1算法流程

1. 特判，对于数组长度 n，如果数组为 null 或者数组长度小于 3，返回 []。
2. 对数组进行排序
3. 遍历排序后端数组
   * 第一个数num[i]>0,代表后面的数都大于0，不存在三个数相加等于0
   * 对于第一个数，前面已经出现过的元素，后面需要去重
   * 增加左右指针left，right；其中left = i+1，right = n-1，当left<right时执行以下循环
     * 若和大于 0，说明 nums[right]太大，right左移
     * 若和小于 0，说明 nums[left] 太小，left 右移



### 1.1 代码

```java
public class Solution16101 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //处理特殊情况
        if(nums==null || nums.length<3) return res;
        //对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //当第一个元素已经为正数时，不存在正数相加等于0
            if (nums[i]>0) return res;
            //第一个元素存在重复元素
            if(i>0&&nums[i]==nums[i-1]) continue;
            //使用左右指针方法
            int left = i+1,right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else {//相同时记录
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    //避免第二个元素存在相同元素
                    while(left < right && nums[left+1] == nums[left])left++;
                    //避免第三个元素存在相同元素
                    while (left < right && nums[right-1] == nums[right]) right--;
                    left++;
                    right--;
                }
            }
        }

        return res;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(N^2),数组排序时使用时间O(NlogN),双指针遍历复杂度为O（n），外层遍历数组为O(N),那么总体复杂度为O(NlogN)+O(N^2),简化为O(N^2)
* 空间复杂度：O(NlogN)，排序时使用空间