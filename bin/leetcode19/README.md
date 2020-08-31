# 解题思路

## 前言

这道从题目读完，最适合解决问题的数据结构就是栈。因为栈本身先入后出的特点恰好与本题括号排序特点类似。

## 1.1 辅助栈法

* 即若遇到左括号入栈，遇到右括号时将对应栈顶左括号出栈，则遍历完所有括号后 `stack` 仍然为空；
* 建立哈希表 map构建左右括号对应关系：`key`左括号，`value` 右括号；这样查询 22 个括号是否对应只需 `O(1)`时间复杂度；建立栈 `stack`，遍历字符串` s `	并按照算法流程一一判断。
  * 如果 c 是左括号，则入栈 `push`；
    否则通过哈希表判断括号对应关系，若 `stack` 栈顶出栈括号` stack.pop() `与当前遍历括号 c 不对应，则提前返回 `false`。

* 最后判断栈是否为空，空返回`true`，不为空返回`false`
* ![image.png](https://upload-images.jianshu.io/upload_images/2326194-5b8c7501184e0043.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

```
public boolean isValid(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		//
		Deque<Character> deque = new ArrayDeque<Character>();
		//保存参考队列
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for(char c:s.toCharArray()) {
			//左括号入栈
			if(c=='('||c=='['||c=='{') {
				deque.push(c);
			}else {
				//不符合规范
				if(deque.size()==0||deque.pop()!= map.get(c)) {
					return false;
				}
			}
		}
		
		return deque.isEmpty();

	}
```



## 1.3 复杂度分析

* 时间复杂度：`O(n)`需要遍历一次s
* 空间复杂度：`O(n)`需要一个栈来保存所有字符