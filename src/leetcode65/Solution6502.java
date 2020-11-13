package leetcode65;

/**
 * @ClassName: Solution6502.java
 * @Description:异或求取
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月13日 下午5:34:35 
 */
public class Solution6502 {
	public static char findTheDifference(String s, String t) {
		//s与t长度相差1
		char ch = t.charAt(t.length()-1);
		//异或运算 a^a=0
		for (int i = 0; i < s.length(); i++) {
			ch ^= s.charAt(i)^t.charAt(i);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
		String s1 = "";
		String t1 = "y";
		System.out.println(findTheDifference(s1, t1));
		String s2 = "a";
		String t2 = "aa";
		System.out.println(findTheDifference(s2, t2));
	}
}
