package leetcode48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Solution4801.java
 * @Description:引入额外空间
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年10月10日 上午11:14:41 
 */
public class Solution4801 {
	
	public static void setZeroes(int[][] matrix) {
		//记录包含0元素的行列
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> cols = new ArrayList<Integer>();
		
		//记录
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		//赋值
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(rows.contains(i)||cols.contains(j)) {
					matrix[i][j] = 0;
				}
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
