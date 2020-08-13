package leetcode18;

/**
 * @ClassName: Solution1801.java
 * @Description:�ַ������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��13�� ����10:17:45
 */
public class Solution1801 {

	/**
	 * �������
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		// ������
		String result = "";
		for (int i = num2.length() - 1; i >= 0; i--) {
			// ��λ����
			int carry = 0;
			// ���� num2 ��iλ������ num1 ��˵Ľ��
			StringBuilder temp = new StringBuilder();
			// �� 0
			for (int j = 0; j < num2.length() - 1 - i; j++) {
				temp.append(0);
			}
			int n2 = num2.charAt(i) - '0';
			// ��num1���
			for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
				int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
				// ��ǰλ�Ľ��
				int product = (n1 * n2 + carry) % 10;
				// ȡ��λ
				carry = (n1 * n2 + carry) / 10;
				temp.append(product);
			}
			// ����ǰ������¼���Ľ�������Ϊ�µĽ��
			result = addStrings(result, temp.reverse().toString());
		}
		return result;
	}

	/**
	 * �������
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		// ��λ
		int carry = 0;
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		//�Ƿ��������
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
