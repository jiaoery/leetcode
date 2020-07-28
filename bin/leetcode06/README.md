# 解题思路：

## 1.暴力法

### 1.1 思路与代码

最简单的方法是旋转 k 次，每次将数组旋转 1 个元素。

```
public int[] rotate(int[] nums, int k) {
		if (nums == null) {
			throw new RuntimeException("Array cannot null");
		}
		int size = nums.length;
		//k和n+k移动效果相同
		k%=size;
		//移动K位
		for (int i = 0; i < k; i++) {
			int temp = nums[size - 1];
			//每次向右移动一个位置
			for (int j = size - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			//第一个位置使用缓存数据
			nums[0] = temp;
		}
		return nums;
	}
```

### 1.2复杂度分析

* 时间复杂度：`O(n*k) `。每个元素都被移动 1 步`（O(n) `k次`（O(k)O(k)）` 。
* 空间复杂度：`O(1)`。没有额外空间被使用。

## 2.使用额外的数组

### 2.1算法和代码

我们可以用一个额外的数组来将每个元素放到正确的位置上，也就是原本数组里下标为 ii 的我们把它放到 (i+k)\%数组长度(i+k)%数组长度 的位置。然后把新的数组拷贝到原数组中。

```
public static int[] rotate(int[] nums, int k) {
       //使用临时数组
		int[] temps = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
		//超出范围需要从0重新计算
			temps[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temps[i];
		}
		return nums;
	}
```



### 2.2 复杂度分析

* 时间复杂度： `O(n)` 。将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
  空间复杂度： `O(n)`。另一个数组需要原数组长度的空间。(这里不符合需求)

## 3.翻转法

### 3.1 算法和代码

这个方法基于这个事实：当我们旋转数组 `k` 次， `k%n` 个尾部元素会被移动到头部，剩下的元素会被向后移动。

在这个方法中，我们首先将所有元素反转。然后反转前 `k `个元素，再反转后面` n-k`个元素，就能得到想要的结果。

假设 `n=7`且 `k=3` :

> 原始数组                  :          1 2 3 4 5 6 7
> 反转所有数字后             :    7 6 5 4 3 2 1
> 反转前 k 个数字后          :   5 6 7 4 3 2 1
> 反转后 n-k 个数字后        :  5 6 7 1 2 3 4 --> 结果

```
/**
	 * 额外增加数组
	 * @param nums 输入数组
	 * @param k    移动位数
	 * @return 返回的数组
	 */
	public static int[] rotate(int[] nums, int k) {
		int size = nums.length;
		k %= size;
		reverse(nums, 0, size-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, size-1);
		return nums;
	}
	
	/**
	 * 旋转数组
	 * @param nums
	 * @param start
	 * @param end
	 */
	public static void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start]= nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
```

### 3.2复杂度分析

- 时间复杂度：`O(n)` 。 `n`个元素被反转了总共 3 次。
- 空间复杂度：`O(1)`。 没有使用额外的空间。