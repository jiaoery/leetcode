package leetcode03;

/**
 * @ClassName: Soluition0303.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年2月18日 上午11:25:17 
 */
public class Soluition0303 {
	
	 public static int pivotIndex(int[] nums) {
		 int sum =0;
		 for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		 int target = 0;
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
			if(target == sum) {
				return i;
			}
			target +=nums[i];
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
