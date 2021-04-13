package leetcode120;

import java.util.Arrays;

/**
 * ClassName: Solution12001<br/>
 * Description: 动态规划算法
 * date: 2021/4/13 15:22<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution12001 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return Integer.MIN_VALUE;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution12001 solution12001 =  new Solution12001();
        int[] nums1 ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution12001.maxSubArray(nums1));
    }
}
