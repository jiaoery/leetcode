package leetcode118;

/**
 * @ClassName: Solution11801.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021��2��5�� ����2:16:15
 */
public class Solution11801 {
	public int equalSubstring(String s, String t, int maxCost) {
		int size = s.length();
		int[] arrs = new int[size];
		// �������о���
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = Math.abs(s.charAt(i) - t.charAt(i));
		}
		
		//��СֵΪ0
		int maxlength = 0;
		//˫ָ��
		int left = 0,right=0;
		int sum  = 0;
		while (right<size) {
			sum += arrs[right];
			//��ָ��λ��
			while (sum>maxCost) {
				sum-=arrs[left++];
			}
			maxlength = Math.max(maxlength, right - left + 1);
			right++;
		}
		return maxlength;
	}
	
	
	public static void main(String[] args) {
		Solution11801 solution =  new Solution11801();
		String s1 = "",t1 = "";
		int cost1 = 2;
		System.out.println(solution.equalSubstring(s1, t1, cost1));
		
		String s2 = "abcd",t2 = "bcdf";
		int cost2 = 3;
		System.out.println(solution.equalSubstring(s2, t2, cost2));
	}
}
