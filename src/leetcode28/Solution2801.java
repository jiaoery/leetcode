package leetcode28;

/**
 * @ClassName: Solution2801.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月24日 上午11:04:20
 */
public class Solution2801 {

	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i * 2 < n; i++) {
			// 字串的长度一定是原字符串长度的倍数
			if (n % i == 0) {
				boolean match = true;
				for (int j = i; j < n; j++) {
					// s'一定是s的前缀且s[i]=s[i-n']
					if (s.charAt(j) != s.charAt(j - i)) {
						match = false;
						break;
					}
				}
				//如果全部匹配，则返回true
				if(match) {
					return true;
				}

			}
		}
		return false;

	}
}
