package leetcode53;


/**
 * @ClassName: Solution5302.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年10月21日 上午10:26:11 
 */
public class Solution5302 {
	
	public static boolean detectCapitalUse(String word) {
		// ^ 开始符号 + 前面的表达式会出现一次或多次 $结束表示符 | 平级条件，类似语言中or的意思  [a-z]小写 [A-Z]大写
		String pattern = "^[A-Z]+$|^[a-z]+$|^[A-Z][a-z]+$";
		return word.matches(pattern);
    }
	
	public static void main(String[] args) {
		System.out.println("test1: USA , reuslt "+ detectCapitalUse("USA"));
		System.out.println("test2: FlaG , reuslt "+ detectCapitalUse("FlaG"));
		System.out.println("test3: Google , reuslt "+ detectCapitalUse("Google"));
	}

}
