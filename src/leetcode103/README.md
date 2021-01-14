# 解题思路

首先思路是，引入一个临时变量count.,每次`count = 2*count+A[i]`转换成十进制；然后判断这个值是否可以被5整除；但是这里就引入了一个问题？

> int类型是否会溢出。怎么解决？

继续想了下，能被5整除的，个位数一定是5或者0；（数学原理）；那是否每次就保存最后一位，而且保留0~5的值即可；



## 1.1 代码

```java
public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> list =  new ArrayList<Boolean>();
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			count <<= 1;
            count += A[i];
            count %= 10;
			list.add(count%5==0);
		}
		return list;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入数组的长度，需要对所有元素遍历一次
* 空间复杂度：O(1),额外空间为整数