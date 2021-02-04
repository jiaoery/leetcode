package leetcode117;

/**
 * @ClassName: Solution11701.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年2月4日 上午10:44:14
 */
public class Solution11701 {
	public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		// 特殊条件
		if (size < k) {
			return 0;
		}
		// 滑动窗口
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size - k+1; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += nums[i + j];
			}
			max = Math.max(max, sum);
		}
		return (float)max/k;
	}
	
	
	public static void main(String[] args) {
		Solution11701 solution =  new Solution11701();
		int[] nums1 = {1,12,-5,-6,50,3};int k1 = 4;
		System.out.println(solution.findMaxAverage(nums1, k1));
		
		int[] nums2 = {5};int k2 = 1;
		System.out.println(solution.findMaxAverage(nums2, k2));
		
		int[] nums3 = {-1};int k3 = 1;
		System.out.println(solution.findMaxAverage(nums3, k3));
	}
}
