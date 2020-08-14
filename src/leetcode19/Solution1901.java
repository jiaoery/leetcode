package leetcode19;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution1901.java
 * @Description:栈解决
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月14日 上午10:27:30
 */
public class Solution1901 {

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
}
