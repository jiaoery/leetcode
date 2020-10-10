package leetcode48;

import java.util.Arrays;

/**
 * @ClassName: Solution4801.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月10日 上午10:45:42
 */
public class Solution4802 {

	public static void setZeroes(int[][] matrix) {
		// 是否首行首列为0
		boolean isRowzero = false, isColzero = false;
		// 判断第一列是否为0
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				isColzero = true;
				break;
			}
		}

		// 判断第一行是否为0
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				isRowzero = true;
				break;
			}
		}
		
		

		// 除第一行/列外，其他元素存在0，标记当前第一行，第一列对应元素为0
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		

		// 将第一行/列中元素为0的行/列置为0
		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		

		//重置第一行/列为0
		if (isRowzero) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}

		if (isColzero) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

	}
	
	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		System.out.println("before:");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		setZeroes(matrix);
		System.out.println("after:");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
