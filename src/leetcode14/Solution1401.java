package leetcode14;

/**
 * @ClassName: Solution1401.java
 * @Description:�ݹ��㷨�����Ǻ�ʱ�ߡ�n!������
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��6�� ����10:20:26 
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
