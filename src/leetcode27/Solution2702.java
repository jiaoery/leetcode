package leetcode27;

/**
 * λ����ƫ�Ʒ�
 * @author jiaoery
 *
 */
public class Solution2702 {

	public int rangeBitwiseAnd(int m, int n) {
		int shift = 0;
		while (m < n) {
			m >>= 1;
			n >>= 1;
			shift++;
		}
		return m<<shift;
	}
}
