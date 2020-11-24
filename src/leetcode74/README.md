# 解题思路

这道题目的解题思路如下：

* 引入一个长度为`10`的`int`数组`nums`，统计`0~9`字符出现频率

* 遍历`secret`和`guess`两个字符串，如果对应位置的字符相同，`A++`
* 如果位置不相同，分为如下两个情况统计
  * 如果`nums`对应的`secret`的当前字符数字小于零（代表这个字符在`guess`中出现过）；`B++`并且对应`nums`统计位置加一
  * 如果`nums`对应的`guess`的当前字符数字大于零（代表这个字符在`secret`中出现过）；`B++`并且对应`nums`统计位置减一
  * 其他情况不处理
* 最后按照统计的`A` `B`出现的次数组合结果



![](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/68c895d78ff148d29d62d735b2a92b5d~tplv-k3u1fbpfcp-watermark.image)

## 1.1 代码

```java
public String getHint(String secret, String guess) {
		int[] nums = new int[10];
		int countA=0,countB=0;
		for (int i = 0; i < secret.length(); i++) {
			char sec = secret.charAt(i);
			char gue = guess.charAt(i);
			//若对应位置 guess字符和secret字符相同,A的情况加一
			if(sec == gue) {
				countA++;
			}else {
				//之前guess已经出现过这个字符
				if(nums[gue-'0']<0) {
					countB++;
				}
				nums[gue-'0']++;
				//之前secret已经出现过了
				if(nums[sec-'0']>0) {
					countB++;
				}
				nums[sec-'0']--;
			}
		}
		return countA+"A"+countB+"B";
    }
```

## 1.2 复杂度分析

* 时间复杂度：`O(N)`,N为字符串的长度
* 空间复杂度：`O(1)`,仅使用常数级的额外空间