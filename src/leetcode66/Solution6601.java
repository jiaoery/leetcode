package leetcode66;

import java.util.HashMap;

/**
 * @ClassName: Solution6601.java
 * @Description:HashMap 字典统计
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月16日 上午11:29:25 
 */
public class Solution6601 {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			//不包含字符，返回
			if(!map.containsKey(ch)) {
				return false;
			}
			int count  = map.get(ch);
			//字典字符用完
			if(count == 0) {
				return false;
			}
			map.put(ch, --count);
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		Solution6601 sol = new Solution6601();
		System.out.println("a , b "+sol.canConstruct("a", "b"));
		System.out.println("aa , ab "+sol.canConstruct("aa", "ab"));
		System.out.println("aa , aab "+sol.canConstruct("aa", "aab"));
	}
}
