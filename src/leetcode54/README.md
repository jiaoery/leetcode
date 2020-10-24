# 解题思路

由于题目中需要存在筛选出大小写和数字；然后判断是否为回文字符串。

## 1.筛选+判断

简单的方法就是对字符串进行一次遍历，并对其中的字母和数字字符进行保留，保存在另一个字符串。这样只需要判断保留的字符串是否是一个普通的回文串即可。

### 1.1 代码

```java
public boolean isPalindrome(String s) {
		//缓存符合条件的字符串
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				stringBuffer.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		//对比反转是否有效
		return stringBuffer.toString().equals(stringBuffer.reverse().toString());
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为字符串的长度
* 空间复杂度：O(n),n为字符串的长度

## 2.双指针算法

这里使用双指针算法，在原有的字符串上进行运算即可：

* 使用左右指针left，right;每次判断是否为数字或大小写字母；然后left向右移动一格；left++
* 同上,若right位置是否为数字或大小写字母；然后right向左移动一格；right--;
* 判断符合条件的左右指针是否相同，不相同，返回false
* 默认返回true

### 2.1 代码

```java
public boolean isPalindrome(String s) {
		int length = s.length();
		// 左右指针
		int left = 0;
		int right = length - 1;

		while (left < right) {
			// 取到左指针为数字或字母为止
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			//右指针同上
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			if(left<right) {
				//是否字符相同
				if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
			}

		}
		return true;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(n),n为字符串的长度

* 空间复杂度：O(1),使用了常数级的额外空间