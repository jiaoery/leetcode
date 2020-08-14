package leetcode19;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution1901.java
 * @Description:ջ���
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��14�� ����10:27:30
 */
public class Solution1901 {

	public boolean isValid(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		//
		Deque<Character> deque = new ArrayDeque<Character>();
		//����ο�����
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for(char c:s.toCharArray()) {
			//��������ջ
			if(c=='('||c=='['||c=='{') {
				deque.push(c);
			}else {
				//�����Ϲ淶
				if(deque.size()==0||deque.pop()!= map.get(c)) {
					return false;
				}
			}
		}
		
		return deque.isEmpty();

	}
}
