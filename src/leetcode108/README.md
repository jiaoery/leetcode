# 解题思路

# 1.迭代

既然丑数的条件是只包含2，3，5三个正整数的质因数。可以依次迭代判断出他的质因数

### 1.1 代码

```java
//小于1的数都不符合
		if(num<1) {
			return false;
		}
		
		//是否被5整除
		while (num%5==0) {
			num/=5;		
		}
		//是否被3整除
		while (num%3==0) {
			num/=3;			
		}
		//是否被2整除
		while ((num&1)==0) {
			num=num>>1;	
		}
		
		return num==1;
```

### 1.2 复杂度分析

* 时间复杂度：O(N),N为2，3,5组成数字的因数个数，根据数字包含的2,3,5因数个数有关
* 空间复杂度：O(1)

## 2.递归

一般可以用迭代的算法，都可以对应改成递归的模式

### 2.1 代码

```java
public boolean isUgly(int num) {
		if(num<1)return false;
		if(num%5==0) return isUgly(num/5);
	    if(num%3==0)return isUgly(num/3);
	    if((num&1)==0)return isUgly(num>>1);
	    return num==1;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N),N为2，3,5组成数字的因数个数，根据数字包含的2,3,5因数个数有关
* 空间复杂度：O(1)