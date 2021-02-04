package leetcode117;

/**
 * @ClassName: Solution11703.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年2月4日 上午11:35:26 
 */
public class Solution11703 {
	public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		if (size < k) {
			return 0;
		}
		int sum=0;
		//从零到k
		for (int i = 0; i <k; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		if(size==k) {
			return (double)sum/k;
		}
		int max =sum;
		for (int i = k; i < size; i++) {
			//前方移除一位，后方加上一位
			sum += nums[i]-nums[i-k];
			max = Math.max(sum, max);
			System.out.println(max);
		}
		System.out.println(max);
		return (double)max/k;
	}
	
	public static void main(String[] args) {
		Solution11703 solution =  new Solution11703();
//		int[] nums1 = {1,12,-5,-6,50,3};int k1 = 4;
//		System.out.println(solution.findMaxAverage(nums1, k1));
//		
//		int[] nums2 = {5};int k2 = 1;
//		System.out.println(solution.findMaxAverage(nums2, k2));
//		
//		int[] nums3 = {-1};int k3 = 1;
//		System.out.println(solution.findMaxAverage(nums3, k3));
		
		int[] nums4 = {9,7,3,5,6,2,1,8,1,9};int k4 = 6;
		System.out.println(solution.findMaxAverage(nums4, k4));
	}
	
	
}
