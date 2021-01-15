package leetcode104;

/**
 * @ClassName: Solution10401.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月14日 下午2:30:16 
 */
public class Solution10401 {

	public int strStr(String haystack, String needle) {
		int L = needle.length(), n = haystack.length();

	    for (int start = 0; start < n - L + 1; ++start) {
	    	//API 比较
	      if (haystack.substring(start, start + L).equals(needle)) {
	        return start;
	      }
	    }
	    return -1;
    }
	
	public static void main(String[] args) {
		Solution10401 solution = new Solution10401();
		String haystack1 = "hello",needle1="ll";
		System.out.println(solution.strStr(haystack1, needle1));
		
		String haystack2 = "hello",needle2="";
		System.out.println(solution.strStr(haystack2, needle2));
		
		String haystack3 = "aaaaa",needle3="bba";
		System.out.println(solution.strStr(haystack3, needle3));
		
		String haystack4 = "ababc",needle4="abc";
		System.out.println(solution.strStr(haystack4, needle4));
	}
}
