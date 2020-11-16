package leetcode66;

import java.util.HashMap;

/**
 * @ClassName: Solution6601.java
 * @Description:HashMap �ֵ�ͳ��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��16�� ����11:29:25 
 */
public class Solution6601 {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			//�������ַ�������
			if(!map.containsKey(ch)) {
				return false;
			}
			int count  = map.get(ch);
			//�ֵ��ַ�����
			if(count == 0) {
				return false;
			}
			map.put(ch, --count);
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		Solution6601 sol = new Solution6601();
		System.out.println("a , b "+sol.canConstruct("a", "b"));
		System.out.println("aa , ab "+sol.canConstruct("aa", "ab"));
		System.out.println("aa , aab "+sol.canConstruct("aa", "aab"));
	}
}
