package leetcode104;

/**
 * @ClassName: Solution10402.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年1月14日 下午6:32:55
 */
public class Solution10402 {
	public int strStr(String haystack, String needle) {
		int L = haystack.length();
		int N = needle.length();
		if(N==0) {
			return 0;
		}
		int pn = 0;
		while (pn < L - N + 1) {
			//首字母相同
			while (pn < N- L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
				pn++;
			}

			int currentLen = 0;
			int pl = 0;
			//向后对照数据
			while (pl < N && pn < L && haystack.charAt(pn) == needle.charAt(pl)) {
				++pn;
				++pl;
				++currentLen;
			}
			
			if(currentLen==N) {
				return pn-N;
			}
			//或者回溯到下一个首字母位置
			 pn = pn - currentLen + 1;

		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Solution10402 solution = new Solution10402();
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
