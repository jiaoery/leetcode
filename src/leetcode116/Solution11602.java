package leetcode116;

/**
 * @ClassName: Solution11602.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��2��1�� ����5:55:24 
 */
public class Solution11602 {
	public boolean hasAlternatingBits(int n) {
		//111111
		int temp=n^(n>>1);
		//λ��ȫΪ1�Ľ���˼·
		return (temp&(temp+1))==0;
	}
}
