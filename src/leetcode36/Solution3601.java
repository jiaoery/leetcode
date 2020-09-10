package leetcode36;

import java.util.Arrays;

/**
 * @ClassName: Solution3601.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��10�� ����11:14:47
 */
public class Solution3601 {

	public static int[][] imageSmoother(int[][] M) {
		//����
		int rows = M.length;
		//����
		int column = M[0].length;
		int[][] result = new int[rows][column];
		//�ֱ��������
		for(int i = 0 ;i<rows;i++) {
			for(int j = 0;j<column;j++) {
				int count = 0;
				//ֻȡǰ����
				for (int kr = i-1; kr <=i+1; kr++) {
					for (int kc = j-1; kc <= j+1; kc++) {
						//�жϱ߼�����
						if(kr>=0 && kc>=0&& kr<rows&&kc<column) {
							result[i][j]+=M[kr][kc];
							count++;
						}
					}
				}
				//��ȡƽ��ֵ
				result[i][j]/=count;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[][] test = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
		int[][] result = imageSmoother(test);
		System.out.println("before:"+Arrays.toString(test)+",after:"+Arrays.toString(result));
	}
}
