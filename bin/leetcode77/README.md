# 解题思路

首先，初始化一个空的答案列表。

* 遍历数字1~N
* 对于每个数，判断它能不能同时被 3 和 5 整除，如果可以就把 FizzBuzz 加入答案列表。
* 如果不行，判断它能不能被 3 整除，如果可以，把 Fizz 加入答案列表。
* 如果还是不行，判断它能不能被 5 整除，如果可以，把 Buzz 加入答案列表。
* 如果以上都不行，把这个数加入答案列表
* 最后返回答案列表

## 1.1 代码

```java
public List<String> fizzBuzz(int n) {
		List<String> result =  new ArrayList<String>();
		for (int i = 1; i <=n; i++) {
			if(i%15==0) {
				result.add("FizzBuzz");
				continue;
			}
			if(i%3==0) {
				result.add("Fizz");
				continue;
			}
			if (i%5==0) {
				result.add("Buzz");
				continue;
			}
			result.add(i+"");
		}
		return result;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N），N为输入数字大小，从1~N遍历一次
* 空间复杂度：O(1),除去结果空间，无额外空间