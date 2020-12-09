# 解题思路

## 1.排序统计

可以对原有的数组记录位置后，排序。然后再按照排名来统计。具体的操作方式如下：

* 使用HashMap记录原始数据和位置。
* 对原始的数组进行排序
* 从最大值开始计数，输出结果

### 1.1 代码

```java
public String[] findRelativeRanks(int[] nums) {
		String[] res = new String[nums.length];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 统计数据
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		Arrays.sort(nums);
		int rink = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i == nums.length - 1) {
				res[map.get(nums[i])] = "Gold Medal";
			} else if (i == nums.length - 2) {
				res[map.get(nums[i])] = "Silver Medal";
			} else if (i == nums.length - 3) {
				res[map.get(nums[i])] = "Bronze Medal";
			} else {
				res[map.get(nums[i])] = rink + "";
			}
			rink++;
		}
		return res;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(nlogn),排序需要使用的复杂度。
* 空间复杂度:   O(nlogn),排序需要使用的复杂度。

# 2.计数排序

- 假设原始数组 `nums = [1,5,10,6,2,8]`
- 可以很轻松就能获取到最大的分值是10，所以我们申请一个数组nums_index，元素全是0，长度为11（即：max+1）
- `nums_index = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]`
- 接下来我们操作nums_index，把原始数组nums里每个元素的值当做nums_index的下标，并把该下标处的值置为原始数组的下标+1（因为有0，所以第一个位置需要从1开始）。额...有点绕，继续往下看就明白了。
- 操作完后的nums_index长这样
- `nums_index = [1, 0, 5, 0, 0, 2, 4, 0, 6, 0, 3]`
- 解释下nums_index，我们从最后面往前看>0的值
  - ps:取位置时需要nums [nums_index[i]-1]]

1. 第一名在原始数组下标2的位置(3-1)
2. 第二名在原始数组下标5的位置(6-1)
3. 第三名在原始数组下标3的位置(4-1)
4. 第四名在原始数组下标1的位置(2-1)
5. 第五名在原始数组下标4的位置(5-1)
6. 第六名在原始数组下标0的位置(1-1)

### 2.1代码

```java
public String[] findRelativeRanks(int[] nums) {
		int max = 0;
		// 求取最大值
		for (int i = 0; i < nums.length; i++) {
			max = nums[i] > max ? nums[i] : max;
		}
		int[] rinks = new int[max + 1];
		// 插入排序
		for (int i = 0; i < nums.length; i++) {
			rinks[nums[i]] = i+1;
		}
		int rink = 1;
		String[] res = new String[nums.length];
		for (int i = rinks.length - 1; i >= 0; i--) {
			if (rinks[i] > 0) {
				if (rink == 1) {
					res[rinks[i]-1] = "Gold Medal";
				} else if (rink == 2) {
					res[rinks[i]-1] = "Silver Medal";
				} else if (rink == 3) {
					res[rinks[i]-1] = "Bronze Medal";
				} else {
					res[rinks[i]-1] = rink + "";
				}
				rink++;
			}
			
		}
		return res;
	}
```

### 2.2复杂度分析

* 时间复杂度：O(N+M),N为原数据大小，M为数据中最大的值
* 空间复杂度：O(M),M为数据中最大的值