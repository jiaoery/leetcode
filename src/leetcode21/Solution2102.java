package leetcode21;

import java.util.Arrays;

/**
 * @ClassName: Solution1202.java
 * @Description:快速排序算法
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月18日 上午10:38:40
 */
public class Solution2102 {
	public int[] findErrorNums(int[] nums) {
		Arrays.sort(nums);
		int dup = -1, missing = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				dup = nums[i];
			} else if (nums[i + 1] > nums[i] + 1) {
				missing = nums[i] + 1;
			}
			System.out.println("missing :" +missing+" ,dup:"+dup);
		}
		//处理只有两个元素的特殊情况
		return new int[] {dup,nums[nums.length - 1] != nums.length ? nums.length : missing};
	}
	
	public static void main(String[] args) {
		new Solution2102().findErrorNums(new int[] {2,2});
	}

}
