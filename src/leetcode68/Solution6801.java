package leetcode68;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @ClassName: Solution6801.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月17日 上午10:50:53
 */
public class Solution6801 {

	public String frequencySort(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		//使用优先级队列
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
		maxHeap.addAll(map.keySet());
		
		//根据优先顺出队列
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
