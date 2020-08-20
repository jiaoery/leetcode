package leetcode23;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution2303.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月20日 上午11:09:19
 */
public class Solution2303 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int n : nums) {
			// 将大于零的值置为负
			if (nums[Math.abs(n) - 1] > 0) {
				nums[Math.abs(n) - 1] *= -1;
			}
		}
		for(int i =0;i<nums.length;i++) {
			if(nums[i]>0) {
				result.add(i+1);
			}
		}
		return result;
	}
}
