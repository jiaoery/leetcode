package leetcode50;

/**
 * @ClassName: Solution5001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��10��13�� ����10:14:37
 */
public class Solution5001 {
	
	private int[] data;
	
	public Solution5001(int[] nums) {
		this.data = nums;
	}

	public int sumRange(int i, int j) {
		int sumary = 0;
		for (int k = i; k <= j; k++) {
			sumary += data[k];
		}
		return sumary;
	}
}
