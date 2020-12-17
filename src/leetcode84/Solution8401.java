package leetcode84;

import java.util.HashMap;

/**
 * @ClassName: Solution8401.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��12��16�� ����10:24:28 
 */
public class Solution8401 {
	
	public boolean wordPattern(String pattern, String s) {
		char[] patterns = pattern.toCharArray();
		//���տո��и�
		String[] strs = s.split("\\s+");
		//���Ȳ���ȣ��ų�
		if(patterns.length!=strs.length) {
			return false;
		}
		//�����ֵ�Ե�map
		HashMap<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < patterns.length; i++) {
			char ch = patterns[i];
			//map���Ƿ����keyֵ
			if(map.containsKey(ch)) {
				//���map��Ӧֵ��strs��ǰֵ�����ϣ�����false
				if(!map.get(ch).equals(strs[i])) {
					return false;
				}
			}else {//key�в���������
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
