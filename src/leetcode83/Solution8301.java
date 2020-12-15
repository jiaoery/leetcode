package leetcode83;

/**
 * @ClassName: Solution8301.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��12��15�� ����11:11:43
 */
public class Solution8301 {

	/**
	 * (a1+b1i)(a2+b2i)=(a1a2-b1b2)+(a2b1+a1b2)i
	 * @param a
	 * @param b
	 * @return
	 */
	public String complexNumberMultiply(String a, String b) {
		// �ֽ��ַ���
		String[] splita = a.split("\\+");
		String[] splitb = b.split("\\+");
		
		int a1 = Integer.parseInt(splita[0]);
		int b1 = Integer.parseInt(splita[1].replace("i", ""));
		
		int a2 = Integer.parseInt(splitb[0]);
		int b2 = Integer.parseInt(splitb[1].replace("i", ""));
//		System.out.println("a1:"+a1+",b1:"+b1+"a2:"+a2+",b2:"+b2);
		return (a1*a2-b1*b2)+"+"+(a2*b1+a1*b2)+"i";
	}
	
	public static void main(String[] args) {
		Solution8301 solution8301 = new Solution8301();
		System.out.println(solution8301.complexNumberMultiply("1+1i", "0+-0i"));
	}
}
