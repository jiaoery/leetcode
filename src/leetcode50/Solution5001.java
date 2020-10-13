package leetcode50;

/**
 * @ClassName: Solution5001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年10月13日 上午10:14:37
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
