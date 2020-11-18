package leetcode69;


/**
 * @ClassName: Solution691.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年11月18日 上午11:12:59
 */
public class Solution6901 {

	public String originalDigits(String s) {
		// count letter
		int[] words = new int[26];
		for (int i = 0; i < s.length(); i++) {
			words[s.charAt(i) - 'a']++;
		}

		// building digit
		int[] counts = new int[10];
		// 数字0只包含字符z
		counts[0] = words['z' - 'a'];
		// 数字2只包含w
		counts[2] = words['w' - 'a'];
		// 数字4只包含u
		counts[4] = words['u' - 'a'];
		// 数字6只包含x
		counts[6] = words['x' - 'a'];
		// 数字8只包含g
		counts[8] = words['g' - 'a'];
		// 数字3包含的h只有 8具备
		counts[3] = words['h' - 'a'] - counts[8];
		// 数字5包含的f只有4具备
		counts[5] = words['f' - 'a'] - counts[4];
		// 数字7包含的s只有6具备
		counts[7] = words['s' - 'a'] - counts[6];
		// 数字1包含的o 0,2和4都具备
		counts[1] = words['o' - 'a'] - counts[0] - counts[2] - counts[4];
		// 数字9包含的i 5 ,6,8都具备
		counts[9] = words['i' - 'a'] - counts[5] - counts[6] - counts[8];

		// building result
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				stringBuilder.append(i);
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		Solution6901 sol = new Solution6901();
		System.out.println(sol.originalDigits("owoztneoer"));
	}
}
