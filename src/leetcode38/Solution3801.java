package leetcode38;

/**
 * @ClassName: Solution3801.java
 * @Description:����+����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��15�� ����10:37:13 
 */
public class Solution3801 {
	
	 public int maxCount(int m, int n, int[][] ops) {
		 for(int[] op:ops){
		        m = Math.min(op[0],m);
		        n = Math.min(op[1],n);
		    }
		    return m*n;
	    }
}
