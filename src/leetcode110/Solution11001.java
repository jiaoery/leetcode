package leetcode110;

/**
 * @ClassName: Solution1101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��1��26�� ����10:54:24
 */
public class Solution11001 {
	public int findComplement(int num) {
		int temp = num;
		int result = 0;
		//ȡ������λ����1
		while (temp > 0) {
			temp = temp >> 1;
			result = (result << 1) + 1;
		}
		//��ͬʱΪ0����ͬʱΪ1
		return num ^ result;
	}
	
	public static void main(String[] args) {
		Solution11001 solution = new Solution11001();
		int num1= 1;
		System.out.println(solution.findComplement(num1));
		
		int num2 = 5;
		System.out.println(solution.findComplement(num2));
	}
}
