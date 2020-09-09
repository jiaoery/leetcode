package leetcode35;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Solution3501.java
 * @Description:����̬�滮�㷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��9�� ����2:32:50 
 */
public class Solution3501 {

	public static List<Integer> getRow(int rowIndex) {
		Integer[] dp = new Integer[rowIndex+1];
		//ȫ�����Ϊ
		Arrays.fill(dp, 1);
		//�ӵ����п�ʼ�滮
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
