package leetcode88;

import java.util.Arrays;

/**
 * @ClassName: Solution8801.java
 * @Description:动态规划
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月21日 下午2:04:43 
 */
public class Solution8801 {

	public int minCostClimbingStairs(int[] cost) {
		int[] dp =  new int[cost.length];
		dp[0]= cost[0];
		dp[1]= cost[1];
		//动态规划
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i-1]+cost[i], dp[i-2]+cost[i]);
		}
		return Math.min(dp[dp.length-1], dp[dp.length-2]);
    }
	
	public static void main(String[] args) {
		Solution8801 solution8801 = new Solution8801();
		int[] cost1 = {10, 15, 20};
		System.out.println("cost:"+Arrays.toString(cost1)+",result:"+solution8801.minCostClimbingStairs(cost1));
		
		int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println("cost:"+Arrays.toString(cost2)+",result:"+solution8801.minCostClimbingStairs(cost2));
	}
}
