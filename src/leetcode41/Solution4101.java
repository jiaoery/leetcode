package leetcode41;

/**
 * @ClassName: Solution4101.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月18日 下午4:22:33
 */
public class Solution4101 {

	public int maxRotateFunction(int[] A) {
		int F = 0;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			//求解sum值
			sum += A[i];
			//这里求解F0的值
			F += i*A[i];
		}
		//最大值
		int max = F;
		//从F1开始求解
		for (int i = 1; i < A.length; i++) {
			//按照公式求F
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
