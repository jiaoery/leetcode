# 解题思路

这道题目是寻找“外观数组”的规律；而我们可以看出；外观数组具备以下特点：

* 第一项为 "1"，第二项为"11"
* 之后的所有数组元素遵循以下原则“
  * 下一个元素是对上一个元素的描述；如 第三项 为对第二项 ”11“的描述"21"(2个1)

这种需要利用上一个元素求解现在元素的题目，可以使用两种方法：

* 动态规划
* 递归算法

## 1. 动态规划

动态规划需要引入动态规矩数组`dp[]`;默认`dp`大小为输入参数`n+1`;默认`dp[1] = "1"`;`dp[2]="11"`;

然后针对之后的元素dp[i],对其使用动态规划算法；结束后返回dp[n]

### 1.1 代码

```java
public String countAndSay(int n) {
		
		// 边界条件
		if (n < 1) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		//动态规划数组
		String[] dp = new String[n+1];
		dp[1] = "1";
		dp[2] = "11";
		//动态规划
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dpIndex(dp[i-1]);
		}
		return dp[n];
	}
	
	/**
	 * 
	 * @param front 前一个字符
	 * @return
	 */
	public String dpIndex(String front) {
		 StringBuilder ans = new StringBuilder();
		 int count =1;
		 for (int i = 1; i < front.length(); i++) {
			if(front.charAt(i)==front.charAt(i-1)) {
				count++;
			}else {
				ans.append(count);
				ans.append(front.charAt(i-1));
				count = 1;
			}
			if (i == front.length()-1) {
				ans.append(count);
				ans.append(front.charAt(i));
			}
		}
		 return ans.toString();
	}
```

### 1.2 复杂度分析

* 时间复杂度：`O(N)`,`N`为输入字符长度，需要遍历一次进行动态规划
* 空间复杂度：`O(N)`,引入动态规划数组，长度为`N+1`；

## 2. 递归运算

递归运算方法其实和动态规划类似，只是，这里支持有一个参数用来存储结果；

### 2.1 代码

```java
public String countAndSay(int n) {

		// 边界条件
		if (n < 1) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		String current = "11";
		while (n > 2) {
			current = dpIndex(current);
			n--;
		}
		return current;
	}

	/**
	 * 
	 * @param front 前一个字符
	 * @return
	 */
	public String dpIndex(String front) {
		StringBuilder ans = new StringBuilder();
		int count = 1;
		for (int i = 1; i < front.length(); i++) {
			if (front.charAt(i) == front.charAt(i - 1)) {
				count++;
			} else {
				ans.append(count);
				ans.append(front.charAt(i - 1));
				count = 1;
			}
			if (i == front.length() - 1) {
				ans.append(count);
				ans.append(front.charAt(i));
			}
		}
		return ans.toString();
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N)，N`为输入字符长度，需要遍历一次进行递归
* 空间复杂度：O(1),仅引入常数级额外空间