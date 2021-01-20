package leetcode107;

import java.util.Arrays;

/**
 * @ClassName: Solution10701.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��20�� ����10:32:03 
 */
public class Solution10701 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		//���ڸ���ʱ����������������������
		int p = nums[0]*nums[1]*nums[nums.length-1];
		//ȫΪ����������£�������������˻����
		int q = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		return Math.max(p, q);
    }
	
	public static void main(String[] args) {
		Solution10701 solution = new Solution10701();
		int[] nums1 = {1,2,3};
		System.out.println(solution.maximumProduct(nums1));
		
		int[] nums2 = {-4,-5,3,4,5};
		System.out.println(solution.maximumProduct(nums2));
		
		int[] nums3 = {-5,-4,-3,-2,-1,0};
		System.out.println(solution.maximumProduct(nums3));
	}
}
