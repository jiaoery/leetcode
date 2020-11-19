package leetcode70;

/**
 * @ClassName: Solution7001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月19日 下午2:53:24
 */
public class Solution7001 {
	public String modifyString(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			// 寻找符合条件的？
			if (chars[i] == '?') {
				// 替换字符
				char ch = 'a';
				// 对比左右字符是否相同
				while ((i > 0 && chars[i - 1] == ch) || (i < chars.length - 1 && chars[i + 1] == ch)) {
					ch++;
				}
				// 替换字符
				chars[i] = ch;
			}
		}
		return new String(chars);
	}
	
	
	public static void main(String[] args) {
		Solution7001 sol = new Solution7001();
		String s1 = "?zs";
		System.out.println("Before :"+s1+", After:"+sol.modifyString(s1));
		
		String s2 = "ubv?w";
		System.out.println("Before :"+s2+", After:"+sol.modifyString(s2));
		
		String s3 = "j?qg??b";
		System.out.println("Before :"+s3+", After:"+sol.modifyString(s3));
		
		String s4 = "??yw?ipkj?";
		System.out.println("Before :"+s4+", After:"+sol.modifyString(s4));
	}
}
