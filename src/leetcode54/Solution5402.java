package leetcode54;

public class Solution5402 {
	
	
	public static boolean isPalindrome(String s) {
		//缓存符合条件的字符串
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				stringBuffer.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		//对比反转是否有效
		return stringBuffer.toString().equals(stringBuffer.reverse().toString());
	}
	
	
	public static void main(String[] args) {
		String str1 = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		System.out.println("str1 is palindrome:"+isPalindrome(str1));
		System.out.println("str2 is palindrome:"+isPalindrome(str2));
	}

}
