# 解题思路

拿到题目的第一个反应就是可以用正则表达式，轻松，而且无论时间复杂度都是O(N)级别的。美滋滋就开始分析：

* 1.全部为大写
* 2.全部为小写
* 3.首字母大写

## 1.正则表达式

针对三个条件，分别以以下的正则资源来实现：

* ^ 开始符号
* +前面的表达式会出现一次或多次
*  $结束表示符 
* | 平级条件，类似语言中or的意思  
* [a-z]小写 [A-Z]大写

最终组合下，正则表达式就出来了：

>  **String pattern = "^[A-Z]+$|^[a-z]+$|^[A-Z][a-z]+$";**

然后提交一发，.....

### 1.1 代码

```java
public boolean detectCapitalUse(String word) {
        String pattern = "^[A-Z]+$|^[a-z]+$|^[A-Z][a-z]+$";
		return word.matches(pattern);
    }
```



![查看源图像](https://tse3-mm.cn.bing.net/th/id/OIP.EnFv83qP_xgExwvqRIemaAHaHa?pid=Api&rs=1)

### 1.2 复杂度分析

* 时间复杂度:O(nm)；正则时间复杂度为O(n),但是匹配时间与正则长度m有关（具体可以查阅百度）
* 空间复杂度：O(1),未引入额外空间

ps:其实正则的效率还是很慢的，还有优化的空间![正则结果](https://upload-images.jianshu.io/upload_images/2326194-4825b8d5d6fe04e9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# 2.遍历查询

那么是否可以统计字符中出现的大写字母的个数，然后据此来判定是否符合条件？哎，好像可以。整理下条件：

* 统计大写字符串出现的个数，highcase
* 如果higcase 等于字符串的个数，全大写，符合条件1，返回true；
* 如果highcase等于字符串的个数，全小写，符合条件2，返回true；
* 如果highcase等于1，且首字母为大写，符合条件3，返回true；
* 默认返回false

## 2.1 代码

```java
public  boolean detectCapitalUse(String word) {
		int highcase = 0;
		
		for (int i = 0; i < word.length(); i++) {
			//统计大写个数
			if(word.charAt(i)>='A'&&word.charAt(i)<='Z') {
				highcase++;
			}
		}
		//字母都为大写或都为小写
		if(highcase == word.length() || highcase ==0) {
			return true;
		}
		
		//首字母大写
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z'&&highcase==1) {
			return true;
		}
		return false;
		
    }
```

### 2.2 复杂度分析

* 时间复杂度：O(n),遍历数组一次
* 空间复杂度：O(1)