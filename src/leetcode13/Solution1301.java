package leetcode13;

/**
 * @ClassName: Solution1301.java
 * @Description:动态规划算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月5日 上午10:31:35 
 */
public class Solution1301 {
	public static int rob(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        if(nums.length ==1){
            return nums[0];
        }
        int length = nums.length;
        int[] dp = new int[length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
         for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }
	
	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		int rob = rob(nums);
		System.out.println("nums :"+rob);
	}
}
