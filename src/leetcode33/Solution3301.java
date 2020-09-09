package leetcode33;

import java.util.Arrays;

/**
 * @ClassName: Solution3301.java
 * @Description:双指针算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月8日 下午4:43:07 
 */
public class Solution3301 {

	public static void moveZeroes(int[] nums) {
		if(nums==null||nums.length <=1) {
			return ;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			//i取非零数组
			if(nums[i]!=0) {
				if(i>j) {
					nums[j] = nums[i];
					nums[i]=0;
				}
				//保证非零情况下同步移动
				j++;
			}
		}
    }
	
	
	public static void main(String[] args) {
		int[] nums = {1,0,0,1};
		System.out.println("nums before :" + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("after:"+Arrays.toString(nums));
		
	}
}
