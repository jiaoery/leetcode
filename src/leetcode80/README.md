# 解题思路

由于顾客买柠檬水的面值是固定的：`5,10,20`； if(顾客花费==5) five++; if(顾客花费==10) five--; ten++; if(顾客花费==20) five--; ten--; 或者if(ten < 0) five -= 3;*那么我们如何判定终止条件呢？* 我们发现，无论顾客花费多少钱买柠檬水我们要想顺利找零，手中必须要有5美元的零钱；显然，终止条件是判断if(five < 0);

## 1.1 代码

```java
public boolean lemonadeChange(int[] bills) {
		//分別用來存5，10，20的剩余数量
		int[] nums = new int[3];
		for (int num : bills) {
			if(num==5) {//5元
				nums[0]++;
			}else if (num == 10) {//10元
				nums[1]++;
				nums[0]--;
			}else if (num == 20&&nums[1]>0) {//20元,且有10元的
				nums[2]++;
				nums[1]--;
				nums[0]--;
			}else {//三张5元
				nums[2]++;
				nums[0]-=3;
			}
			//检测是否无法补足
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]<0) {
					return false;
				}
			}
		}
		return true;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入字符串的长度
* 空间复杂度：O(1)，引入常量级的额外空间