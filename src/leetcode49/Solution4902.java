package leetcode49;

import java.util.Arrays;

/**
 * @ClassName: Solution14902.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��10��12�� ����4:00:32
 */
public class Solution4902 {

	public static void gameOfLife(int[][] board) {
		// ��������
		int[] neighbors = { 0, 1, -1 };
		// �������нڵ�
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				// ͳ�Ʒ�������
				int neighbor = 0;
				for (int i = 0; i < neighbors.length; i++) {
					for (int j = 0; j < neighbors.length; j++) {
						// ������ǰ�ڵ�
						if (neighbors[i] != 0 || neighbors[j] != 0) {
							int r = row + neighbors[i];
							int c = col + neighbors[j];
							// �߼������ж�
							if (r >= 0 && r < board.length && c >= 0 && c < board[0].length
									&& Math.abs(board[r][c]) == 1) {
								neighbor++;
							}
						}
					}
				}

				// ���1 3 ���ɻ�ת�������Ϊ-1
				if ((board[row][col] == 1) && (neighbor > 3 || neighbor < 2)) {
					board[row][col] = -1;
				}

				// ���4������ת�������Ϊ2
				if (board[row][col] == 0 && neighbor == 3) {
					board[row][col] = 2;
				}
			}
		}

		// ���ݱ��λ���¸�ֵ
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
