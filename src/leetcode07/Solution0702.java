package leetcode07;

/**
 * @ClassName: Solution0702.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��7��24�� ����2:01:26
 */
public class Solution0702 {

	public boolean divisorGame(int N) {
		boolean[] f = new boolean[N + 5];
		//��֪����
		f[1] = false;
		f[2] = true;
		for (int i = 3; i <= N; ++i) {
			for (int j = 1; j < i; ++j) {
				//�����ڿ�ȡ������ȡ�ø����󣬶Է��ض�ʧ�ܣ����ҷ���ʤ
				if ((i % j) == 0 && !f[i - j]) {
					f[i] = true;
					break;
				}
			}
		}

		return f[N];
	}
}
