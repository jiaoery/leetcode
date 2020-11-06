package leetcode59;

/**
 * @ClassName: Solution5901.java
 * @Description:�ָ��ַ��� ʱ�临�Ӷ� O��n���Ϳռ临�Ӷ�O��n��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��6�� ����11:09:31 
 */
public class Solution5901 {

	public static int lengthOfLastWord(String s) {
		String trim = s.trim();
		if(trim.equals("")) {
			return 0 ;
		}
		String[] words = trim.split("\\s+");
		return words[words.length-1].length();
		
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}
}
