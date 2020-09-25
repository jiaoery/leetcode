package leetcode45;

import java.util.Arrays;

/**
 * @ClassName: Solution4501.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月25日 下午2:46:06
 */
public class Solution4501 {

	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[] {};
		}
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		//当前行列
		int row = 0;
		int column = 0;
		//循环次数
		int turn = rows+columns-1;
		int[] result = new  int[rows*columns];
		//当前项
		int index = 0;
		for (int i = 0; i < turn; i++) {
			//偶数向上
			if((row+column)%2==0) {
				while (row >= 0&& column<columns) {
					result[index++] = matrix[row][column];
					column++;
					row--;
				}
				//顶部出界
				if(column<columns) {
					row++;
				}else {//右边出界
					column--;
					row+=2;
				}
			}else {//奇数向下
				while (column >= 0 && row<rows ) {
					result[index++]=matrix[row][column];
					column--;
					row++;	
				}
				//左边出界
				if(row<rows) {
					column++;
				}else{//底部出界
					column+=2;
					row--;
				}
			}
		}
		return result;

	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[] result = findDiagonalOrder(matrix);
		System.out.println(Arrays.toString(result));
	}

}
