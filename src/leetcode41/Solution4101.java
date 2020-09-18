package leetcode41;

/**
 * @ClassName: Solution4101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��18�� ����4:22:33
 */
public class Solution4101 {

	public int maxRotateFunction(int[] A) {
		int F = 0;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			//���sumֵ
			sum += A[i];
			//�������F0��ֵ
			F += i*A[i];
		}
		//���ֵ
		int max = F;
		//��F1��ʼ���
		for (int i = 1; i < A.length; i++) {
			//���չ�ʽ��F
			F += (sum - A.length*A[A.length-i]);
			max = Math.max(max, F);
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,6};
		int result = new Solution4101().maxRotateFunction(nums);
		System.out.println(result);
	}
}
