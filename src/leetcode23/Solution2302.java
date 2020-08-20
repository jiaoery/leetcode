package leetcode23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Solution2302.java
 * @Description:Hash�洢��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��20�� ����11:00:07 
 */
public class Solution2302 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashMap<Integer, Integer> hashMap =new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		//������ѯ
		for(int n:nums) {
			hashMap.put(n,hashMap.getOrDefault(n, 0)+1);
		}
		//�����Ƿ��ж�Ӧ����
		for(int i=1;i<nums.length;i++) {
			//δ������������result������
			if(!hashMap.containsKey(i)) {
				result.add(i);
			}
		}
		return result;
		
	}
}
