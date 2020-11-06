package leetcode59;

/**
 * @ClassName: Solution5902.java
 * @Description:逆序筛选
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月6日 上午11:17:19 
 */
public class Solution5902 {

	public static int lengthOfLastWord(String s) {
		int count = 0;
		String trim = s.trim();
		for (int i = trim.length()-1; i >=0; i--) {
			if(trim.charAt(i)!=' ') {
				count++;
			}else {
				return count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World "));
	}
}
