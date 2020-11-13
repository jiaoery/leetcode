package leetcode64;

/**
 * @ClassName: Solution6403.java
 * @Description:26字母数组
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月13日 下午4:03:57 
 */
public class Solution6403 {
	public static int firstUniqChar(String s) {
		int[] words = new int[26];
		//统计每个字符出现的次数
		for (int i = 0; i < s.length(); i++) {
			words[s.charAt(i)-'a']+=1;
		}
		
		//得出结论
		for (int i = 0; i < s.length(); i++) {
			if(words[s.charAt(i)-'a']==1) {
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
