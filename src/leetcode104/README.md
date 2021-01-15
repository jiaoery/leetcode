# 解题思路

首先考虑的是处理特殊的情况：当 `needle` 是空字符串时，我们应当返回什么值呢？题目中也已经提到，返回0；

然后考虑下正常情况下的对比，这里引入两种方式：`滑动窗口`和`双指针`

## 1.滑动窗口

子串逐一比较的解法最简单，将长度为` L` 的滑动窗口沿着` haystack` 字符串逐步移动，并将窗口内的子串与 needle 字符串相比较，时间复杂度为 `O((N−L)L)`![fig](https://pic.leetcode-cn.com/Figures/28/substrings.png)

## 1.1 代码

```
public int strStr(String haystack, String needle) {
		int L = needle.length(), n = haystack.length();

	    for (int start = 0; start < n - L + 1; ++start) {
	    	//API 比较
	      if (haystack.substring(start, start + L).equals(needle)) {
	        return start;
	      }
	    }
	    return -1;
    }
```

## 1.2 复杂度分析

* 时间复杂度：`O((N−L)L)`，其中 N 为 haystack 字符串的长度，L 为 needle 字符串的长度。内循环中比较字符串的复杂度为 L，总共需要比较 (N - L) 次。
* 空间复杂度：`O(1)`

## 2.双指针

使用滑动窗口的缺点就在于每次都需要将haystack所有长度为L的子串都与needle 字符串比较，实际上不需要这么做的。

首先，只有子串的第一个字符跟needle字符串第一个字符串相同时，才需要做后续对比

![fig](https://pic.leetcode-cn.com/Figures/28/two_pointers_start2.png)

其次是对每个字符进行对比，一旦不匹配就终止对比![fig](https://pic.leetcode-cn.com/Figures/28/mismatch2.png)

结束对比后对比相同字符串长度是否与needle字符串长度相同；不相同则回溯到haystack开始的下一个字符；![fig](https://pic.leetcode-cn.com/Figures/28/backtrack2.png)

![fig](https://pic.leetcode-cn.com/Figures/28/match.png)

整个的算法思路如下：

* 移动 `pn` 指针，直到 `pn` 所指向位置的字符与 `needle` 字符串第一个字符相等。
* 通过 `pn`，`pL`，`curr_len` 计算匹配长度。
* 如果完全匹配（即 `curr_len == L`），返回匹配子串的起始坐标（即 `pn - L`）。
* 如果不完全匹配，回溯。使` pn = pn - curr_len + 1， pL = 0， curr_len = 0`。

### 2.1 代码

```java
public int strStr(String haystack, String needle) {
		int L = haystack.length();
		int N = needle.length();
		if(N==0) {
			return 0;
		}
		int pn = 0;
		while (pn < L - N + 1) {
			//首字母相同
			while (pn < N- L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
				pn++;
			}

			int currentLen = 0;
			int pl = 0;
			//向后对照数据
			while (pl < N && pn < L && haystack.charAt(pn) == needle.charAt(pl)) {
				++pn;
				++pl;
				++currentLen;
			}
			
			if(currentLen==N) {
				return pn-N;
			}
			//或者回溯到下一个首字母位置
			 pn = pn - currentLen + 1;

		}
		
		return -1;
	}
```

### 2.2复杂度分析

* 时间复杂度：最坏时间复杂度为 `O((N - L)L)`，最优时间复杂度为 `O(N)`
* 空间复杂度：*O*(1)