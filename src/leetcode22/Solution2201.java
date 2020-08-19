package leetcode22;

import java.util.Collections;
import java.util.HashMap;

/**
 * @ClassName: leetcode2201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月19日 下午2:35:46 
 */
public class Solution2201 {
	public int findShortestSubArray(int[] nums) {
		//保存左右位置参数以及元素出现次数
		HashMap<Integer, Integer> start =new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> end = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		//统计数据
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			//未含有则保存
			if(!start.containsKey(key)) {
				start.put(key, i);
			}
			//最终放置最后一个
			end.put(key,i);
			count.put(key, count.getOrDefault(key, 0) + 1);
		}
		
		//求出值中最大值
		int counts = Collections.max(count.values());
		int ans = nums.length;
		//遍历count中key
		for(int key:count.keySet()) {
			if(counts==count.get(key)) {
				ans = Math.min(ans, end.get(key)-start.get(key)+1);
			}
		}
		return ans;
		
    }
}
