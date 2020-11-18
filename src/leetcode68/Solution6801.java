package leetcode68;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @ClassName: Solution6801.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��17�� ����10:50:53
 */
public class Solution6801 {

	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		//ʹ�����ȼ�����
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
		maxHeap.addAll(map.keySet());
		
		//��������˳������
		StringBuilder res = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char key = maxHeap.poll();
            int value = map.get(key);
            for (int i = 0; i < value; i++) {
                res.append(key);
            }
        }
        return res.toString();
		
	}
}
