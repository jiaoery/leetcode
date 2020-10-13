package leetcode50;

/**
 * @ClassName: Solution4002.java
 * @Description:���ӻ���
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��13�� ����10:23:08 
 */
public class Solution5002 {
	
	int[] sums ; 
	
	public Solution5002(int[] nums) {
		this.sums = new int[nums.length+1];
		//Ĭ��sums[0]=0;
		for (int i = 0; i < nums.length; i++) {
			sums[i+1] = sums[i]+nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sums[j+1]-sums[i];
	}
}
