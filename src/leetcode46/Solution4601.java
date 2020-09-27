package leetcode46;

import java.util.Arrays;

/**
 * @ClassName: Solution4601.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��27�� ����2:30:33
 */
public class Solution4601 {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums == null||nums.length ==0) {
			return new int[][] {};
		}
		int rows = nums.length;
		int columns = nums[0].length;
		//�Ƿ������reshape
		if(r*c!=rows*columns) {
			return nums;
		}
		int[][] result = new int[r][c];
		//���ֵ
		for (int i = 0; i < rows*columns; i++) {
			result[i/c][i%c] = nums[i/columns][i%columns];
		}
		
		return result;

	}
	
	
	public static void main(String[] args) {
		int[][] nums = {{1,2},{3,4}};
		int[][] result =  new Solution4601().matrixReshape(nums, 1, 4);
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		
	}
}
