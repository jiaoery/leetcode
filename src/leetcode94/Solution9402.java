package leetcode94;

/**
 * @ClassName: Solution9402.java
 * @Description:API
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月24日 下午5:51:44 
 */
public class Solution9402 {

	 public boolean isSubsequence(String s, String t) {
		 for (int i = 0; i < s.length(); i++) {
			char ps = s.charAt(i);
			int ts = t.indexOf(ps);
			if (ts == -1) {
				return false;
			}
		}
		 return true;
	 }
	 
	 public static void main(String[] args) {
			Solution9402 solution = new Solution9402();
			String s1 = "abc",t1 = "ahbgdc";
			System.out.println("IsSubsequence:"+solution.isSubsequence(s1, t1));
			
			String s2 = "axc",t2 = "ahbgdc";
			System.out.println("IsSubsequence:"+solution.isSubsequence(s2, t2));
		}
}
