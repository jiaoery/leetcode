package leetcode88;

/**
 * @ClassName: Solution8802.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月21日 下午2:12:54 
 */
public class Solution8802 {
	public int minCostClimbingStairs(int[] cost) {
		int p1 = cost[0];
		int p2 = cost[1];
		//动态规划
		for (int i = 2; i < cost.length; i++) {
			int min = Math.min(p1+cost[i], p2+cost[i]);
			p1 = p2;
			p2 = min;
		}
		return Math.min(p1, p2);
    }
}
