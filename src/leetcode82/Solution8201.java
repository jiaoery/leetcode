package leetcode82;

/**
 * @ClassName: Solution8201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��12��15�� ����10:29:46 
 */
public class Solution8201 {

	public int monotoneIncreasingDigits(int N) {

		char[] ch = String.valueOf(N).toCharArray();
		/**�޸��ַ����λ**/
		int index = ch.length;
		for (int i = ch.length-1; i > 0; i--) {
			//�����ߵ����ִ���ұߣ��ұ��ַ�дΪ9������ַ���1
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
