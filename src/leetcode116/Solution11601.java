package leetcode116;

/**
 * @ClassName: Solution11601.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��2��1�� ����5:46:45
 */
public class Solution11601 {
	public boolean hasAlternatingBits(int n) {
		while (n>0) {
			//ÿ��ȡ��һ��10����Ͻ��м��
			if(((n&1) ^ ((n>>1)&1))==1) {
				n>>=1;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution11601 solution = new Solution11601();
		int n1 = 5;
		System.out.println(solution.hasAlternatingBits(n1));
		
		int n2 = 21;
		System.out.println(solution.hasAlternatingBits(n2));
		
		int n3 = 7;
		System.out.println(solution.hasAlternatingBits(n3));
	}
}
