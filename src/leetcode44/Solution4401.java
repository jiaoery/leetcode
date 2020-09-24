package leetcode44;

import java.util.Arrays;

/**
 * @ClassName: Solution4401.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月24日 下午3:04:05 
 */
public class Solution4401 {

	public static int[][] generateMatrix(int n) {
		//结果存储
		int[][] nums = new int[n][n];
		//方向矩阵
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		int row = 0;
		int colomn = 0;
		//总大小
		int size = n*n;
		int direction = 0; 
		for (int i = 1; i <= size; i++) {
			nums[row][colomn] = i;
			//预计下一个位置信息
			int nextRow = row + directions[direction][0];
			int nextColomn = colomn +directions[direction][1];
			if(nextColomn<0||nextColomn>=n||nextRow<0||nextRow>=n||nums[nextRow][nextColomn]!=0) {
				direction = (direction+1)%4;
			}
			row+=directions[direction][0];
			colomn+=directions[direction][1];
		}
		return nums;
    }
	
	public static void main(String[] args) {
		int[][] nums = generateMatrix(3);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
	}
}
