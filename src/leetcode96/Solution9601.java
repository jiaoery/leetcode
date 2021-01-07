package leetcode96;

import java.util.HashMap;
import java.util.Map;

public class Solution9601 {

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char si=s.charAt(i);
			char ti=t.charAt(i);
			if(map.containsKey(si)&&map.get(si)!=ti){
				return false;
			}
			if (!map.containsKey(si)&&map.containsValue(ti)) {
				return false;
			}
			map.put(si, ti);
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution9601 solution = new Solution9601();
		String s1="egg", t1 = "add";
		System.out.println(solution.isIsomorphic(s1, t1));
		
		String s2="foo", t2 = "bar";
		System.out.println(solution.isIsomorphic(s2, t2));
		
		String s3="paper", t3 = "title";
		System.out.println(solution.isIsomorphic(s3, t3));
		
		String s4="", t4 = "";
		System.out.println(solution.isIsomorphic(s4, t4));
	}
}
