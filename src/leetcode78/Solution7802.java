package leetcode78;

import java.util.Arrays;

/**
 * @ClassName: Solution7802.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年12月9日 上午11:22:40
 */
public class Solution7802 {

	public String[] findRelativeRanks(int[] nums) {
		int max = 0;
		// 求取最大值
		for (int i = 0; i < nums.length; i++) {
			max = nums[i] > max ? nums[i] : max;
		}
		int[] rinks = new int[max + 1];
		// 插入排序
		for (int i = 0; i < nums.length; i++) {
			rinks[nums[i]] = i+1;
		}
		int rink = 1;
		String[] res = new String[nums.length];
		System.out.println(Arrays.toString(rinks));
		for (int i = rinks.length - 1; i >= 0; i--) {
			if (rinks[i] > 0) {
				if (rink == 1) {
					res[rinks[i]-1] = "Gold Medal";
				} else if (rink == 2) {
					res[rinks[i]-1] = "Silver Medal";
				} else if (rink == 3) {
					res[rinks[i]-1] = "Bronze Medal";
				} else {
					res[rinks[i]-1] = rink + "";
				}
				rink++;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		Solution7802 sol = new Solution7802();
		int[] rinks = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(sol.findRelativeRanks(rinks)));
	}
}
