package leetcode101;

/**
 * @ClassName: Solution10101.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月12日 上午11:25:57 
 */
public class Solution10101 {
	 public String licenseKeyFormatting(String S, int K) {
	        StringBuilder result = new StringBuilder();
	        //首先构建一个无"-"符号的字符串
	        for (int i = 0; i < S.length(); i++) {
	        	char index = S.charAt(i);
	        	if (index != '-') {
					result.append(index);
				}
			}
	        
	        for (int i = result.length()-K; i > 0; i-=K) {
				result.insert(i, '-');
			}
	        
	        return result.toString().toUpperCase();
	        
	    }
	 
	 public static void main(String[] args) {
		Solution10101 solution = new Solution10101();
		String s1 =  "5F3Z-2e-9-w";
		int k1 = 4;	
		System.out.println("S:"+s1+",K："+k1+";result:"+solution.licenseKeyFormatting(s1, k1));
		
		String s2 =  "2-5g-3-J";
		int k2 = 2;	
		System.out.println("S:"+s2+",K："+k2+";result:"+solution.licenseKeyFormatting(s2, k2));
	}
}
