package leetcode16;

/**
 * @ClassName: Solution1601.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月10日 上午10:28:52
 */
public class Solution1601 {
	public int countBinarySubstrings(String s) {
		//上次记录last,当前总和ans
		int index=0,n=s.length(),last = 0, ans = 0;
		while(index<n) {
			//记录此次0或1出现的次数
			int count = 0;
			//每次取一个char
			char c = s.charAt(index);
			while(index<n&&s.charAt(index) == c) {
				index++;
				count++;
			}
			//取前后值最小值
			ans += Math.min(last,count);
			//将当前统计次数记录
			last =count;
		}
		return ans;
	}
}
