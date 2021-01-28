# 解题思路

本题在于寻找两个数字对应二进制位不同的位置的数目：也就是说二进制位（1或0），不一样的位为1；结合这个特性可以使用异或来解决；然后解析其中多少位为1；

## 1.1代码

```java
public int hammingDistance(int x, int y) {
		//异或
		int z = x ^ y;
		int sum = 0;
		while (z>0){
			sum += z & 1;
			z = z>>1;
		}
		return sum;
	}
```

## 1.2 复杂度分析

* 时间复杂度： O（log max（x,y））,极限情况下，需要二次幂
* 空间复杂度：O（1）