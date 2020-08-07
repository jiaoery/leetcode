package leetcode14;

/**
 * @ClassName: Solution1401.java
 * @Description:递归算法，但是耗时高。n!次运算
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月6日 上午10:20:26 
 */
public class Solution1401 {
	public int fib(int n) {
		if(n ==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return (fib(n-1)+fib(n-2))%1000000007;
    }
}
