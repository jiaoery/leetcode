# 解题思路

## 前言

本题的解法与Question11有些类似，从`num1`和`nums`2从取出值求解

## 1.1 逐项乘法

以123*456，思路如下：![img](https://pic.leetcode-cn.com/d24bf3174a878890e1273fbe35426ecdfa932c33efb464ed3602f4d149ed343a)

* 遍历 `num2` 每一位与 `num1` 进行相乘，将每一步的结果进行累加。
* `num2` 除了第一位的其他位与 `num1` 运算的结果需要 **补0**
* 计算字符串数字累加其实就是 [Qustion11:字符串相加](https://github.com/jiaoery/leetcode/tree/master/src/leetcode11）

## 1.2 代码

```
/**
	 * 两数相乘
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		// 保存结果
		String result = "";
		for (int i = num2.length() - 1; i >= 0; i--) {
			// 进位保存
			int carry = 0;
			// 保存 num2 第i位数字与 num1 相乘的结果
			StringBuilder temp = new StringBuilder();
			// 补 0
			for (int j = 0; j < num2.length() - 1 - i; j++) {
				temp.append(0);
			}
			int n2 = num2.charAt(i) - '0';
			// 与num1相乘
			for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
				int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
				// 求当前位的结果
				int product = (n1 * n2 + carry) % 10;
				// 取进位
				carry = (n1 * n2 + carry) / 10;
				temp.append(product);
			}
			// 将当前结果与新计算的结果求和作为新的结果
			result = addStrings(result, temp.reverse().toString());
		}
		return result;
	}

	/**
	 * Quetsion11:两数相加
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		// 进位
		int carry = 0;
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		//是否继续运算
		while(i>=0||j>=0||carry>0) {
			int n1=i>=0?num1.charAt(i)-'0':0;
			int n2=j>=0?num2.charAt(j)-'0':0;
			int temp = (n1+n2+carry)%10;
			carry = (n1+n2+carry)/10;
			result.append(temp);
			i--;j--;
		}
		return result.reverse().toString();
	}
```

## 1.3复杂度分析

* 时间复杂度：`O(MN)`,M,N分别为`num1`和`num2`的长度
* 空间复杂度：`O(MN)`,用于存储计算结果

## 2.1 优化方法1

方法1的运算基础上还有另外一个规律：

* 乘数 `num1` 位数为 `M`，被乘数 `num2 `位数为 `N`， `num1 x num2` 结果 `res` 最大总位数为` M+N`
* `num1[i] x num2[j]` 的结果为 `tmp`(位数为两位，`"0x","xy"`的形式)，其第一位位于 `res[i+j]`，第二位位于 `res[i+j+1]`。

为了方便理解，使用下图解释![img](https://pic.leetcode-cn.com/171cad48cd0c14f565f2a0e5aa5ccb130e4562906ee10a84289f12e4460fe164-image.png)

## 2.2 代码

```
public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int[] result = new int[num1.length() + num2.length()];
		// num1从右往左取值
		for (int i = num1.length() - 1; i >= 0; i--) {
			int n1 = num1.charAt(i) - '0';
			for (int j = num2.length() - 1; j >= 0; j--) {
				int n2 = num2.charAt(j) - '0';
				int sum = (result[i + j + 1] + n1 * n2);
				result[i + j + 1] = sum % 10;
				result[i + j] += sum / 10;
			}
		}
		
		StringBuilder res = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) continue;
            res.append(result[i]);
        }
        return res.toString();

	}
```

## 3.3 复杂度分析

时间复杂度：`O(M N)`。`M`,`N` 分别为` num1 `和 `num2` 的长度。
空间复杂度：`O(M+N)`。用于存储计算结果。

![image.png](https://upload-images.jianshu.io/upload_images/2326194-a8ff899fb79f6b02.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

明显有优化效果

