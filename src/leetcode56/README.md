# 解题思路

## 1.暴力法

暴力法可以直接解决这个问题，从两个数组中分别取数判断 ：

* 数是否相等
* 结果数组是否包含当前数

根据结果放入结果数组中，最终返回结果数组。假设数组1的长度为M，数组2的长度为N。时间复杂度为O(M*N).

### 1.1 代码

```java
public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
					list.add(nums1[i]);
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(M*N),其中MN分别为两个数组的长度
* 空间复杂度：O(1),排除结果数组，未引入额外数组

## 2.引入额外空间

如何降低时间复杂度，肯定就是引入额外空间了，这里最好引入HashSet集合（判断是否有元素，和取出元素复杂度都为O（1），这里就可以将其中一个数组存入HashSet中，然后另一个数组取值取和HashSet比较。最终得到结果数组。

### 2.1 代码

```java
public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set1.contains(nums2[i]) && !set2.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}
		int[] result = new int[set2.size()];
		int index = 0;
		for (int set : set2) {
			result[index++] = set;
		}
		return result;

	}
```

### 2.2 复杂度分析

时间复杂度：O(M+N)，MN分别为两个数组的长度

空间复杂度：O(M+N),引入了两个集合变量