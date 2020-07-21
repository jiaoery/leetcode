# 解题思路

* 首先，需要判断该目标数字target，与顺序数组nums中对应数的关系。伪代码逻辑如下

  * 顺序数组是否为空
  * for循环nums数组，取每个数为nums[i]
  * 如果target == nums[i],那么返回目标位置为i;如果target<nums[i],需要在该位置插入数据，插入目标位置为i;综合就是：tagert<=nums[i],return i;
  * 如果轮询结束未找到目标且tartget>nums[i-1];就在末尾添加target,return nums.length

* 最终代码效果

  ```java
  public static int searchInsert(int[] nums, int target) {
          if(nums == null){
              throw new RuntimeException("the arrows is null");
          }
        
          for(int i =0 ;i<nums.length;i++){
               if(target<=nums[i]){
                  return i;
              }
          }
          return nums.length;
      }
  ```

  