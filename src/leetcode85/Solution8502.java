package leetcode85;

/**
 * @ClassName: Solution8502.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��12��17�� ����11:16:56
 */
public class Solution8502 {

	public String countAndSay(int n) {

		// �߽�����
		if (n < 1) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		String current = "11";
		while (n > 2) {
			current = dpIndex(current);
			n--;
		}
		return current;
	}

	/**
	 * 
	 * @param front ǰһ���ַ�
	 * @return
	 */
	public String dpIndex(String front) {
		StringBuilder ans = new StringBuilder();
		int count = 1;
		for (int i = 1; i < front.length(); i++) {
			if (front.charAt(i) == front.charAt(i - 1)) {
				count++;
			} else {
				ans.append(count);
				ans.append(front.charAt(i - 1));
				count = 1;
			}
			if (i == front.length() - 1) {
				ans.append(count);
				ans.append(front.charAt(i));
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Solution8501 solution8501 = new Solution8501();
		for (int i = 0; i <= 10; i++) {
			System.out.println(solution8501.countAndSay(i));
		}
	}
}
