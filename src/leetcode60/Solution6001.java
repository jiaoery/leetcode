package leetcode60;

import java.util.Arrays;

/**
 * @ClassName: Solution6001.java
 * @Description:双指针算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月10日 上午11:17:37 
 */
public class Solution6001 {
	
	 public static void reverseString(char[] s) {
		 if(s==null) {
			 return;
		 }
		 int left = 0;
		 int right = s.length-1;
		 //双指针交换
		 while (right>left) {
			 char temp = s[left];
			 s[left] = s[right];
			 s[right] =temp;			 
			 left++;
			 right--;
		}
	}
	 
	 public static void main(String[] args) {
		char[] s1 = {'h','e','l','l','o'};
		char[] s2 = {'H','a','n','n','a','h'};
		
		System.out.println("s1 before :"+Arrays.toString(s1));
		reverseString(s1);
		System.out.println("s1 after :"+Arrays.toString(s1));
		
		
		System.out.println("s2 before :"+Arrays.toString(s2));
		reverseString(s2);
		System.out.println("s2 after :"+Arrays.toString(s2));
	}
}
