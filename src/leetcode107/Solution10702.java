package leetcode107;

/**
 * @ClassName: Solution10702.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月20日 上午10:43:12 
 */
public class Solution10702 {
	public int maximumProduct(int[] nums) {
		int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			//若是比最小值还小
			if(min1>nums[i]) {
				min2 = min1;
				min1 = nums[i];		
			}else if(min2>nums[i]) {
				//大于最小数，小于第二小数
				min2 = nums[i];		
			}
			
			if(max1<nums[i]) {
				max3 = max2;
				max2 = max1;
				max1 = nums[i];
			}else if (max2<nums[i]) {
				max3 = max2;
				max2 = nums[i];
			}else if (max3<nums[i]) {
				max3 = nums[i];
			}
		}
		return Math.max(min1*min2*max1, max1*max2*max3);
	}
	
	public static void main(String[] args) {
		Solution10702 solution = new Solution10702();
		int[] nums1 = {1,2,3};
		System.out.println(solution.maximumProduct(nums1));
		
		int[] nums2 = {-4,-5,3,4,5};
		System.out.println(solution.maximumProduct(nums2));
		
		int[] nums3 = {-5,-4,-3,-2,-1,0};
		System.out.println(solution.maximumProduct(nums3));
	}
}
