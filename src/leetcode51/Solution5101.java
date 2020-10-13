package leetcode51;

/**
 * @ClassName: Solution5101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��13�� ����1:46:27 
 */
public class Solution5101 {

	private int[][] data;

    public Solution5101(int[][] matrix) {
        this.data = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
		for (int row = row1; row <= row2; row++) {
			for (int col = col1; col <= col2; col++) {
				sum += data[row][col];
			}
		}
		return sum;
    }
}
