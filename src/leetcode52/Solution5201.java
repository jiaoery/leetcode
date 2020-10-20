package leetcode52;

import java.util.Arrays;

/**
 * @ClassName: Solution5201.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月20日 上午9:54:56
 */
public class Solution5201 {

	public static int[] productExceptSelf(int[] nums) {
		int length = nums.length;

		// 前缀
		int[] L = new int[length];
		// 后缀
		int[] R = new int[length];
		// 结果数组
		int[] result = new int[length];

		// 求解前缀
		L[0] = 1;
		for (int i = 1; i < length; i++) {
			L[i] = L[i - 1] * nums[i - 1];
		}
		

		// 求解后缀
		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = R[i + 1] * nums[i + 1];
		}
		

		// 结果数组
		for (int i = 0; i < length; i++) {
			result[i] = L[i] * R[i];
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println("Before:");
		System.out.println(Arrays.toString(nums));
		int[] result = productExceptSelf(nums);
		System.out.println("After:");
		System.out.println(Arrays.toString(result));
	}

}
