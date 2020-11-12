package leetcode63;

/**
 * @ClassName: Solution6302.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��12�� ����10:56:12
 */
public class Solution6302 {

	public String reverseWords(String s) {
		if (s == null)
			return "";
		char[] chars = trim(s).toCharArray();
		int n = chars.length;
		// ȫ��ת��
		reverse(chars, 0, n - 1);
		// ˫ָ�뽻����Ӧ���ַ�
		int left = 0;
		int right = 0;
		while (right < n) {
			while (left < n && chars[left] == ' ') {
				left++;
			}
			right = left;
			while (right < n && chars[right] != ' ') {
				right++;
			}
			reverse(chars, left, right-1);
			left=right;
			

		}
		return new String(chars);

	}
	
	public String trim(String s) {
		 int left = 0, right = s.length() - 1;
	        // ȥ���ַ�����ͷ�Ŀհ��ַ�
	        while (left <= right && s.charAt(left) == ' ') {
	            ++left;
	        }

	        // ȥ���ַ���ĩβ�Ŀհ��ַ�
	        while (left <= right && s.charAt(right) == ' ') {
	            --right;
	        }

	        // ���ַ��������Ŀհ��ַ�ȥ��
	        StringBuilder sb = new StringBuilder();
	        while (left <= right) {
	            char c = s.charAt(left);

	            if (c != ' ') {
	                sb.append(c);
	            } else if (sb.charAt(sb.length() - 1) != ' ') {
	                sb.append(c);
	            }

	            ++left;
	        }
	        return sb.toString();
	}

	public void reverse(char[] chars, int start, int end) {
		while (end > start) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		Solution6302 sol = new Solution6302();
		String str = "the sky is blue";
		System.out.println("Before :"+str+",Atfer :"+sol.reverseWords(str));
		String str1 = "  hello world!  ";
		System.out.println("Before :"+str1+",Atfer :"+sol.reverseWords(str1));
		String str2 = "a good   example";
		System.out.println("Before :"+str2+",Atfer :"+sol.reverseWords(str2));
		String str3= "  Bob    Loves  Alice   ";
		System.out.println("Before :"+str3+",Atfer :"+sol.reverseWords(str3));
		String str4= "Alice does not even like bob";
		System.out.println("Before :"+str4+",Atfer :"+sol.reverseWords(str4));
	}
}
