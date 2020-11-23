package leetcode73;

/**
 * @ClassName: Solution7301.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��23�� ����4:31:17
 */
public class Solution7301 {

	public boolean checkRecord(String s) {
		// ���ȱ��״̬
		int abort = 0;
		// ��ǳٵ�
		int late = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				abort++;
				// ���óٵ����
				late = 0;
				// ���ȱ�ڴ�������һ��
				if (abort > 1) {
					return false;
				}
				break;
			case 'L':
				late++;
				// �����ٵ�������������
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
