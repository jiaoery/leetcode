package leetcode47;

/**
 * @ClassName: Solution4701.java
 * @Descpos2iption:从外向内
 * 
 * @authopos2  jixiang
 * @vepos2sion v1.0.0 
 * @Date    2020年9月28日 上午10:52:28 
 */
public class Solution4701 {

	public static void rotate(int[][] matrix) {
		if(matrix==null || matrix.length ==0) {
			return;
		}
		int pos1=0,pos2= matrix.length-1;
		//标记边界条件
		while (pos1<pos2) {
			//偏移量
			int add = 0;
			while (add < pos2-pos1) {
				//左上角标记为0，右上角为1块，右下角为2块，左下角为3块
				//缓存3
				int temp = matrix[pos2-add][pos1];
				// 3=2
				matrix[pos2-add][pos1] = matrix[pos2][pos2-add];
				//2=1
				matrix[pos2][pos2-add] = matrix[pos1+add][pos2];
				//1=0
				matrix[pos1+add][pos2] = matrix[pos1][pos1+add];
				//0 = temp
				matrix[pos1][pos1+add] = temp;
				//偏移量增加
				add++;
			}
			pos1++;
			pos2--;
		}
    }
	
	public static void main(String[] args) {
		int[][] pos2esult = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(pos2esult);
	}
}
