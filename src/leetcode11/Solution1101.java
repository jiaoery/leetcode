package leetcode11;

/**
 * @ClassName: Solution1101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��3�� ����11:08:32 
 */
public class Solution1101 {

	public static String addStrings(String num1, String num2) {
        StringBuilder sb =new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        //ȷ���Ƿ���λ��
        while(i>=0||j>=0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            sb.append(tmp % 10);
            i--; j--;
        }
        if(carry==1){
            sb.append(carry);
        }
        //����ת�����
         return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		String num1 = "010";
		String num2 = "082";
		String res = addStrings(num1, num2);
        System.out.println("num1:"+num1+"num2:"+num2+"result:"+res);
	}
}
