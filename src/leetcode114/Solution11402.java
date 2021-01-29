package leetcode114;

/**
 * @ClassName: Solution11402.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��29�� ����2:29:38 
 */
public class Solution11402 {
	public int totalHammingDistance(int[] nums) {
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			int zero  = 0;
			int one  = 0;
			for (int num :nums) {
				if((num&1<<i) == (1<<i)) {
					one++;
				}else {
					zero++;
				}
			}
			sum+=one*zero;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Solution11402 solution =  new Solution11402();
		int[] nums1 = {4, 14, 2};
		System.out.println(solution.totalHammingDistance(nums1));
	}
}
