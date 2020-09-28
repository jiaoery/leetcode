package leetcode47;

/**
 * @ClassName: Solution4702.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月28日 上午11:28:59
 */
public class Solution4702 {

	public static void rotate(int[][] matrix) {
		// transpose matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int tmp = matrix[j][i];
		        matrix[j][i] = matrix[i][j];
		        matrix[i][j] = tmp;
			}
		}
	
		

		// reverse each row
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int[][] result = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(result);
	}
}
