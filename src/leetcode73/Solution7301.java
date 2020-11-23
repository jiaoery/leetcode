package leetcode73;

/**
 * @ClassName: Solution7301.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月23日 下午4:31:17
 */
public class Solution7301 {

	public boolean checkRecord(String s) {
		// 标记缺勤状态
		int abort = 0;
		// 标记迟到
		int late = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				abort++;
				// 重置迟到标记
				late = 0;
				// 如果缺勤次数超过一次
				if (abort > 1) {
					return false;
				}
				break;
			case 'L':
				late++;
				// 连续迟到次数超过两次
				if (late > 2) {
					return false;
				}
				break;
			case 'P':
				late = 0;
				break;
			default:
				break;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution7301 sol = new Solution7301();
		String status = "PPALLP";
		System.out.println(status+":"+sol.checkRecord(status));
		
		String status1 = "PPALLL";
		System.out.println(status1+":"+sol.checkRecord(status1));
	}
}
