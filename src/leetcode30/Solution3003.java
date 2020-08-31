package leetcode30;


/**
 * @ClassName: Solution3003.java
 * @Description:数学法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月31日 下午2:17:31 
 */
public class Solution3003 {
	 public int minMoves(int[] nums) {
		 int min =Integer.MAX_VALUE;
		 int count = 0;
		 //寻找数组种最小值
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		//运算移动次数
		for (int i = 0; i < nums.length; i++) {
			count += nums[i]-min;
		}
		return count;
	 }
	 
	 
	 public static void main(String[] args) {
			int[] nums = {1,2,3,999};
			System.out.println("result:"+new Solution3001().minMoves(nums));
		}

}
