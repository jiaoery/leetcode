# 解题思路

本题解题思路有三个重点：

* 1.特殊情况，如输入为空数组的情况
* 2.需要拓展数组长度的情况，如 999这样的输入
* 3.正常情况运算的情况；是否可以快速跳出运算

## 1.1 代码

```java
public int[] plusOne(int[] digits) {
		int length = digits.length;
		//为空的情况
		if(length==0) {
			return new int[] {1};
		}
		//保存进位
		int temp = 1;
		int count = 0;
		int i = length-1;
		//循环更新
		while (i>=0) {
				count = digits[i]+temp;
				temp = count/10;
				digits[i]= count%10;
				//节约时间
				if (temp==0) {
					break;
				}
			i--;
		}
		//最后仍然还有一位
		if (temp!=0) {
			int[] result = new int[length+1];
			result[0] = temp;
			for (int j = 0; j < length; j++) {
				result[j+1]=digits[j];
			}
			return result;
		}
		return digits;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入数组的长度
* 空间复杂度：O(1)