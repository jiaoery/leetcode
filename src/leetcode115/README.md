# 解题思路

这里引入几个变量。`sumA`（数组A的总和），`sumB`（数组B的总和）；然后`distance`（A ，B距离一半的数据）；x为A中的满足条件的元素，y为B中满足条件的元素；分析问题可以得出平衡条件

* `sumA-x+y=sumB-y+x;`
* 转换后得到`x = y +(sumA-sumB)/2`
* 引入HashSet（set）保存数组A中的数据，然后匹配B中的y元素对应x是否存在于数组A中；

## 1.1 代码

```java
public int[] fairCandySwap(int[] A, int[] B) {
		int sumA = Arrays.stream(A).sum();
		int sumB = Arrays.stream(B).sum();
		// 两者距离
		int distance = (sumA - sumB) / 2;
		int[] ans = new int[2];
		//保存A中参数
		Set<Integer> set = new HashSet<Integer>();
		for (int num : A) {
			set.add(num);
		}
		for (int i = 0; i < B.length; i++) {
			int x= B[i]+distance;
			//A中是否有B交换的对应元素
			if(set.contains(x)) {
				ans[0] = x;
				ans[1] = B[i];
				return ans;
			}
		}
		return ans;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(M+N),其中 N 是序列 A的长度，m是序列 B 的长度。
* 空间复杂度：O（N），其中 N 是序列 A的长度，引入一个哈希表存储序列A的数据

