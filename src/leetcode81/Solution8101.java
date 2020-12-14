package leetcode81;

/**
 * @ClassName: Solution8001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��12��14�� ����11:22:39
 */
public class Solution8101 {

	/**
	 * 
	 * @param n ÿ�μ��м���
	 * @param k Ŀ��Ϳ�ڸ���
	 * @return ��������
	 */
	public int paintingPlan(int n, int k) {
		// Ϊ�����ȫ��Ϳ����ֻ��һ�ַ���
		if (k == 0 || n * n == k) {
			return 1;
		}
		// ��ΪͿһ�к�һ�У���������n���ڸ�
		if (n > k) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if(i*n+j*n-i*j==k) {
					System.out.println(i+","+j+","+C(n,i)+","+C(n,j));
					result+= C(n,i)*C(n,j);
				}
			}
		}
		return result;
	}
	
	/**
	 * ������Cxy
	 * @param x ����
	 * @param y С��
	 * @return
	 */
	 public int C(int x,int y){
	        if(y == 0)return 1;
	        int n = 1;
	        for(int i = 0;i < y;i++){
	            n *= (x - i);
	        }
	        for(int i = 1;i <= y;i++){
	            n /= i;
	        }
//	        System.out.println(n);
	        return n;
	    }
	 
	 
	 public static void main(String[] args) {
		Solution8101 solution8101 =  new Solution8101();
		System.out.println(solution8101.paintingPlan(2, 4));
	}
}
