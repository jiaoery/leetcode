package leetcode105;

/**
 * @ClassName: Solution10501.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��1��18�� ����2:44:53
 */
public class Solution10501 {
	public boolean isPalindrome(int x) {
		try {
			// �����������������
			if (x < 0) {
				return false;
			}
			int y = 0;
			int temp = x;
			while (temp > 0) {
				y = y * 10 + temp % 10;
				temp /= 10;
			}
			return x==y;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		Solution10501 solution =  new Solution10501();
		int x1 = 202;
		System.out.println(solution.isPalindrome(x1));
		
		int x2 = -121;
		System.out.println(solution.isPalindrome(x2));
		
		int x3 = 10;
		System.out.println(solution.isPalindrome(x3));
		
		int x4 = Integer.MAX_VALUE;
		System.out.println(solution.isPalindrome(x4));
	}
}
