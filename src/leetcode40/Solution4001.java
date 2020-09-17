package leetcode40;

/**
 * @ClassName: Solution4001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月17日 上午10:33:04
 */
public class Solution4001 {
	public int countBattleships(char[][] board) {
		//行
		int rows = board.length;
		//列
		int columns = board[0].length;
		//标记位
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//空位跳过
				if(board[i][j] == '.') {
					continue;
				} 
				//当前元素为X，上部元素也为X，身体
				if(i>0 && board[i-1][j]=='X') {
					System.out.println(board[i-1][j]);
					continue;
				}
				//当前元素为X，左部元素也为X，身体
				if(j>0 && board[i][j-1]=='X') {
					continue;
				}
				//符合头部，标记+1
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		char[][] board = 
				{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		int result = new Solution4001().countBattleships(board);
		System.out.println("result:"+result);
	}
}
