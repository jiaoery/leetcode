package leetcode90;

/**
 * @ClassName: Solution9001.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月22日 上午10:40:43 
 */
public class Solution9001 {

	public String intToRoman(int num) {
		int[] keys = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < keys.length; i++) {
			while (num>=keys[i]) {
				result.append(values[i]);
				num -= keys[i];
			}
		}
		return result.toString();
    }
	
	public static void main(String[] args) {
		Solution9001 solution9001 =new Solution9001();
		int num1 = 3;
		System.out.println("Nums :"+num1+",Roman:"+solution9001.intToRoman(num1));
		
		int num2 = 4;
		System.out.println("Nums :"+num2+",Roman:"+solution9001.intToRoman(num2));
		
		int num3 = 9;
		System.out.println("Nums :"+num3+",Roman:"+solution9001.intToRoman(num3));
		
		int num4 = 58;
		System.out.println("Nums :"+num4+",Roman:"+solution9001.intToRoman(num4));
		
		int num5 = 1994;
		System.out.println("Nums :"+num5+",Roman:"+solution9001.intToRoman(num5));
	}
}
