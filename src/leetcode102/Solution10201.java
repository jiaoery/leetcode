package leetcode102;

/**
 * @ClassName: Solution10201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月13日 下午6:11:39 
 */
public class Solution10201 {
	public String convert(String s, int numRows) {
		//特殊情况
		if(numRows==1||numRows>s.length()){
            return s;
        }
		int distance = 2*(numRows-1);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			int index = i;
			//第一行或最后一列，距离为distance的距离
			if(i==0||i==numRows-1) {
				while (index<s.length()) {
					result.append(s.charAt(index));
					index+=distance;			
				}
			}else {
				int match = distance - 2*i;
				while (index < s.length()) {
					result.append(s.charAt(index));
					index += match;
					match = distance - match;		
				}
			}
		}
		return result.toString();
    }
	
	
	public static void main(String[] args) {
		Solution10201 solution = new Solution10201();
		String s1 = "ILOVEYOU";int rows1 = 1;
		System.out.println("S:"+s1+",Row:"+rows1+";result:"+solution.convert(s1, rows1));
		
		String s2 = "ILOVEYOU";int rows2 = 10;
		System.out.println("S:"+s2+",Row:"+rows2+";result:"+solution.convert(s2, rows2));
		
		
		String s3 = "PAYPALISHIRING";int rows3 = 3;
		System.out.println("S:"+s3+",Row:"+rows3+";result:"+solution.convert(s3, rows3));
		
		String s4 = "PAYPALISHIRING";int rows4 = 4;
		System.out.println("S:"+s4+",Row:"+rows4+";result:"+solution.convert(s4, rows4));
	}
}
