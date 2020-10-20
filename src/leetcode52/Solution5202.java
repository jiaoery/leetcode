package leetcode52;

import java.util.Arrays;

/**
 * @ClassName: Solution5202.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��20�� ����10:37:52 
 */
public class Solution5202 {

	public static int[] productExceptSelf(int[] nums) {
		int length = nums.length;

		// �������
		int[] result = new int[length];

		// ���ǰ׺
		result[0] = 1;
		for (int i = 1; i < length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		// ����׺�����
		int r = 1;
		for (int i = length - 1; i >= 0; i--) {
			result[i] = r*result[i];
			r = r * nums[i];		
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
