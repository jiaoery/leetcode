package leetcode87;

/**
 * @ClassName: Solution8701.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月18日 下午5:39:52 
 */
public class Solution8701 {

	public int myAtoi(String str) {
		char[] ch =  str.toCharArray();
		//是否为负数
		boolean isNegative = false;
		//当前位置
		int index = 0;
		//若超域或者为空格，继续向又移动
		while(index<ch.length&&ch[index]==' ') {
			index++;
		}
		//超域返回0
		if(index == ch.length) {
			return 0 ;
		}
		if(ch[index]=='-') {
			//负号
			isNegative = true;
			index++;
		}else if (ch[index]=='+') {
			index++;
		}else if (!Character.isDigit(ch[index])) {
			//第一个字符为非数字字符
			return 0;
		}
		int result = 0;
		
		//判断是否超域，是否为数字
		while (index<ch.length&&Character.isDigit(ch[index])) {
			//通过相对于0的位置获取数字（比Integer更快）
			int current = ch[index] - '0';
			//判断是否超域
			if(result>(Integer.MAX_VALUE- current)/10) {
				return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
			}
			//累计结果
			result = result*10+current;
			index++;
		}
		
		return isNegative?-1*result:result;
    }
	
	public static void main(String[] args) {
		Solution8701 solution8701 = new Solution8701();
		String str1 = "42";
		System.out.println("Input :"+str1+", result:"+solution8701.myAtoi(str1));
		
		String str2 = "   -42";
		System.out.println("Input :"+str2+", result:"+solution8701.myAtoi(str2));
		
		
		String str3 = "4193 with words";
		System.out.println("Input :"+str3+", result:"+solution8701.myAtoi(str3));
		
		String str4 = "words and 987";
		System.out.println("Input :"+str4+", result:"+solution8701.myAtoi(str4));
		
		String str5 = "";
		System.out.println("Input :"+str5+", result:"+solution8701.myAtoi(str5));
		
		String str6 = "-";
		System.out.println("Input :"+str6+", result:"+solution8701.myAtoi(str6));
		
		String str7 = "+44";
		System.out.println("Input :"+str7+", result:"+solution8701.myAtoi(str7));
		
		String str8 = "2147483648";
		System.out.println("Input :"+str8+", result:"+solution8701.myAtoi(str8));
	}
}
