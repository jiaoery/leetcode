package leetcode85;

/**
 * @ClassName: Solution8501.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年12月17日 上午10:44:36
 */
public class Solution8501 {

	public String countAndSay(int n) {
		
		// 边界条件
		if (n < 1) {
			return "";
		}
		if (n == 1) {
			return "1";
		}
		//动态规划数组
		String[] dp = new String[n+1];
		dp[1] = "1";
		dp[2] = "11";
		//动态规划
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dpIndex(dp[i-1]);
		}
		return dp[n];
	}
	
	/**
	 * 
	 * @param front 前一个字符
	 * @return
	 */
	public String dpIndex(String front) {
		 StringBuilder ans = new StringBuilder();
		 int count =1;
		 for (int i = 1; i < front.length(); i++) {
			if(front.charAt(i)==front.charAt(i-1)) {
				count++;
			}else {
				ans.append(count);
				ans.append(front.charAt(i-1));
				count = 1;
			}
			if (i == front.length()-1) {
				ans.append(count);
				ans.append(front.charAt(i));
			}
		}
		 return ans.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		Solution8501 solution8501 = new Solution8501();
		for (int i = 0; i <= 10; i++) {
			System.out.println(solution8501.countAndSay(i));	
		}
		
	}
}
