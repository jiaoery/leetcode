# 解题思路

## 1.一次遍历

可以使用一次遍历，新建一个新的数组；在头部添加偶数，在尾部添加奇数；一次遍历可以完成需求

### 1.1 代码

```java
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res =new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i <nums.length ; i++) {
            if((nums[i]&1)==0){
                res[left++] = nums[i];
            }else {
                res[right--] = nums[i];
            }
        }
        return res;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(N),遍历一次数组
* 空间复杂度：O(1),除去结果空间，其他地方为常数级空间

## 2.原地交换（双指针）

是否可以是原地交换呢，应该是可以的；只要从左右选择数据，左指针寻找奇数，右指针寻找偶数。并做交换处理。

### 2.1 代码

```java
public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //双指针
        int left =0;
        int right =nums.length-1;
        while(left<right){
            //先找到第一个需要交换的奇数
            while(left<right&&((nums[left]&1)==0)){
                left++;
            }
            //找到后面需要交换的偶数
            while(left<right&&((nums[right]&1)!=0)){
               right--;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(N),遍历一次数组
* 空间复杂度：O(1),节约了结果空间，其他地方为常数级空间