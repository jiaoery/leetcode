package leetcode28;

/**
 * @ClassName: Solution2801.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��24�� ����11:04:20
 */
public class Solution2801 {

	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i * 2 < n; i++) {
			// �ִ��ĳ���һ����ԭ�ַ������ȵı���
			if (n % i == 0) {
				boolean match = true;
				for (int j = i; j < n; j++) {
					// s'һ����s��ǰ׺��s[i]=s[i-n']
					if (s.charAt(j) != s.charAt(j - i)) {
						match = false;
						break;
					}
				}
				//���ȫ��ƥ�䣬�򷵻�true
				if(match) {
					return true;
				}

			}
		}
		return false;

	}
}
