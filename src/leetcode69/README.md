### 解题思路

没想到自己思考后写出来的，和官方答案如此一致。说下思路：
1.首先找出0~9字符中具备特性的key字符：

* 0（zero）只包含z
* 2（two）只包含w
* 4（four）只包含u
* 6（six）只包含x
* 8 （eight）只包含g

第一圈结束，找出的全部是偶数的个数；那么在此基础上可以继续找剩余的具备特性的key字符：（有点像拼图）

* 3(three) 包含的h只有 8具备
* 5(five) 包含的f只有 4具备
* 7(seven) 包含的s只有 6具备

然后第三圈同理

* 1(one)包含的o 0,2和4都具备
* 9(nine)包含的i 5 ,6,8都具备

然后形成代码结构

## 1.1 代码

```java
class Solution {
    public String originalDigits(String s) {
      // count letter
		int[] words = new int[26];
		for (int i = 0; i < s.length(); i++) {
			words[s.charAt(i) - 'a']++;
		}

		// building digit
		int[] counts = new int[10];
		// 数字0只包含字符z
		counts[0] = words['z' - 'a'];
		// 数字2只包含w
		counts[2] = words['w' - 'a'];
		// 数字4只包含u
		counts[4] = words['u' - 'a'];
		// 数字6只包含x
		counts[6] = words['x' - 'a'];
		// 数字8只包含g
		counts[8] = words['g' - 'a'];
		// 数字3包含的h只有 8具备
		counts[3] = words['h' - 'a'] - counts[8];
		// 数字5包含的f只有4具备
		counts[5] = words['f' - 'a'] - counts[4];
		// 数字7包含的s只有6具备
		counts[7] = words['s' - 'a'] - counts[6];
		// 数字1包含的o 0,2和4都具备
		counts[1] = words['o' - 'a'] - counts[0] - counts[2] - counts[4];
		// 数字9包含的i 5 ,6,8都具备
		counts[9] = words['i' - 'a'] - counts[5] - counts[6] - counts[8];

		// building result
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				stringBuilder.append(i);
			}
		}
		return stringBuilder.toString();
    }
}
```

## 1.2 复杂度分析

* 时间复杂度:`O(N）`,用于获取所有字符统计数据，N为字符串的长度
* 空间复杂度：`O(1)`,这里引入了26字母的数组以及，长度为10的数字数组，除开结果字符串外，数量级为常数级

