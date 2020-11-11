# 解题思路

按照题目所提到的，是对一个字符串s,按照2k的长度进行分割，对其中前k部分进行反转；这里就需要考虑超域的问题。

## 1.分段双指针

按照60题的解题思路，可以解决反转的问题。那么如何解决超域和分段问题；

* 分段问题：外层循环 ，每2k点取值。如第一次left=0，第二次left = 2k-1
* 超域问题：
  * 判断left 是否超出字符长度
  * 判断right = left +k-1(取k个值)是否超出字符长度，超出则rigit = n-1(n为字符长度)

### 1.1 代码

```
public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int n = s.length();
		//分段
		for (int i = 0; i < n; i+=2*k) {
			int left = i;
			//判断右指针是否超域
			int right = i+k-1<n?i+k-1:n-1;
			//交换位置
			while (left<right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}
		return new String(chars);
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(N),N为字符串长度
* 空间复杂度：O(N),引入char数组存储数据