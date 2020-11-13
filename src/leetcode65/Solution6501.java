package leetcode65;

import java.util.HashMap;

/**
 * @ClassName: Solution6501.java
 * @Description:HashMap ����ռ�
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��13�� ����4:52:48 
 */
public class Solution6501 {
	public static char findTheDifference(String s, String t) {
		HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		//ͳ������
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			//�����ڵ�ֱ�ӷ���
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				//���Ѿ������꣬ʣ�µþ��������ַ�
				if(count==0) {
					return ch;
				}else {
					map.put(ch, --count);
				}
			}else {
				return ch;
			}
		}
		
		return ' ';
    }
	
	
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
		String s1 = "";
		String t1 = "y";
		System.out.println(findTheDifference(s1, t1));
		String s2 = "a";
		String t2 = "aa";
		System.out.println(findTheDifference(s2, t2));
	}
}
