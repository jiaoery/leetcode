package leetcode61;

/**
 * @ClassName: Solution6101.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月10日 下午2:36:36 
 */
public class Solution6101 {

	public static String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();
		int n = s.length();
		//分段
		for (int i = 0; i < n; i+=2*k) {
			int left = i;
			//判断右指针是否超域
			int right = i+k-1<n?i+k-1:n-1;
			//交换位置
			while (left<right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}
		return new String(chars);
    }
	
	
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2 ;
		System.out.println("Before :"+s+",After："+reverseStr(s, k));
	}
	
}
