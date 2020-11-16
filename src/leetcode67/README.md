# 解题思路

## 1.HashMap 匹配

这个题目可以使用HashMap的数据结构来实现，因为字母异位词的特点就是字符相同，位置不同，进行排序后可以得到他们的key值。![Anagrams](https://pic.leetcode-cn.com/Figures/49/49_groupanagrams1.png)

所以解决流程如下：

### 1.1 流程

* 引入HashMap,key 为String(排序后的字符串)，value是ArrayLsit<String>,用来存储结果。
* 从目标字符串（记为：strs），每次取出一个str；
* 获取char数组（记为：chars），进行排序，然后组成key；
* 判断map中是否存在这个key，如果不存在，创建
* 在key对应的value 结合中添加原来的字符串
* 返回value中的集合列表

### 1.2 代码

```java
public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map =  new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] ch = strs[i].toCharArray();
			//排序
			Arrays.sort(ch);
			//获取key值
			String key = new String(ch);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			//添加数据
			map.get(key).add(strs[i]);
		}
		
		return new ArrayList<List<String>>(map.values());
	}
```

### 1.3 复杂度分析

* 时间复杂度： `O(NKlogK)`，其中 `N`是 `strs` 的长度，而 `K` 是 `strs `中字符串的最大长度。当我们遍历每个字符串时，外部循环具有的复杂度为 `O(N)`。然后，我们在 `O(KlogK) `的时间内对每个字符串排序。
* 空间复杂度：`O(NK)`，排序存储在 `ans` 中的全部信息内容

## 2.素数标记法

这条思路不是我自己想出来的，是在国外论坛看到一个大牛给出的思路。就是用26个素数代表26个小写字母，然后取乘积。最后对比这个乘积。

从想法而言很新颖，但是这里有一个很大问题，就是如果出现一个非常长的字符串（相乘乘积会超出key数据类型的上限）。但是从解决思路而言，这是一个非常帮的方案



### 2.1 代码

```java
public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<Long, List<String>> map =  new HashMap<Long, List<String>>();
		//26个素数
		long[] remark = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
		for (String str : strs) {
			char[] chars = str.toCharArray();
			long key = 1;
			for (int i = 0; i < chars.length; i++) {
				key *= remark[chars[i]-'a'];
			}
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			//添加数据
			map.get(key).add(str);
		}
		
		return new ArrayList<List<String>>(map.values());
	}
```

### 2.2 复杂度分析

* 时间复杂度：时间复杂度： `O(NKlogK)`，其中 `N`是 `strs` 的长度，而 `K` 是 `strs `中字符串的最大长度。当我们遍历每个字符串时，外部循环具有的复杂度为 `O(N)`。然后，我们在 `O(KlogK) `的时间内对每个字符串排序。
* 空间复杂度：`O(NK)`，排序存储在 `ans` 中的全部信息内容

