package leetcode35;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Solution3501.java
 * @Description:逆序动态规划算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月9日 下午2:32:50 
 */
public class Solution3501 {

	public static List<Integer> getRow(int rowIndex) {
		Integer[] dp = new Integer[rowIndex+1];
		//全部填充为
		Arrays.fill(dp, 1);
		//从第三行开始规划
		for (int i = 2; i < dp.length; i++) {
			for(int j = i-1;j>0;j--) {
				dp[j] = dp[j] + dp[j-1];
			}
			System.out.println(Arrays.toString(dp));
		}
		return Arrays.asList(dp);
    }
	
	public static void main(String[] args) {
		System.out.println(getRow(5));
	}
}
