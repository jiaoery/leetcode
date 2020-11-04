package leetcode58;

/**
 * @ClassName: Solution5802.java
 * @Description:枚举法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月4日 下午2:18:11 
 */
public class Solution5802 {

	public static int countSegments(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			//第一个不是空字符串，++1
			if(i==0&&s.charAt(i)!=' ') {
				count++;
			}
			
			if (i!=0&&s.charAt(i-1)==' '&&s.charAt(i)!=' ') {
				count++;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("words:"+countSegments(" , , , ,        a, eaefa"));
	}
}
