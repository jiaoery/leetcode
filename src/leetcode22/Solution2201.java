package leetcode22;

import java.util.Collections;
import java.util.HashMap;

/**
 * @ClassName: leetcode2201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��19�� ����2:35:46 
 */
public class Solution2201 {
	public int findShortestSubArray(int[] nums) {
		//��������λ�ò����Լ�Ԫ�س��ִ���
		HashMap<Integer, Integer> start =new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> end = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		//ͳ������
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			//δ�����򱣴�
			if(!start.containsKey(key)) {
				start.put(key, i);
			}
			//���շ������һ��
			end.put(key,i);
			count.put(key, count.getOrDefault(key, 0) + 1);
		}
		
		//���ֵ�����ֵ
		int counts = Collections.max(count.values());
		int ans = nums.length;
		//����count��key
		for(int key:count.keySet()) {
			if(counts==count.get(key)) {
				ans = Math.min(ans, end.get(key)-start.get(key)+1);
			}
		}
		return ans;
		
    }
}
