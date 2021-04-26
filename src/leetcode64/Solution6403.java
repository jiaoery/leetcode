package leetcode64;

/**
 * @ClassName: Solution6403.java
 * @Description:26��ĸ����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��13�� ����4:03:57 
 */
public class Solution6403 {
	public static int firstUniqChar(String s) {
		int[] words = new int[26];
		//ͳ��ÿ���ַ����ֵĴ���
		for (int i = 0; i < s.length(); i++) {
			words[s.charAt(i)-'a']+=1;
		}
		
		//�ó�����
		for (int i = 0; i < s.length(); i++) {
			if(words[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}
	
	 public static void main(String[] args) {
			String s = "leetcode123";
			System.out.println("position:"+firstUniqChar(s));
			
			String s1 = "loveleetcode";
			System.out.println("position:"+firstUniqChar(s1));
			
			String s2 = "cc";
			System.out.println("position:"+firstUniqChar(s2));
		}
}
