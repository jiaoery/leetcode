package leetcode14;

/**
 * @ClassName: Solution1402.java
 * @Description:���仯�ݹ鷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��6�� ����10:46:30 
 */
public class Solution1402 {
	public static int fib(int n) {
		int[] record = new int[n+1];
		record[0] = 0;
		if(n>0) {
			record[1]=1;
		}
		for(int i =2;i<n+1;i++) {
			record[i]=(record[i-1]+record[i-2])%1000000007;
		}
		return record[n];
    }
	
	public static void main(String[] args) {
		int index =46;
		System.out.println("input  "+index+",result "+fib(index));
	}
}
