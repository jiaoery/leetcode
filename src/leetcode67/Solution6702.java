package leetcode67;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Solution6702.java
 * @Description:素数法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月16日 下午3:43:14 
 */
public class Solution6702 {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<Long, List<String>> map =  new HashMap<Long, List<String>>();
		//26个素数
		long[] remark = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
		for (String str : strs) {
			char[] chars = str.toCharArray();
			long key = 1;
			for (int i = 0; i < chars.length; i++) {
				key *= remark[chars[i]-'a'];
			}
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			//添加数据
			map.get(key).add(str);
		}
		
		return new ArrayList<List<String>>(map.values());
	}
	
	public static void main(String[] args) {
		Solution6701 sol = new Solution6701();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> reList = sol.groupAnagrams(strs);
		for (int i = 0; i < reList.size(); i++) {
			System.out.println(reList.get(i));
		}
		
	}

}
