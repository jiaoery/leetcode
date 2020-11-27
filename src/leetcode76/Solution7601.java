package leetcode76;

/**
 * @ClassName: Solution7601.java
 * @Description:角谷猜想
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月26日 下午3:44:10 
 */
public class Solution7601 {
	/**
	 *  角谷猜想，也称为冰雹定理；当一个数为奇数 则n=n*3=1;当一个数为偶数，则n=n/2
	 * @return
	 */
	public static int collatzConjecture(int n) {
		//等于1时进入谷底
		if(n==1) {
			return 1;
		}
		//奇数
		if(n%2==1) {
			n=3*n+1;	
		}else {
			 n = n/2;	
		}
		System.out.print(n+"\t");
		return collatzConjecture(n);
	}
	
	public static void main(String[] args) {
		System.out.println(collatzConjecture(2));
	}
}
