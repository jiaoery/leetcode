package leetcode07;

/**
 * @ClassName: Solution0702.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年7月24日 下午2:01:26
 */
public class Solution0702 {

	public boolean divisorGame(int N) {
		boolean[] f = new boolean[N + 5];
		//已知数据
		f[1] = false;
		f[2] = true;
		for (int i = 3; i <= N; ++i) {
			for (int j = 1; j < i; ++j) {
				//当存在可取数，且取得该数后，对方必定失败，则我方必胜
				if ((i % j) == 0 && !f[i - j]) {
					f[i] = true;
					break;
				}
			}
		}

		return f[N];
	}
}
