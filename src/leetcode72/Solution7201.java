package leetcode72;

/**
 * @ClassName: Solution7201.java
 * @Description:方向解析
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月23日 下午2:53:56
 */
public class Solution7201 {

	public boolean judgeCircle(String moves) {
		// 机器人坐标
		int x = 0, y = 0;
		for (int i = 0; i < moves.length(); i++) {
			char ch = moves.charAt(i);
			switch (ch) {
			case 'U':
				y-= 1;
				break;
			case 'D':
				y+= 1;
				break;
			case 'L':
				x -=1;
				break;
			case 'R':
				x +=1;
				break;
			default:
				break;
			}
		}
		return x==0&&y==0;
	}
	
	public static void main(String[] args) {
		Solution7201 sol = new Solution7201();
		String commad = "UD";
		System.out.println("IsCircle :" +commad + sol.judgeCircle(commad));
		
		String commad1 = "LL";
		System.out.println("IsCircle :" +commad1 + sol.judgeCircle(commad1));
	}
}
