package leetcode82;

/**
 * @ClassName: Solution8201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月15日 上午10:29:46 
 */
public class Solution8201 {

	public int monotoneIncreasingDigits(int N) {

		char[] ch = String.valueOf(N).toCharArray();
		/**修改字符标记位**/
		int index = ch.length;
		for (int i = ch.length-1; i > 0; i--) {
			//如果左边的数字大过右边，右边字符写为9，左边字符减1
			if(ch[i]<ch[i-1]) {
				index = i;
				ch[i-1]--;
			}
		}
		for (int i = index; i < ch.length; i++) {
			ch[i] = '9';
		}
		return Integer.parseInt(new String(ch));
    }
	
	public static void main(String[] args) {
		Solution8201 solution8202 = new Solution8201();
		System.out.println(solution8202.monotoneIncreasingDigits(1881));
	}
}
