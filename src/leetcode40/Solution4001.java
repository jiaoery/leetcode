package leetcode40;

/**
 * @ClassName: Solution4001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��17�� ����10:33:04
 */
public class Solution4001 {
	public int countBattleships(char[][] board) {
		//��
		int rows = board.length;
		//��
		int columns = board[0].length;
		//���λ
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//��λ����
				if(board[i][j] == '.') {
					continue;
				} 
				//��ǰԪ��ΪX���ϲ�Ԫ��ҲΪX������
				if(i>0 && board[i-1][j]=='X') {
					System.out.println(board[i-1][j]);
					continue;
				}
				//��ǰԪ��ΪX����Ԫ��ҲΪX������
				if(j>0 && board[i][j-1]=='X') {
					continue;
				}
				//����ͷ�������+1
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
