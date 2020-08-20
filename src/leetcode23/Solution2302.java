package leetcode23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Solution2302.java
 * @Description:Hash存储法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月20日 上午11:00:07 
 */
public class Solution2302 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashMap<Integer, Integer> hashMap =new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		//遍历查询
		for(int n:nums) {
			hashMap.put(n,hashMap.getOrDefault(n, 0)+1);
		}
		//查找是否有对应的数
		for(int i=1;i<nums.length;i++) {
			//未包含的数放入result集合中
			if(!hashMap.containsKey(i)) {
				result.add(i);
			}
		}
		return result;
		
	}
}
