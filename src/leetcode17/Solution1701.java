package leetcode17;

import java.util.HashMap;


/**
 * @ClassName: Solution1701.java
 * @Description:������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��12�� ����10:33:12
 */
public class Solution1701 {
	public int findRepeatNumber(int[] nums) {
		if (nums == null) {
			return 0;
		}
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hashMap.containsKey(nums[i])) {
				return nums[i];
			}else {
				hashMap.put(nums[i], 1);
			}
		}
		return -1;
	}
}
