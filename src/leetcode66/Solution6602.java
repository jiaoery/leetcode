package leetcode66;

/**
 * @ClassName: Solution6602.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月16日 上午11:39:25 
 */
public class Solution6602 {
	public boolean canConstruct(String ransomNote, String magazine) {
		//26个字母
		int[] words = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			words[magazine.charAt(i)-'a']++;
		}
		
		//查询字符
		for (int i = 0; i < ransomNote.length(); i++) {
			if(words[ransomNote.charAt(i)-'a']==0) {
				return false;
			}else {
				words[ransomNote.charAt(i)-'a']--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution6602 sol = new Solution6602();
		System.out.println("a , b "+sol.canConstruct("a", "b"));
		System.out.println("aa , ab "+sol.canConstruct("aa", "ab"));
		System.out.println("aa , aab "+sol.canConstruct("aa", "aab"));
	}
}
