package leetcode49;

import java.util.Arrays;

/**
 * @ClassName: Solution4901.java
 * @Description:暴力解法
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月12日 上午11:39:04
 */
public class Solution4901 {

	public static void gameOfLife(int[][] board) {
		// 区间区域
		int[] neighbors = { 0, 1, -1 };
		// copy副本
		int[][] copy = new int[board.length][board[0].length];
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[0].length; j++) {
				copy[i][j] = board[i][j];
			}
		}
		// 遍历面板每一个格子里的细胞
		for (int row = 0; row < copy.length; row++) {
			for (int col = 0; col < copy[0].length; col++) {
				// 记录相邻数据
				int neighbor = 0;
				for (int i = 0; i < neighbors.length; i++) {
					for (int j = 0; j < neighbors.length; j++) {
						if (neighbors[i] != 0 || neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = col + neighbors[j];
							// 边界条件判断
							if (r >= 0 && r < board.length && c >= 0 && c < board[0].length && copy[r][c] == 1) {
								neighbor++;
							}

						}
					}
				}
				// 情况1 3
				if (board[row][col]==1&&(neighbor < 2 || neighbor > 3)) {
					board[row][col] = 0;
				}
				// 情况3
				if (board[row][col]==0 && neighbor == 3) {
					board[row][col] = 1;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[][] nums = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		System.out.println("Before:");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
		
		gameOfLife(nums);
		
		System.out.println("After");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}
}
