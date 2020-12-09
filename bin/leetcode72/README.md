# 解题思路

本身题目不难，但是思考的切入点很多；这道题目我拿两种方式来解决

## 1.标记方向

标记机器人初始的坐标位置为【x,y】(初始值x=0,y=0),四个方向指令`L`,`R`,`U`,`D`分别的坐标变化为：

* `L`,x-=1;
* `R`,x+=1;
* `U`,y-=1;
* `D`,y+=1;

如果经过一系列指令后，机器人还处于原点，那么机器人的坐标一定符合以下条件：

* `x==0&&y==0`

### 1.1 代码

```java
public boolean judgeCircle(String moves) {
		// 机器人坐标
		int x = 0, y = 0;
		for (int i = 0; i < moves.length(); i++) {
			char ch = moves.charAt(i);
			switch (ch) {
			case 'U':
				y-= 1;
				break;
			case 'D':
				y+= 1;
				break;
			case 'L':
				x -=1;
				break;
			case 'R':
				x +=1;
				break;
			default:
				break;
			}
		}
		return x==0&&y==0;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为指令字符串的长度
* 空间复杂度:  O(1),使用常数级的额外空间存储坐标

## 2. 字符频率统计

从上一个方法我们可以看出，指令`L`,`R`;两个指令相互抵消；`U`和`D`两个指令相互抵消；也就是说，可以统计他们出现的频率，比较`L==R&&U==D`验证是否是还处于原点。

### 2.1 代码

```java
public boolean judgeCircle(String moves) {
		int[] words = new int[26];
		for (int i = 0; i < moves.length(); i++) {
			words[moves.charAt(i)-'A']++;
		}
		return words['L'-'A']==words['R'-'A']&&words['U'-'A']==words['D'-'A'];
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N),N为指令字符串的长度
* 空间复杂度：O(1),使用常数级的额外空间存储坐标