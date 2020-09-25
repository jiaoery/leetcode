package leetcode45;

import java.util.Arrays;

/**
 * @ClassName: Solution4501.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��25�� ����2:46:06
 */
public class Solution4501 {

	public static int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[] {};
		}
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		//��ǰ����
		int row = 0;
		int column = 0;
		//ѭ������
		int turn = rows+columns-1;
		int[] result = new  int[rows*columns];
		//��ǰ��
		int index = 0;
		for (int i = 0; i < turn; i++) {
			//ż������
			if((row+column)%2==0) {
				while (row >= 0&& column<columns) {
					result[index++] = matrix[row][column];
					column++;
					row--;
				}
				//��������
				if(column<columns) {
					row++;
				}else {//�ұ߳���
					column--;
					row+=2;
				}
			}else {//��������
				while (column >= 0 && row<rows ) {
					result[index++]=matrix[row][column];
					column--;
					row++;	
				}
				//��߳���
				if(row<rows) {
					column++;
				}else{//�ײ�����
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
