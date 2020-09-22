package leetcode42;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution4201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��22�� ����10:37:39
 */
public class Solution4201 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		//�п�
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return result;
		}
		//����
		int rows = matrix.length;
		int columns =  matrix[0].length;
		//��Ǿ���
		boolean[][] remark = new boolean[rows][columns];
		//��Ԫ�ظ���
		int size = rows*columns;
		int row = 0,column = 0;
		int directionIndex = 0;
		//������� �ֱ�Ϊ ���ң����£���������
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		for (int i = 0; i < size; i++) {
			result.add(matrix[row][column]);
			remark[row][column]= true;
			//���߼�����
			int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
			if(nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||remark[nextRow][nextColumn]==true) {
				//��ת����
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
