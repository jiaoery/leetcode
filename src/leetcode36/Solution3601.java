package leetcode36;

import java.util.Arrays;

/**
 * @ClassName: Solution3601.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月10日 上午11:14:47
 */
public class Solution3601 {

	public static int[][] imageSmoother(int[][] M) {
		//行数
		int rows = M.length;
		//列数
		int column = M[0].length;
		int[][] result = new int[rows][column];
		//分别遍历行列
		for(int i = 0 ;i<rows;i++) {
			for(int j = 0;j<column;j++) {
				int count = 0;
				//只取前后数
				for (int kr = i-1; kr <=i+1; kr++) {
					for (int kc = j-1; kc <= j+1; kc++) {
						//判断边际条件
						if(kr>=0 && kc>=0&& kr<rows&&kc<column) {
							result[i][j]+=M[kr][kc];
							count++;
						}
					}
				}
				//求取平均值
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
