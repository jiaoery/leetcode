package leetcode24;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution2402.java
 * @Description:额外空间法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月21日 上午10:36:54 
 */
public class Solution2402 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for(int n:nums) {
			if(nums[Math.abs(n)-1]>0) {
				nums[Math.abs(n)-1]*=-1;
			}else {//当前位置的索引位数组《0，重复，放入result结果中
				result.add(Math.abs(n));
			}
		}
		
		return result;
		
	}
}
