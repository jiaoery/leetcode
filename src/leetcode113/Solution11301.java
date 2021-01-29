package leetcode113;

/**
 * @ClassName: Solution11301.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月29日 上午10:47:58 
 */
public class Solution11301 {
	 public int calculate(String s) {
		 if(s.length()==0) {
			 return 1;
		 }
		 int x = 1,y=0;
		 for (int i = 0; i < s.length(); i++) {
			char index = s.charAt(i);
			if(index == 'A') {
				x = 2*x+y;
			}else if (index == 'B') {
				y = 2*y+x;
			}
		}
		 return x+y;
	 }
	 
	 
	 public static void main(String[] args) {
		Solution11301 solution =  new Solution11301();
		System.out.println(solution.calculate(""));
		System.out.println(solution.calculate("A"));		
		System.out.println(solution.calculate("ABABA"));
	}
}
