package leetcode115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Solution11501.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2021年2月1日 上午11:00:03
 */
public class Solution11501 {
	public int[] fairCandySwap(int[] A, int[] B) {
		int sumA = Arrays.stream(A).sum();
		int sumB = Arrays.stream(B).sum();
		// 两者距离
		int distance = (sumA - sumB) / 2;
		int[] ans = new int[2];
		//保存A中参数
		Set<Integer> set = new HashSet<Integer>();
		for (int num : A) {
			set.add(num);
		}
		for (int i = 0; i < B.length; i++) {
			int x= B[i]+distance;
			//A中是否有B交换的对应元素
			if(set.contains(x)) {
				ans[0] = x;
				ans[1] = B[i];
				return ans;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Solution11501 solution =  new Solution11501();
		int[] A1 = {1,1}, B1 = {2,2};
		System.out.println(Arrays.toString(solution.fairCandySwap(A1, B1)));
		
		int[] A2 = {1,1}, B2 = {1,20};
		System.out.println(Arrays.toString(solution.fairCandySwap(A2, B2)));
	}
}
