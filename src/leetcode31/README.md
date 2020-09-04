# 解题思路

## 1.1 暴力法

这个最开始的想法肯定是使用暴力法----遍历。每当遍历到一个节点，就遍历该根节点到该节点的所有节点，判断是否有相同的节点，如果存在相同节点，则代表存在环。

## 1.2 代码

```
public static boolean isCycle(Node head) {
		int count = 0;
		Node p1 = head;
		Node p2 = head;
		while (p1!=null) {
			//移动一个节点
			p1 = p1 .next;
			count++;
			int count1 = count;
			//内部循环，判断之前是否出现过该节点
			while (count1>0) {
				if(p1 == p2) {
					return true;
				}
				p2 = p2.next;
				count1--;
			}
			
		}
		return false;
	}
```



## 1.3 复杂度分析

时间复杂度：`O(n^2)`,两次遍历链表

空间复杂度：`O(1)`,使用恒定空间。

## 2.1引入集合

如何降低时间复杂度，肯定少不了引入集合家族了。这里可以以节点为key，遍历时查询集合中是否具备该节点，判断链表是否重复。

## 2.2 代码

```
public static boolean isCycle(Node head) {
		HashMap<Node, Integer> hashMap =new  HashMap<Node, Integer>();
		Node p1 = head;
		while (p1!=null) {
			if(hashMap.containsKey(p1)) {
				return true;
			}else {
				hashMap.put(p1,1);
			}
			p1 = p1.next;
		}
		return false;
	}
```



## 2.3 复杂度分析

* 时间复杂度：`O(n)`,只需要轮询遍历一次
* 空间复杂度：`O(n）`,需引入链表长度的集合

## 3.1 追及算法

在数学和物理学上有一个理论：两个人跑步，一个人比另一个人快。当快的人追上慢的人的时候，正好差了一圈的距离。在算法中也有一样的理论，称为追及算法。

* 使用两个指针类p1,p2;p1每次移动一个单位，p2每次移动两个单位；

* 当p2追上p1时，就代表具备环。两者移动的距离差距，就是环的大小；

  ![追及.png](https://upload-images.jianshu.io/upload_images/2326194-f1356a205888d287.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 3.2 代码

```
public static boolean isCycle(Node head) {
		//指针1 每次移动一个节点
		Node p1 = head;
		//指针2 每次移动两个节点
		Node p2 = head;
		while(p2!=null&&p2.next!=null){
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1==p2) {
				return true;
			}
		}
		return false;
	}
```



## 3.3 复杂度

* 时间复杂度：`O(n)`,循环一次
* 空间复杂度：`O(1)`，未使用额外空间