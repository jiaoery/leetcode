package leetcode112;

/**
 * @ClassName: Solution11201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��1��28�� ����11:29:31
 */
public class Solution11201 {

	public int hammingDistance(int x, int y) {
		//���
		int z = x ^ y;
		int sum = 0;
		while (z>0){
			sum += z & 1;
			z = z>>1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Solution11201 solution =  new Solution11201();
		int x1 = 1,y1 = 5;
		System.out.println(solution.hammingDistance(x1, y1));
		
		int x2 = 0,y2 = 1024;
		System.out.println(solution.hammingDistance(x2, y2));
	}
}
