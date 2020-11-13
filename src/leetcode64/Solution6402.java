package leetcode64;

/**
 * @ClassName: Solution6402.java
 * @Description:双指针 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月13日 下午3:36:14 
 */
public class Solution6402 {

	 public static int firstUniqChar(String s) {
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 //前后均为同一个位置
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
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
