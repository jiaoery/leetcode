package leetcode119;

/**
 * @ClassName: Solution11901.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��2��8�� ����10:14:04
 */
public class Solution11901 {
	public int trailingZeroes(int n) {
		int five = 0;
		while (n >= 5) {
			five += n / 5;
			n /= 5;
		}
		return five;
	}

	public static void main(String[] args) {
		Solution11901 solution = new Solution11901();
//		System.out.println(solution.trailingZeroes(3));
		System.out.println(solution.trailingZeroes(10));
	}
}
