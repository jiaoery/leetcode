# 解题思路

## 双指针算法

使用双指针算法解决

1.首先取第一个非空字符，标记为left，然后从这个字符位置开始，找到下一个空字符，标记为right;

2.条件1都伴随一个条件，不超域

3.交换字符位置后，从条件1标记的位置继续123操作

*![思路.png](https://pic.leetcode-cn.com/1605094669-isxrcg-image.png)*

### 1.1 代码

```java
 public String reverseWords(String s) {
        // 转成字符数组
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int left =i;
			while (left < s.length() && chars[left] == ' ') {
				left++;
			}
			int right =left;
			while (right < s.length() && chars[right] != ' ') {
				right++;
			}
			i = right;
			while (right > left) {
				char temp = chars[left];
				chars[left] = chars[right-1];
				chars[right-1] = temp;
				left++;
				right--;
			}
		
		}
		return new String(chars);
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O（N），N为字符串长度
* 空间复杂度：O（N），引入了一个字符数组用来做运算