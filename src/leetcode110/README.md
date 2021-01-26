# 解题思路

先补位到最高位所有数字都是1（记作result），然后对num^result 的结果

## 1.1代码

```java
 public int findComplement(int num) {
       int temp = num;
		int result = 0;
		//取出所有位数的1
		while (temp > 0) {
			temp >>=  1;
			result = (result << 1) + 1;
		}
		//相同时为0，不同时为1
		return num ^ result;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O（logn）,因为需要取1的数字
* 空间复杂度：O（1）