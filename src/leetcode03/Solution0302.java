package leetcode03;

import java.util.Arrays;

/**
 * @ClassName: Solution0302.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年1月28日 上午10:51:21
 */
public class Solution0302 {
	public static int pivotIndex(int[] nums) {
		int sum = 0;
		int size = nums.length;
		if (size == 0) {
			return -1;
		}
		int[] dpl = new int[size];
		for (int i = 0; i < size; i++) {
			sum += nums[i];
			dpl[i] = sum;
		}

		for (int i = 0; i < size; i++) {
			if (sum - dpl[i]  == dpl[i]- nums[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int mark = pivotIndex(nums);
		System.out.println("model nums mark is " + mark);

		int[] nums1 = {};
		int mark1 = pivotIndex(nums1);
		System.out.println("model nums mark is " + mark1);

		int[] nums2 = { 2, 3, 2 };
		int mark2 = pivotIndex(nums2);
		System.out.println("model nums mark is " + mark2);
	}
}
