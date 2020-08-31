# 解题思路

## 1.1 额外引入Map法

引入一个额外的Map,循环取nums中的值，如果map中不存在当前key，那么就是未重复，放入map中；如果存在key，代表重复，放入结果list中。

## 1.2 代码

```
public List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Integer> hashMap =new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for(int n:nums) {
			//hash中已包含，说明重复
			if(hashMap.containsKey(n)) {
				result.add(n);
			}else {
				hashMap.put(n, 1);
			}
		}
		return result;
    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(n)`,仅仅循环一次`n`
* 空间复杂度：`O(n)`,使用额外空间`map`

## 2.1 额外空间

已知` nums` 中所有数字都是正数，且处于 `1` 到 `n` 之间。遍历 `nums`中的所有数字，根据数字 `i` 找到 `nums[∣i∣]`，如果是第一次访问 `nums[∣i∣]`，将它反转为负数。如果是第二次访问，则会发现它已经是负数。因此，可以根据访问一个数字时它是否为负数找出重复数字

思路可以参考：[Question21：错误的集合(统计数组元素)](https://github.com/jiaoery/leetcode/tree/master/src/leetcode21) 方法4

## 2.2 代码

```
public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for(int n:nums) {
			if(nums[Math.abs(n)-1]>0) {
				nums[Math.abs(n)-1]*=-1;
			}else {//当前位置的索引位数组《0，重复，放入result结果中
				result.add(Math.abs(n));
			}
		}
		
		return result;
		
	}
```

## 2.3 复杂度分析

* 时间复杂度：`O(n)`,循环一次`n`
* 空间复杂度：`O(1)`,未引入其他存储空间