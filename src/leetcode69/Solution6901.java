package leetcode69;


/**
 * @ClassName: Solution691.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��11��18�� ����11:12:59
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
		// ����0ֻ�����ַ�z
		counts[0] = words['z' - 'a'];
		// ����2ֻ����w
		counts[2] = words['w' - 'a'];
		// ����4ֻ����u
		counts[4] = words['u' - 'a'];
		// ����6ֻ����x
		counts[6] = words['x' - 'a'];
		// ����8ֻ����g
		counts[8] = words['g' - 'a'];
		// ����3������hֻ�� 8�߱�
		counts[3] = words['h' - 'a'] - counts[8];
		// ����5������fֻ��4�߱�
		counts[5] = words['f' - 'a'] - counts[4];
		// ����7������sֻ��6�߱�
		counts[7] = words['s' - 'a'] - counts[6];
		// ����1������o 0,2��4���߱�
		counts[1] = words['o' - 'a'] - counts[0] - counts[2] - counts[4];
		// ����9������i 5 ,6,8���߱�
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
