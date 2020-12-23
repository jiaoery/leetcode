# 解题思路

这道题目和上一道是反过来的，解决的思路也很简单：

* 引入keys和values两个数组，然后分别从大到小引入数字和罗马字符的对应列；
* 然后循环keys数组，比较当前输入参数与对应key的关系，然后逐项追加进结果数组中
* 最后结果返回；

## 1.1 代码

```java
public String intToRoman(int num) {
		int[] keys = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < keys.length; i++) {
			while (num>=keys[i]) {
				result.append(values[i]);
				num -= keys[i];
			}
		}
		return result.toString();
    }
```

## 1.2 复杂度分析

* 时间复杂度：不好说，跟数字大小有关
* 空间复杂度：