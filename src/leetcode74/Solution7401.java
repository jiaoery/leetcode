package leetcode74;

/**
 * @ClassName: Solution7401.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月24日 上午10:51:56 
 */
public class Solution7401 {
	public String getHint(String secret, String guess) {
		int[] nums = new int[10];
		int countA=0,countB=0;
		for (int i = 0; i < secret.length(); i++) {
			char sec = secret.charAt(i);
			char gue = guess.charAt(i);
			//若对应位置 guess字符和secret字符相同,A的情况加一
			if(sec == gue) {
				countA++;
			}else {
				//之前guess已经出现过这个字符
				if(nums[gue-'0']<0) {
					countB++;
				}
				nums[gue-'0']++;
				//之前secret已经出现过了
				if(nums[sec-'0']>0) {
					countB++;
				}
				nums[sec-'0']--;
			}
		}
		return countA+"A"+countB+"B";
    }
	
	public static void main(String[] args) {
		Solution7401 sol = new Solution7401();
		String secret = "1807",guess = "7810";
		System.out.println("secret:"+secret+",guess:"+guess+";after:"+sol.getHint(secret, guess));
		
		String secret1 = "1123",guess1 = "0111";
		System.out.println("secret:"+secret1+",guess:"+guess1+";after:"+sol.getHint(secret1, guess1));
		
		String secret2 = "1",guess2 = "0";
		System.out.println("secret:"+secret2+",guess:"+guess2+";after:"+sol.getHint(secret2, guess2));
		
		String secret3 = "1",guess3 = "1";
		System.out.println("secret:"+secret3+",guess:"+guess3+";after:"+sol.getHint(secret3, guess3));
	}
}
