package leetcode56;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution5601.java
 * @Description:纯暴力法
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月2日 上午11:27:59
 */
public class Solution5601 {

	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
					list.add(nums1[i]);
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
