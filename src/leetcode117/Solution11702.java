package leetcode117;

import java.util.Arrays;

/**
 * @ClassName: Solution111702.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年2月4日 上午10:55:11
 */
public class Solution11702 {
	public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		if (size < k) {
			return 0;
		}
		// 动态规划数组
		int[] dp = new int[size+1];
		dp[0] = 0;
		for (int i = 1; i < size+1; i++) {
			dp[i] = dp[i - 1] + nums[i-1];
		}
	
		int max = Integer.MIN_VALUE;
		for (int i = size; i >k-1; i--) {
			max = Math.max(dp[i]-dp[i-k], max);
		}
		return (double)max/k;
	}
	
	public static void main(String[] args) {
		Solution11702 solution =  new Solution11702();
		int[] nums1 = {1,12,-5,-6,50,3};int k1 = 4;
		System.out.println(solution.findMaxAverage(nums1, k1));
		
		int[] nums2 = {5};int k2 = 1;
		System.out.println(solution.findMaxAverage(nums2, k2));
		
		int[] nums3 = {-1};int k3 = 1;
		System.out.println(solution.findMaxAverage(nums3, k3));
	}
}
