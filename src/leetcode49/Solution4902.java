package leetcode49;

import java.util.Arrays;

/**
 * @ClassName: Solution4902.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月12日 下午4:00:32
 */
public class Solution4902 {

	public static void gameOfLife(int[][] board) {
		// 区间区域
		int[] neighbors = { 0, 1, -1 };
		// 遍历所有节点
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				// 统计发生次数
				int neighbor = 0;
				for (int i = 0; i < neighbors.length; i++) {
					for (int j = 0; j < neighbors.length; j++) {
						// 除开当前节点
						if (neighbors[i] != 0 || neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = col + neighbors[j];
							// 边际条件判断
							if (r >= 0 && r < board.length && c >= 0 && c < board[0].length
									&& Math.abs(board[r][c]) == 1) {
								neighbor++;
							}
						}
					}
				}

				// 情况1 3 ；由活转死，标记为-1
				if ((board[row][col] == 1) && (neighbor > 3 || neighbor < 2)) {
					board[row][col] = -1;
				}

				// 情况4，由死转生，标记为2
				if (board[row][col] == 0 && neighbor == 3) {
					board[row][col] = 2;
				}
			}
		}

		// 根据标记位重新赋值
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col] == 2) {
					board[row][col] = 1;
				} else if (board[row][col] == -1) {
					board[row][col] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] nums = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
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
