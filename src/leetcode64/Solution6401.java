package leetcode64;

import java.util.HashMap;

/**
 * @ClassName: Soluton64.java
 * @Description:使用额外空间
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月13日 上午11:27:22 
 */
public class Solution6401 {
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//记录每个字符出现次数
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		//统计字符出现次数
		for (int i = 0; i < s.length(); i++) {
			int count = map.get(s.charAt(i));
			if(count ==1) {
				return i;
			}
		}
		return -1;
    }
	
	
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println("position:"+firstUniqChar(s));
		
		String s1 = "loveleetcode";
		System.out.println("position:"+firstUniqChar(s1));
		
		String s2 = "cc";
		System.out.println("position:"+firstUniqChar(s2));
	}
}
