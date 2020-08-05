package leetcode13;

/**
 * @ClassName: Solution1302.java
 * @Description:不保存结果
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月5日 上午10:35:33
 */
public class Solution1302 {
	public static int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int one = nums[0];
		int two = Math.max(one, nums[1]);
		for (int i = 2; i < nums.length; i++) {
			int temp = two;
			two = Math.max(one+nums[i], two);
			one = temp;
		}
		return two;
	}
}
