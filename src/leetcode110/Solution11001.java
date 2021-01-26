package leetcode110;

/**
 * @ClassName: Solution1101.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年1月26日 上午10:54:24
 */
public class Solution11001 {
	public int findComplement(int num) {
		int temp = num;
		int result = 0;
		//取出所有位数的1
		while (temp > 0) {
			temp = temp >> 1;
			result = (result << 1) + 1;
		}
		//相同时为0，不同时为1
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
