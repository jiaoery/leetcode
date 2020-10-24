package leetcode54;

public class Solution5401 {
	public static boolean isPalindrome(String s) {
		int length = s.length();
		// ����ָ��
		int left = 0;
		int right = length - 1;

		while (left < right) {
			// ȡ����ָ��Ϊ���ֻ���ĸΪֹ
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			//��ָ��ͬ��
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			if(left<right) {
				//�Ƿ��ַ���ͬ
				if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
			}

		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		System.out.println("str1 is palindrome:"+isPalindrome(str1));
		System.out.println("str2 is palindrome:"+isPalindrome(str2));
	}
}
