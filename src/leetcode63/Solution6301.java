package leetcode63;

/**
 * @ClassName: Solution6301.java
 * @Description:split函数方法
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月12日 上午10:46:08
 */
public class Solution6301 {
	public static String reverseWords(String s) {
		String[] words = s.split("\\s+");
		StringBuffer sBuffer= new StringBuffer();
		for (int i = words.length-1; i>=0; i--) {
			sBuffer.append(words[i]+" ");
		}
		return sBuffer.toString().trim();
	}
	
	public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println("Before :"+str+",Atfer :"+reverseWords(str));
		String str1 = "  hello world!  ";
		System.out.println("Before :"+str1+",Atfer :"+reverseWords(str1));
		String str2 = "a good   example";
		System.out.println("Before :"+str2+",Atfer :"+reverseWords(str2));
		String str3= "  Bob    Loves  Alice   ";
		System.out.println("Before :"+str3+",Atfer :"+reverseWords(str3));
		String str4= "Alice does not even like bob";
		System.out.println("Before :"+str4+",Atfer :"+reverseWords(str4));
	}
}
