package leetcode24;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution2402.java
 * @Description:����ռ䷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��21�� ����10:36:54 
 */
public class Solution2402 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for(int n:nums) {
			if(nums[Math.abs(n)-1]>0) {
				nums[Math.abs(n)-1]*=-1;
			}else {//��ǰλ�õ�����λ���顶0���ظ�������result�����
				result.add(Math.abs(n));
			}
		}
		
		return result;
		
	}
}
