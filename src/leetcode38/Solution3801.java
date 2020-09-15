package leetcode38;

/**
 * @ClassName: Solution3801.java
 * @Description:几何+区间
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月15日 上午10:37:13 
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
