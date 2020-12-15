# 解题思路

# 转换为分钟数求解

既然是对分钟数排序，那就直接转成分钟数排序。使用String内部API。

* 新建一个int数组用来保存转换后的分钟数
* 使用String中subString函数，求解出分钟数，并存入int数组中
* Arrays排序
* 按照相邻两个int数组的参数求解最小分钟数差值，
* 比较跨天时间（23：00 ~00：00以后），1440-最大值-最小值（分钟数数组中）

### 1.1 代码

```java
public int findMinDifference(List<String> timePoints) {
		int[] minutes = new int[timePoints.size()];
		for (int i = 0; i < minutes.length; i++) {
			String time = timePoints.get(i);
			minutes[i] = Integer.valueOf(time.substring(0, 2))*60+Integer.valueOf(time.substring(3, 5));
		}
		//排序
		Arrays.sort(minutes);
		int min = Integer.MAX_VALUE;
		//获取所有数据中的最小值
		for (int i = 0; i < minutes.length-1; i++) {
			//最小时间为零，直接返回
			if(minutes[i]==minutes[i+1]) {
				return 0 ;
			}
			min = Math.min(min, minutes[i+1]-minutes[i]);
		}
		//跨天时间
		return Math.min(min, 1440-minutes[timePoints.size()-1]+minutes[0]);
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(nlogn),排序所需时间
* 空间复杂度：O(nlogn),排序所需空间