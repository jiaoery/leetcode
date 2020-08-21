package leetcode24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Solution2401.java
 * @Description:����Map
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��21�� ����10:30:04 
 */
public class Solution2401 {
	public List<Integer> findDuplicates(int[] nums) {
		HashMap<Integer, Integer> hashMap =new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for(int n:nums) {
			//hash���Ѱ�����˵���ظ�
			if(hashMap.containsKey(n)) {
				result.add(n);
			}else {
				hashMap.put(n, 1);
			}
		}
		return result;
    }
}
