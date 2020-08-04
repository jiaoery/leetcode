# 解题思路

## 1.1 双指针算法

这里最好使用双指针算法来解决问题，其中分为慢指针`i`和快指针`j`。其中：

* 快指针`j`是做数组循环的，用来动态取值

* 慢指针`i`用来做对比，当`nums[i]==nums[j]`时，快指针向后移一位；当`nums[i]!=nums[j]`,

   此时慢指针向后移动一位，并将快指针指向数值赋值给慢指针指向的值。`（i++,nums[i]=nums[j])`

![双指针算法.png](https://upload-images.jianshu.io/upload_images/2326194-95560bc06bec6682.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

```
public int removeDuplicates(int[] nums) {
     if(nums.length==0) {
        	return 0;
        }
        //慢指针
        int i =0;
        for (int j = 0; j < nums.length; j++) {
        	//快指针若不相等，就就移动慢指针，并赋值
			if(nums[i]!=nums[j]) {
				nums[++i]=nums[j];
			}
		}
        return i+1;
    }
```

## 1.2 复杂度分析

- 时间复杂度：`O(n)`，假设数组的长度是 `n`，那么 `i` 和`j` 分别最多遍历 `n` 步。
- 空间复杂度：`O(1)`。