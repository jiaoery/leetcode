# 解题思路

## 1.1 暴力法

首先这个可以使用暴力法，引入1...n的值，在S数组种去查询，若一个元素出现了两次，即为重复值，一个值一次都未出现，说明是缺失值。

## 1.2 代码

**全部遍历：**

```
public int[] findErrorNums(int[] nums) {
		//dup重复位置 ，missing 缺失元素
		 int dup = -1, missing = -1;
		 //i 取S的集合值
	        for (int i = 1; i <= nums.length; i++) {
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i)
	                    count++;
	            }
	            //该数据计算两次，重复
	            if (count == 2)
	                dup = i;
	            //未被计算，代表缺失
	            else if (count == 0)
	                missing = i;
	        }
	        return new int[] {dup, missing};
	    }
```

**优化方案：**

​	找到结果可以不再轮询，避免资源浪费

```
public int[] findErrorNums(int[] nums) {
		//dup重复位置 ，missing 缺失元素
		 int dup = -1, missing = -1;
		 //i 取S的集合值
	        for (int i = 1; i <= nums.length; i++) {
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i)
	                    count++;
	            }
	            //该数据计算两次，重复
	            if (count == 2)
	                dup = i;
	            //未被计算，代表缺失
	            else if (count == 0)
	                missing = i;
	            //如果已经找到结果，提前结束循环
	            if (dup > 0 && missing > 0)
	                break;
	        }
	        return new int[] {dup, missing};
	    }
```

## 1.3复杂度分析

* 时间复杂度：`O(n^2)`,因为要在1..n的范围内轮询两次
* 空间复杂度：O(1),使用恒定的空间

## 2.1快速排序算法

由于S为有序数组。可以使用快速排序的方式来解决

## 2.2 代码

```
public int[] findErrorNums(int[] nums) {
		Arrays.sort(nums);
		int dup = -1, missing = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				dup = nums[i];
			} else if (nums[i + 1] > nums[i] + 1) {
				missing = nums[i] + 1;
			}
			System.out.println("missing :" +missing+" ,dup:"+dup);
		}
		//处理只有两个元素的特殊情况
		return new int[] {dup,nums[nums.length - 1] != nums.length ? nums.length : missing};
	}
```

## 2.3 复杂度分析

* 时间复杂度：`O(nlogn)`,排序需要 ` O(nlogn)`的时间。
* 空间复杂度：`O(logn)`,排序需要`O(logn)`空间

# 3.1 使用Map存储

如果我们知道 `nums` 中每个数字出现的次数，就可以轻松的解决问题。使用 `map`存储 `nums` 中每个数字的出现次数.存储形式为`(nums[i],count)`;表示nums[i]一共出现了count次，当一个元素重复出现，计数加1.

然后再检查map中所有元素的出现次数，如果一个数字再map中未出现，它就是缺失的数字，如果一个数组出现了两次，它就是重复数字。

## 3.2 代码

```
public int[] findErrorNums(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int dup =-1,missing=1;
		for(int n:nums) {
			 map.put(n, map.getOrDefault(n, 0) + 1);
		}
		for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
	}
```

## 3.3 复杂度分析

* 时间复杂度：` O(n)`。遍历 `nums` 需要时间 `O(n)`，在 `map`中检查每个数字需要时间 `O(n)`。

* 空间复杂度：`O(n)`,map最多需要存储1到n共n个数字。

## 4.1 使用额外空间

已知` nums` 中所有数字都是正数，且处于 `1` 到 `n` 之间。遍历 `nums`中的所有数字，根据数字 `i` 找到 `nums[∣i∣]`，如果是第一次访问 `nums[∣i∣]`，将它反转为负数。如果是第二次访问，则会发现它已经是负数。因此，可以根据访问一个数字时它是否为负数找出重复数字。

完成上述操作后，所有出现过的数字对应索引处的数字都是负数，只有缺失数字` j`对应的索引处仍然是正数。

## 4.2 代码

```
 public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = 1;
        for (int n: nums) {
            if (nums[Math.abs(n) - 1] < 0)
                dup = Math.abs(n);
            else
                nums[Math.abs(n) - 1] *= -1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0)
                missing = i + 1;
        }
        return new int[]{dup, missing};
    }

```

## 4.3 复杂度分析

* 时间复杂度：`O(n)`，遍历数组两次
* 空间复杂度：`O(1)`,使用恒定的额外空间

