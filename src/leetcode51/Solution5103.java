package leetcode51;

/**
 * @ClassName: Solution.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年10月13日 下午2:22:34 
 */
public class Solution5103 {
	
	private int[][] sums;
	
	public Solution5103(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0) return;
		sums = new int[matrix.length+1][matrix[0].length+1];
		//动态规划数组
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sums[i+1][j+1] = sums[i+1][j] + sums[i][j+1] + matrix[i][j] - sums[i][j];
			}
		}
	}
	 
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
		return sums[row2+1][col2+1] - sums[row1][col2+1] - sums[row2+1][col1] + sums[row1][col1];			
	}
	
	
}
