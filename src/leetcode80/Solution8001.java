package leetcode80;

/**
 * @ClassName: Solution8001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年12月10日 上午10:54:17
 */
public class Solution8001 {
	public boolean lemonadeChange(int[] bills) {
		// 分別用來存5，10，20的剩余数量
		int[] nums = new int[3];
		for (int num : bills) {
			if (num == 5) {// 5元
				nums[0]++;
			} else if (num == 10) {// 10元
				nums[1]++;
				nums[0]--;
			} else if (num == 20 && nums[1] > 0) {// 20元,且有10元的
				nums[2]++;
				nums[1]--;
				nums[0]--;
			} else {// 三张5元
				nums[2]++;
				nums[0] -= 3;
			}
			// 检测是否无法补足
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < 0) {
					return false;
				}
			}
		}
		return true;
	}

	public String getSmallestString(int n, int k) {
		char[] ch = new char[n];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = 'a';
		}
		// 完全相等
		if (n < k) {
			k -= n;
			int index = n-1;
			while (k > 0) {
				// 从尾部追加字符z
				if (k > 25) {
					ch[index--] = 'z';
					k -= 25;
				} else {
					ch[index] = (char) ((int)'a' + k);
					break;
				}
			}
		}
		return new String(ch);

	}

	public static void main(String[] args) {
		
		Solution8001 sol = new Solution8001();
		System.out.println(sol.getSmallestString(5,73));
//		int[] nums1 = { 5, 5, 5, 10, 20 };
//		System.out.println("Nums1 :" + Arrays.toString(nums1) + sol.lemonadeChange(nums1));
//
//		int[] nums2 = { 5, 5, 10 };
//		System.out.println("Nums2 :" + Arrays.toString(nums2) + sol.lemonadeChange(nums2));
//
//		int[] nums3 = { 10, 10 };
//		System.out.println("Nums3 :" + Arrays.toString(nums3) + sol.lemonadeChange(nums3));
//
//		int[] nums4 = { 5, 5, 10, 10, 20 };
//		System.out.println("Nums4 :" + Arrays.toString(nums4) + sol.lemonadeChange(nums4));
//
//		int[] nums5 = { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5 };
//		System.out.println("Nums5 :" + Arrays.toString(nums5) + sol.lemonadeChange(nums5));
	}
}
