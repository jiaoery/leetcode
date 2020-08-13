package leetcode18;

/**
 * @ClassName: Solution1802.java
 * @Description:优化竖式
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月13日 下午2:14:53
 */
public class Solution1802 {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int[] result = new int[num1.length() + num2.length()];
		// num1从右往左取值
		for (int i = num1.length() - 1; i >= 0; i--) {
			int n1 = num1.charAt(i) - '0';
			for (int j = num2.length() - 1; j >= 0; j--) {
				int n2 = num2.charAt(j) - '0';
				int sum = (result[i + j + 1] + n1 * n2);
				result[i + j + 1] = sum % 10;
				result[i + j] += sum / 10;
			}
		}
		
		StringBuilder res = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) continue;
            res.append(result[i]);
        }
        return res.toString();

	}
}
