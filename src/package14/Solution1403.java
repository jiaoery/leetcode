package package14;

/**
 * @ClassName: Solution1403.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月6日 上午11:08:38 
 */
public class Solution1403 {
	
	
	public static int fib(int n) {
		if(n<2) {
			return n;
		}
		int constant = 1000000007;
		int first = 0;
		int second = 1;
		for(int i =2;i<n+1;i++) {
			int temp = second;
		    second = (first+second)%constant;
		    first =temp;
		}
		return second;
	}
}
