package leetcode54;

public class Solution5401 {
	public static boolean isPalindrome(String s) {
		int length = s.length();
		// 左右指针
		int left = 0;
		int right = length - 1;

		while (left < right) {
			// 取到左指针为数字或字母为止
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			//右指针同上
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			if(left<right) {
				//是否字符相同
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
