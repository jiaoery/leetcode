package leetcode70;

/**
 * @ClassName: Solution7001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��19�� ����2:53:24
 */
public class Solution7001 {
	public String modifyString(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			// Ѱ�ҷ��������ģ�
			if (chars[i] == '?') {
				// �滻�ַ�
				char ch = 'a';
				// �Ա������ַ��Ƿ���ͬ
				while ((i > 0 && chars[i - 1] == ch) || (i < chars.length - 1 && chars[i + 1] == ch)) {
					ch++;
				}
				// �滻�ַ�
				chars[i] = ch;
			}
		}
		return new String(chars);
	}
	
	
	public static void main(String[] args) {
		Solution7001 sol = new Solution7001();
		String s1 = "?zs";
		System.out.println("Before :"+s1+", After:"+sol.modifyString(s1));
		
		String s2 = "ubv?w";
		System.out.println("Before :"+s2+", After:"+sol.modifyString(s2));
		
		String s3 = "j?qg??b";
		System.out.println("Before :"+s3+", After:"+sol.modifyString(s3));
		
		String s4 = "??yw?ipkj?";
		System.out.println("Before :"+s4+", After:"+sol.modifyString(s4));
	}
}
