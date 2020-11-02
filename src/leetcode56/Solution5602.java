package leetcode56;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Solution5602.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月2日 上午11:43:35
 */
public class Solution5602 {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set1.contains(nums2[i]) && !set2.contains(nums2[i])) {
				set2.add(nums2[i]);
			}
		}
		int[] result = new int[set2.size()];
		int index = 0;
		for (int set : set2) {
			result[index++] = set;
		}
		return result;

	}
}
