# 解题思路

这道题目有两个核心需求：

* 1.字符串中所有字符出现次数统计
* 2.根据所有字符出现的次数，进行排序输出

针对第一个需求。可以使用之前使用过的HashMap来做统计。而第二个需求，一开始是真的没有头绪。但是在查阅其他人的解题思路后，有个想法让我眼前一亮![阿前 - 阿门沙雕表情包：阿门阿前一颗葡萄树-发表情](http://wx3.sinaimg.cn/bmiddle/006R4mNygy1fv9am38izlj304c03udfn.jpg)

然后，就。。。。拿来用了

## 1.HashMap统计+PriorityQueue排序

* 前面也说了使用HashMap统计每个字符出现的次数
* 获取keyset,压入PriorityQueue优先队列中，队列的排序规则按照每个key的vlue大小
* 使用一个StringBuilder来重新组成字符串，并返回

### 1.1 代码

```java
public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		//使用优先级队列
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
		maxHeap.addAll(map.keySet());
		
		//根据优先顺出队列
		StringBuilder res = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char key = maxHeap.poll();
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                res.append(key);
            }
        }
        return res.toString();
		
	}
```

