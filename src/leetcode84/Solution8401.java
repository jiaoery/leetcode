package leetcode84;

import java.util.HashMap;

/**
 * @ClassName: Solution8401.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月16日 上午10:24:28 
 */
public class Solution8401 {
	
	public boolean wordPattern(String pattern, String s) {
		char[] patterns = pattern.toCharArray();
		//按照空格切割
		String[] strs = s.split("\\s+");
		//长度不相等，排除
		if(patterns.length!=strs.length) {
			return false;
		}
		//保存键值对的map
		HashMap<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < patterns.length; i++) {
			char ch = patterns[i];
			//map中是否包含key值
			if(map.containsKey(ch)) {
				//如果map对应值和strs当前值不符合，返回false
				if(!map.get(ch).equals(strs[i])) {
					return false;
				}
			}else {//key中不包含数据
				if(map.containsValue(strs[i])) {
					return false;
				}else {
					map.put(ch, strs[i]);
				}
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		Solution8401 solution8401 = new Solution8401();
		String pattern1 = "abba", str1 = "dog cat cat dog";
		System.out.println(solution8401.wordPattern(pattern1, str1));
		
		String pattern2 = "abba", str2= "dog cat cat fish";
		System.out.println(solution8401.wordPattern(pattern2, str2));
		
		String  pattern3 = "aaaa", str3 = "dog cat cat dog";
		System.out.println(solution8401.wordPattern(pattern3, str3));
	}
}
