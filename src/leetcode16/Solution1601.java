package leetcode16;

/**
 * @ClassName: Solution1601.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��10�� ����10:28:52
 */
public class Solution1601 {
	public int countBinarySubstrings(String s) {
		//�ϴμ�¼last,��ǰ�ܺ�ans
		int index=0,n=s.length(),last = 0, ans = 0;
		while(index<n) {
			//��¼�˴�0��1���ֵĴ���
			int count = 0;
			//ÿ��ȡһ��char
			char c = s.charAt(index);
			while(index<n&&s.charAt(index) == c) {
				index++;
				count++;
			}
			//ȡǰ��ֵ��Сֵ
			ans += Math.min(last,count);
			//����ǰͳ�ƴ�����¼
			last =count;
		}
		return ans;
	}
}
