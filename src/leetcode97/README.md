# 解题思路

本题的解题思路如下：

* 引入计数变量count,及其计算最大可种植数量allow；
* 为解决边界问题，这里直接设置数组左右虚拟一个元素0；（count默认为1，代表一开始已经有一个0）
* 遍历数组，当出现连续三个0（count==3的时候），allow计数一次，并count =1；
* 当遍历中出现1，将count 重置为1，重新计数
* 遍历结束，若count ==2（最后两个元素都为1，最后一位可以种花），allow计数一次
* 返回最大可种植数量是否大于等于 需要种植数量；

## 1.1 代码

```java
public boolean canPlaceFlowers(int[] flowerbed, int n) {
		//允许加种数量
		int allow = 0;
		int count =1;
	
		for (int index = 0; index < flowerbed.length; index++) {
			if(flowerbed[index]==0) {
				count++;
			}else{
                count = 0;
            }
			//连续三次为0，可种一次花
			if(count==3) {
				allow++;
				count=1;
			}
		}
		//最后位置是否可以钟花
		if(count==2) {
			allow++;
		}
		return allow>=n;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),遍历数组一次
* 空间复杂度：O(1),使用几个额外空间，为常数级