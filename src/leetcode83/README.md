# 解题思路

这道题考验的是对于公式的转换能力，所以这里使用公式变换：

> `(a1+b1i)(a2+b2i)=(a1a2-b1b2)+(a2b1+a1b2)i`

那么只需要对原字符串变化，得出`a1`，`b1`；`a2`，`b2`的值，然后重新组合即可

## 1.1 代码

```java
/**
	 * (a1+b1i)(a2+b2i)=(a1a2-b1b2)+(a2b1+a1b2)i
	 * @param a
	 * @param b
	 * @return
	 */
	public String complexNumberMultiply(String a, String b) {
		// 分解字符串
		String[] splita = a.split("\\+");
		String[] splitb = b.split("\\+");
		
		int a1 = Integer.parseInt(splita[0]);
		int b1 = Integer.parseInt(splita[1].replace("i", ""));
		
		int a2 = Integer.parseInt(splitb[0]);
		int b2 = Integer.parseInt(splitb[1].replace("i", ""));
		return (a1*a2-b1*b2)+"+"+(a2*b1+a1*b2)+"i";
	}
```

## 1.2 复杂度分析

* 时间复杂度：`O(1)`，分割需要常量时间，因为字符串的长度非常小 (<20)(<20)。
* 空间复杂度：`O(1)`，使用常量的额外空间。