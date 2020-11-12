package leetcode62;

/**
 * @ClassName: Solution6201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��11�� ����5:50:11
 */
public class Solution6201 {
	public static String reverseWords(String s) {
		// ת���ַ�����
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int left =i;
			while (left < s.length() && chars[left] == ' ') {
				left++;
			}
			int right =left;
			while (right < s.length() && chars[right] != ' ') {
				right++;
			}
			i = right;
			while (right > left) {
				char temp = chars[left];
				chars[left] = chars[right-1];
				chars[right-1] = temp;
				left++;
				right--;
			}
		
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		String string = "Let's take LeetCode contest";
		System.out.println("Before :" + string +",After:"+reverseWords(string));
	}
}
