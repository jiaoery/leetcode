package leetcode116;

/**
 * @ClassName: Solution11602.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年2月1日 下午5:55:24 
 */
public class Solution11602 {
	public boolean hasAlternatingBits(int n) {
		//111111
		int temp=n^(n>>1);
		//位数全为1的解题思路
		return (temp&(temp+1))==0;
	}
}
