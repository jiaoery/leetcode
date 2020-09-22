package leetcode42;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution4201.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月22日 上午10:37:39
 */
public class Solution4201 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		//判空
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return result;
		}
		//行列
		int rows = matrix.length;
		int columns =  matrix[0].length;
		//标记矩阵
		boolean[][] remark = new boolean[rows][columns];
		//总元素个数
		int size = rows*columns;
		int row = 0,column = 0;
		int directionIndex = 0;
		//方向矩阵 分别为 向右，向下，向左，向上
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		for (int i = 0; i < size; i++) {
			result.add(matrix[row][column]);
			remark[row][column]= true;
			//检查边际条件
			int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
			if(nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||remark[nextRow][nextColumn]==true) {
				//旋转方向
				directionIndex = (directionIndex + 1) % 4;
			}
			row += directions[directionIndex][0];
			column += directions[directionIndex][1];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> result = new Solution4201().spiralOrder(nums);
		System.out.println(result);
	}
}
