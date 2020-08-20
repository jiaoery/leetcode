package leetcode23;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution2303.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��20�� ����11:09:19
 */
public class Solution2303 {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int n : nums) {
			// ���������ֵ��Ϊ��
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
