package leetcode17;

import java.util.Arrays;

/**
 * @ClassName: Solution1702.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月12日 上午10:55:12 
 */
public class Solution1702 {
	 public int findRepeatNumber(int[] nums) {
		 //先排序
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		 return -1;
	 }
	 
	
}
