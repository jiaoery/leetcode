package leetcode100;

/**
 * @ClassName: Solution10001.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月11日 下午4:57:59 
 */
public class Solution10001 {
	public String addBinary(String a, String b) {
		if(a==null||a.length()==0)return b;
		if(b==null||b.length()==0)return a;
		
		//存储进位
		int temp = 0;
		StringBuilder result = new StringBuilder();
		int i = a.length() - 1;
        int j = b.length() - 1;
		while (i>=0 || j>=0) {
			if(i >= 0) temp += a.charAt(i --) - '0';
            if(j >= 0) temp += b.charAt(j --) - '0';
			result.append(temp%2);
			temp >>=1;
		}
		
		if(temp>0) {
			result.append(temp);
		}
		
		return result.reverse().toString();
    }
	
	public static void main(String[] args) {
		Solution10001 solution =new Solution10001();
		String a1= "",b1="";
		System.out.println("a:"+a1+",b:"+b1+",plus:"+solution.addBinary(a1, b1));
		
		String a2= "11",b2="11";
		System.out.println("a:"+a2+",b:"+b2+",plus:"+solution.addBinary(a2, b2));
		
		String a3= "11",b3="1";
		System.out.println("a:"+a3+",b:"+b3+",plus:"+solution.addBinary(a3, b3));
	}
}
