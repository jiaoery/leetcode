package leetcode17;

import java.util.Arrays;

/**
 * @ClassName: Solution1702.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��12�� ����10:55:12 
 */
public class Solution1702 {
	 public int findRepeatNumber(int[] nums) {
		 //������
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		 return -1;
	 }
	 
	
}
