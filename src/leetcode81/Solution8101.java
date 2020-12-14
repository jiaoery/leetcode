package leetcode81;

/**
 * @ClassName: Solution8001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年12月14日 上午11:22:39
 */
public class Solution8101 {

	/**
	 * 
	 * @param n 每次几行几列
	 * @param k 目标涂黑格数
	 * @return 方案个数
	 */
	public int paintingPlan(int n, int k) {
		// 为零或者全部涂满，只有一种方案
		if (k == 0 || n * n == k) {
			return 1;
		}
		// 因为涂一行和一列，都至少有n个黑格
		if (n > k) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if(i*n+j*n-i*j==k) {
					System.out.println(i+","+j+","+C(n,i)+","+C(n,j));
					result+= C(n,i)*C(n,j);
				}
			}
		}
		return result;
	}
	
	/**
	 * 求解组合Cxy
	 * @param x 大数
	 * @param y 小数
	 * @return
	 */
	 public int C(int x,int y){
	        if(y == 0)return 1;
	        int n = 1;
	        for(int i = 0;i < y;i++){
	            n *= (x - i);
	        }
	        for(int i = 1;i <= y;i++){
	            n /= i;
	        }
//	        System.out.println(n);
	        return n;
	    }
	 
	 
	 public static void main(String[] args) {
		Solution8101 solution8101 =  new Solution8101();
		System.out.println(solution8101.paintingPlan(2, 4));
	}
}
