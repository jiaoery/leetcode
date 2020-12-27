package leetcode94;

/**
 * @ClassName: Solution9401.java
 * @Description:双指针
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月24日 下午5:29:42 
 */
public class Solution9401 {
	 public boolean isSubsequence(String s, String t) {
		 char[] s1 = s.toCharArray();
		 char[] t1 = t.toCharArray();
		 int ps = 0;
		 int pt = 0;
		 //两个字符都未到尾部
		 while (pt<t1.length&&ps<s1.length) {
			if(s1[ps]==t1[pt]) {
				ps++;
			}
			pt++;		
		}
		 return ps==s1.length;
	 }
	 
	 public static void main(String[] args) {
		Solution9401 solution = new Solution9401();
		String s1 = "abc",t1 = "ahbgdc";
		System.out.println("IsSubsequence:"+solution.isSubsequence(s1, t1));
		
		String s2 = "aewfa",t2 = "aewfafwafjlwajflwajflwafj";
		System.out.println("IsSubsequence:"+solution.isSubsequence(s2, t2));
	}
}
