package leetcode75;

/**
 * @ClassName: Solution7501.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��26�� ����11:11:36
 */
public class Solution7501 {
	public String compressString(String S) {
		if (S == null || S.equals("")) {
			return "";
		}
		int n = S.length();
		int count = 1;
		StringBuilder sBuilder = new StringBuilder();
		// ȡ��ǰ��λ�ַ�
		char front = S.charAt(0);
		// ��ǰ�ַ�
		char index = S.charAt(0);
		for (int i = 1; i < n; i++) {
			index = S.charAt(i);
			if (index == front) {
				count++;
			} else {
				sBuilder.append(front).append(count);
				front = index;
				count = 1;
			}

		}
		//׷�����һλ
		sBuilder.append(front).append(count);
		return sBuilder.length() >= n ? S : sBuilder.toString();
	}

	public static void main(String[] args) {
		Solution7501 sol = new Solution7501();
		String str1 = "aabcccccaaa";
		System.out.println("String:" + str1 + ",compressString:" + sol.compressString(str1));

		String str2 = "abbccd";
		System.out.println("String:" + str2 + ",compressString:" + sol.compressString(str2));

		String str3 = "  ";
		System.out.println("String:" + str3 + ",compressString:" + sol.compressString(str3));
	}
}
