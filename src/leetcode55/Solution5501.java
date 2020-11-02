package leetcode55;

/**
 * @ClassName: Solution5501.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��10��30�� ����4:22:25 
 */
public class Solution5501 {
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null||strs.length==0) {
			return "";
		}		
		String result = strs[0];
		for (int i = 0; i < strs.length; i++) {
			int j =0;
			for (; j < strs[i].length()&&j<result.length(); j++) {
				if(result.charAt(j)!=strs[i].charAt(j)) {
					break;
				}
			}
			result = result.substring(0, j);
			if(result.equals("")) {
				return "";
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		String[] result = {"ab", "a"};
		System.out.println(longestCommonPrefix(result));
	}

}
