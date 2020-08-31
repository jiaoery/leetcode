package leetcode30;

import java.util.Arrays;

/**
 * @ClassName: Solution3002.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��31�� ����11:25:27
 */
public class Solution3002 {

	public int minMoves(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count += nums[i] - nums[0];
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println("result:" + new Solution3001().minMoves(nums));
	}
}
