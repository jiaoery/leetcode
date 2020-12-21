package leetcode89;

import java.util.HashMap;

/**
 * @ClassName: Solution8901.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��12��21�� ����3:15:54
 */
public class Solution8901 {
	/**
	 * �����ַ�תint
	 * 
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] strs = s.toCharArray();
		//�洢���
		int result = 0;
		for (int i = 0; i < strs.length; i++) {
			if(i<strs.length-1) {
				//��ǰ��ֵ
				int current = map.get(strs[i]);
				//��һ��������ֵ
				int next = map.get(strs[i+1]);
			
				if(current<next) {
					result =result - current;					
				}else {
					
					result += current;
				}
			}else {//���һλ
				result += map.get(strs[i]);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Solution8901 solution8901 = new Solution8901();
		String str1 = "III";
		System.out.println("Roman nums:"+str1+",after :"+solution8901.romanToInt(str1));
		
		String str2 = "IV";
		System.out.println("Roman nums:"+str2+",after :"+solution8901.romanToInt(str2));
		
		String str3 = "IX";
		System.out.println("Roman nums:"+str3+",after :"+solution8901.romanToInt(str3));
		
		String str4 = "LVIII";
		System.out.println("Roman nums:"+str4+",after :"+solution8901.romanToInt(str4));
		
		String str5 = "MCMXCIV";
		System.out.println("Roman nums:"+str5+",after :"+solution8901.romanToInt(str5));
	}
}
