package leetcode51;

/**
 * @ClassName: Solution5102.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月13日 下午1:57:19
 */
public class Solution5102 {
	
	private int[][] sums;

	public Solution5102(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) return;
		sums = new int[matrix.length][matrix[0].length+1];
		//动态规划算法
		 for (int r = 0; r < matrix.length; r++) {
		        for (int c = 0; c < matrix[0].length; c++) {
		        	sums[r][c + 1] = sums[r][c] + matrix[r][c];
		        }
		    }
	}
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		for (int i = row1; i <= row2; i++) {
			sum += sums[i][col2+1] - sums[i][col1];
		}
		return sum;
	}
	
}
