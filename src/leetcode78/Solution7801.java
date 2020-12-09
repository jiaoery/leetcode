package leetcode78;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName: Solution7801.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月9日 上午11:05:32 
 */
public class Solution7801 {

	 public String[] findRelativeRanks(int[] nums) {
		 String[] res = new String[nums.length];
		 
		 HashMap< Integer, Integer> map =  new HashMap<Integer, Integer>();
		 //统计数据
		 for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		 Arrays.sort(nums);
		 int rink = 1;
		 for (int i = nums.length-1; i >= 0; i--) {
			if(i == nums.length-1) {
				res[map.get(nums[i])]="Gold Medal";
			}else if (i == nums.length -2) {
				res[map.get(nums[i])]="Silver Medal";
			}else if (i == nums.length -3) {
				res[map.get(nums[i])]="Bronze Medal";
			}else {
				res[map.get(nums[i])]= rink+"";
			}
			rink++;
			}
		 return res;
		}
	 
	 public static void main(String[] args) {
		Solution7801 sol = new Solution7801();
		int[] rinks = {4, 5, 3, 2, 5};
		System.out.println(Arrays.toString(sol.findRelativeRanks(rinks)));
	}
	 
}
