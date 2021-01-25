package leetcode109;

/**
 * @ClassName: Solution10901.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��1��25�� ����2:36:13
 */
public class Solution10901 {

	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n&n-1;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Solution10901 solution = new Solution10901();
		int num1 = 1024;
		System.out.println(solution.hammingWeight(num1));
		
		int num2 = 3;
		System.out.println(solution.hammingWeight(num2));
		
		int num3 = 7;
		System.out.println(solution.hammingWeight(num3));
	}
}
