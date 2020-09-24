package leetcode44;

import java.util.Arrays;

/**
 * @ClassName: Solution4401.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��24�� ����3:04:05 
 */
public class Solution4401 {

	public static int[][] generateMatrix(int n) {
		//����洢
		int[][] nums = new int[n][n];
		//�������
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		int row = 0;
		int colomn = 0;
		//�ܴ�С
		int size = n*n;
		int direction = 0; 
		for (int i = 1; i <= size; i++) {
			nums[row][colomn] = i;
			//Ԥ����һ��λ����Ϣ
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
