# 解题思路

这个题目只允许使用O(1)复杂度的额外空间来解决问题。所以最好的办法就是原地反转，思路就是使用双指针算法来解决问题。

## 1.双指针算法

* 将 left 指向字符数组首元素，right 指向字符数组尾元素。
* 当 left < right：交换 s[left] 和 s[right]；
* left 指针右移一位，即 left = left + 1；
* right 指针左移一位，即 right = right - 1。
* 当 left >= right，反转结束，返回字符数组即可。

### 1.1 代码

```java
public void reverseString(char[] s) {
		 if(s==null) {
			 return;
		 }
		 int left = 0;
		 int right = s.length-1;
		 //双指针交换
		 while (right>left) {
			 char temp = s[left];
			 s[left] = s[right];
			 s[right] =temp;			 
			 left++;
			 right--;
		}
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(N),N为字符数组长度，总共需要循环N/2次
* 空间复杂度：O(1),仅仅使用常数级的额外空间