package leetcode21;

import java.util.HashMap;

/**
 * @ClassName: Solution2103.java
 * @Description:使用map存储
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月18日 上午11:22:02 
 */
public class Solution2103 {
	public int[] findErrorNums(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int dup =-1,missing=1;
		for(int n:nums) {
			 map.put(n, map.getOrDefault(n, 0) + 1);
		}
		for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    dup = i;
            } else
                missing = i;
        }
        return new int[]{dup, missing};
	}
}
