package leetcode67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: Solution6701.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��16�� ����3:24:54
 */
public class Solution6701 {

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map =  new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] ch = strs[i].toCharArray();
			//����
			Arrays.sort(ch);
			//��ȡkeyֵ
			String key = new String(ch);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			//�������
			map.get(key).add(strs[i]);
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
