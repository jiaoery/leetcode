package leetcode27;

/**
 * ����1�������ƽⷨ
 * 
 * @author jiaoery
 *
 */
public class Solution2701 {
	public int rangeBitwiseAnd(int m, int n) {
		int result = m;
		while (m < n) {
			m++;
			result = m & result;
			System.out.println(result);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = new Solution2701().rangeBitwiseAnd(0, 1);
		System.out.println("result :" + result);
	}
}
