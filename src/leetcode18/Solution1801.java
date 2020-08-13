package leetcode18;

/**
 * @ClassName: Solution1801.java
 * @Description:字符串相乘
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月13日 上午10:17:45
 */
public class Solution1801 {

	/**
	 * 两数相乘
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		// 保存结果
		String result = "";
		for (int i = num2.length() - 1; i >= 0; i--) {
			// 进位保存
			int carry = 0;
			// 保存 num2 第i位数字与 num1 相乘的结果
			StringBuilder temp = new StringBuilder();
			// 补 0
			for (int j = 0; j < num2.length() - 1 - i; j++) {
				temp.append(0);
			}
			int n2 = num2.charAt(i) - '0';
			// 与num1相乘
			for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
				int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
				// 求当前位的结果
				int product = (n1 * n2 + carry) % 10;
				// 取进位
				carry = (n1 * n2 + carry) / 10;
				temp.append(product);
			}
			// 将当前结果与新计算的结果求和作为新的结果
			result = addStrings(result, temp.reverse().toString());
		}
		return result;
	}

	/**
	 * 两数相加
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		// 进位
		int carry = 0;
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		//是否继续运算
		while(i>=0||j>=0||carry>0) {
			int n1=i>=0?num1.charAt(i)-'0':0;
			int n2=j>=0?num2.charAt(j)-'0':0;
			int temp = (n1+n2+carry)%10;
			carry = (n1+n2+carry)/10;
			result.append(temp);
			i--;j--;
		}
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println("result:"+new Solution1801().multiply("34", "69"));
	}
}
