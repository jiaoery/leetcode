package leetcode06;

/**
 * @ClassName: Solution0603.java
 * @Description:暴力法 时间复杂度O(n^2)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年7月21日 上午10:37:20
 */
public class Solution0603 {
	/**
	 * 额外增加数组
	 * @param nums 输入数组
	 * @param k    移动位数
	 * @return 返回的数组
	 */
	public static int[] rotate(int[] nums, int k) {
		int size = nums.length;
		k %= size;
		reverse(nums, 0, size-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, size-1);
		return nums;
	}
	
	/**
	 * 旋转数组
	 * @param nums
	 * @param start
	 * @param end
	 */
	public static void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start]= nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("before rotate :");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		int k = 3;
		System.out.println("k = " + k);
		int[] rotateNums = rotate(nums, k);
		System.out.print("before rotate :");
		for (int i = 0; i < rotateNums.length; i++) {
			System.out.print(rotateNums[i] + ",");
		}

	}
}
