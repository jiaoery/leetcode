# 解题思路

## 1.String API函数

使用`split`函数切割字符，从最右往左重新组装字符即可

### 1.1 代码

```java
public String reverseWords(String s) {
		String[] words = s.split("\\s+");
		StringBuffer sBuffer= new StringBuffer();
		for (int i = words.length-1; i>=0; i--) {
			sBuffer.append(words[i]+" ");
		}
		return sBuffer.toString().trim();
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(N),N为字符长度
* 空间复杂度：O(N),存储结果和中间使用的切割字符数组

## 2.双指针算法

之前已经使用过双指针算法解决过一样的问题。这里也可以按照这个思路来解决

![fig](https://pic.leetcode-cn.com/Figures/151/reverse_whole2.png)

### 2.1 代码

```java
public String reverseWords(String s) {
		if (s == null)
			return "";
		char[] chars = trim(s).toCharArray();
		int n = chars.length;
		// 全部转换
		reverse(chars, 0, n - 1);
		// 双指针交换对应的字符
		int left = 0;
		int right = 0;
		while (right < n) {
			while (left < n && chars[left] == ' ') {
				left++;
			}
			right = left;
			while (right < n && chars[right] != ' ') {
				right++;
			}
			reverse(chars, left, right-1);
			left=right;
			

		}
		return new String(chars);

	}
	
	public String trim(String s) {
		 int left = 0, right = s.length() - 1;
	        // 去掉字符串开头的空白字符
	        while (left <= right && s.charAt(left) == ' ') {
	            ++left;
	        }

	        // 去掉字符串末尾的空白字符
	        while (left <= right && s.charAt(right) == ' ') {
	            --right;
	        }

	        // 将字符串间多余的空白字符去除
	        StringBuilder sb = new StringBuilder();
	        while (left <= right) {
	            char c = s.charAt(left);

	            if (c != ' ') {
	                sb.append(c);
	            } else if (sb.charAt(sb.length() - 1) != ' ') {
	                sb.append(c);
	            }

	            ++left;
	        }
	        return sb.toString();
	}

	public void reverse(char[] chars, int start, int end) {
		while (end > start) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N),需要两次循环，一次全部交换，一个按照单词交换位置
* 空间复杂度：O(N)，引入了字符数组存储中间处理过程