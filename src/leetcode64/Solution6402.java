package leetcode64;

/**
 * @ClassName: Solution6402.java
 * @Description:˫ָ�� 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��13�� ����3:36:14 
 */
public class Solution6402 {

	 public static int firstUniqChar(String s) {
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 //ǰ���Ϊͬһ��λ��
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
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
