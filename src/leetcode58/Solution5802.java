package leetcode58;

/**
 * @ClassName: Solution5802.java
 * @Description:ö�ٷ�
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��4�� ����2:18:11 
 */
public class Solution5802 {

	public static int countSegments(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			//��һ�����ǿ��ַ�����++1
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
